/*
 * esta clase se encarga de los metodos q le competen a el usuario
 * 
 */
package Logica;

import GUI.VistaPrincipalUsuarios;
import Modelo.Libro;
import Modelo.Prestamo;
import Modelo.Serializacion;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestorUsuario {

    public ArrayList<Usuario> usuarios;
    public GestorLibreria gestor;
    public Usuario usuario;
    public ArrayList<Libro> librosdis;

    public GestorUsuario(GestorLibreria gestor) {
        usuarios = new Serializacion().DeserializarUsuarios();
        this.gestor = gestor;
        new Serializacion().SerializarUsuarios(usuarios);
    }

//Este metodo crea un nuevo usuario y lo agrega a la lista usuarios
    public void CrearUsuario(String address, String name, int id, int number) {
        usuarios.add(new Usuario(address, name, id, number));
        new Serializacion().SerializarUsuarios(usuarios);
    }

    public void VistaAppUsuario(int idUsuario) {
        this.usuario = Usuario(idUsuario);
        LibresDipo();
        new VistaPrincipalUsuarios(this);
        RevisarPrestamo();
    }

//este metodo revisa los prestamos q ha echo el usuario
//y solo muestra los q no ha sacado prestados    
    public void LibresDipo() {
        ArrayList<Libro> libros = new Serializacion().DeserializarLibros();
        for (int i = 0; i < usuario.getPrestamo().size(); i++) {
            int j = 0;
            for (Libro libro : libros) {
                if (libro.getTitulo().equals(usuario.getPrestamo().get(i).getLibro().getTitulo())) {
                    libros.remove(j);
                    break;
                }
                j++;
            }
        }
        librosdis = libros;
    }

    //este metodo encuentra al usuario que inicio secion   
    public Usuario Usuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

//este metodo busca si un usuario exixte por su id            
    public boolean EncontrarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return true;
            }
        }
        return false;
    }

//este metodo me genera los prestamos tanto a nivel de usuario como
//en gestorlibreria
    public void GenerarPrestamo(String titulo, int libro) {
        LocalDate date = LocalDate.now();
        Month month = Month.of((date.getMonth().getValue()) + 1);
        LocalDate date2 = LocalDate.of(date.getYear(), month, date.getDayOfMonth());
        Prestamo prestamo
                = new Prestamo(librosdis.get(libro), usuario, date, date2, gestor.idRamdonPrestamo());
        gestor.prestamos.add(prestamo);
        usuario.getPrestamo().add(prestamo);
        gestor.EncontrarLibro(titulo).setDisponible(gestor.EncontrarLibro(titulo)
                .getDisponible() - 1);
        librosdis.remove(libro);
        new Serializacion().SerializarUsuarios(usuarios);
        new Serializacion().SerializarLibros(gestor.getLibros());
        new Serializacion().SerializarPrestamos(gestor.prestamos);
    }

//este metodo me genera la devolucion de un libro
//lo cuale elimina el prestamo de usauario y lo agrega a entragado de usuario
//si esta retrasado cuando se entrega en la observacion sale q se deve una multa
    public void GenerarDevolucion(int libro, int id, int idlibro) {
        usuario.getPrestamo().get(libro).setFechaEntregado(LocalDate.now());
        if (usuario.getPrestamo().get(libro).getObservacion().equalsIgnoreCase("RETRASADO")) {
            usuario.getPrestamo().get(libro).setObservacion("MULTA");
            gestor.EncontrarPrestamo(id).setObservacion("MULTA");
        } else {
            usuario.getPrestamo().get(libro).setObservacion("ENTREGADO");
            gestor.EncontrarPrestamo(id).setObservacion("ENTREGADO");
        }
        gestor.EncontrarLibro(idlibro).setDisponible(gestor.EncontrarLibro(idlibro)
                .getDisponible() + 1);
        usuario.getEstrega().add(usuario.getPrestamo().get(libro));
        usuario.getPrestamo().remove(libro);
        new Serializacion().SerializarUsuarios(usuarios);
        new Serializacion().SerializarPrestamos(gestor.prestamos);
        new Serializacion().SerializarLibros(gestor.getLibros());
        LibresDipo();
    }
//este metodo revisa todas las fechas de los prestamos 
//y revisa q todavia esten a tiempo de lo contrario cambia la observacion a 
//retardado

    public void RevisarPrestamo() {
        LocalDate hoy = LocalDate.now();
        for (Prestamo prestamo : usuario.getPrestamo()) {
            if (prestamo.getFechaEntrega().isBefore(hoy)) {
                prestamo.setObservacion("RETRASADO");
            }
        }
    }

}
