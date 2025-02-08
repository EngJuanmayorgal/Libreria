/*
 * 
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

    public void GenerarPrestamo(int libro) {
        LocalDate date = LocalDate.now();
        Month month = Month.of((date.getMonth().getValue()) + 1);
        LocalDate date2 = LocalDate.of(date.getYear(), month, date.getDayOfMonth());
        gestor.prestamos.add(new Prestamo(librosdis.get(libro), usuario, date, date2));
        usuario.getPrestamo().add(new Prestamo(librosdis.get(libro), usuario, date, date2));
        gestor.getLibros().get(libro).setDisponible(gestor.getLibros().get(libro).getDisponible() - 1);
        librosdis.remove(libro);
        new Serializacion().SerializarUsuarios(usuarios);
        new Serializacion().SerializarLibros(gestor.getLibros());
        new Serializacion().SerializarPrestamos(gestor.prestamos);
    }
//este metodo me genera la devolucion de un libro
//lo cuale elimina el prestamo de usauario y lo agrega a entragdo de usuario

    public void GenerarDevolucion(int libro, String title) {
        usuario.getPrestamo().get(libro).setFechaEntregado(LocalDate.MIN);
        usuario.getPrestamo().get(libro).setObservacion("ENTREGADO");
        gestor.prestamos.get(libro).setObservacion("ENTREGADO");               
        usuario.getEstrega().add(usuario.getPrestamo().get(libro));
        gestor.EncontrarLibro(usuario.getPrestamo().get(libro).getLibro().getTitulo())
                .setDisponible(gestor.EncontrarLibro(usuario.getPrestamo()
                        .get(libro).getLibro().getTitulo()).getDisponible() + 1);
        usuario.getPrestamo().remove(libro);
        new Serializacion().SerializarUsuarios(usuarios);
        new Serializacion().SerializarLibros(gestor.getLibros());
        LibresDipo();
    }

}
