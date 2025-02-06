/*
 * 
 * 
 */
package Logica;

import GUI.VistaPrincipalUsuarios;
import Modelo.Libro;
import Modelo.Prestamo;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestorUsuario {

    public ArrayList<Usuario> usuarios;
    public GestorLibreria gestor;
    public ArrayList<Libro> librosdis;
    public ArrayList<Libro> librospres;
    public int idUsuario;

    public GestorUsuario(GestorLibreria gestor) {
        usuarios = new ArrayList<>();
        librospres = new ArrayList<>();
        this.gestor = gestor;
        librosdis=gestor.libros;
        CrearUsuario("1", "1", 1, 1);
        CrearUsuario("2", "2", 2, 2);
    }

//Este metodo crea un nuevo usuario y lo agrega a la lista usuarios
    public void CrearUsuario(String address, String name, int id, int number) {
        usuarios.add(new Usuario(address, name, id, number));
    }

    public void VistaAppUsuario(int idUsuario) {
        this.idUsuario=idUsuario;
        new VistaPrincipalUsuarios(this);
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

    public void GenerarPrestamo(int libro, int id) {
        LocalDate date = LocalDate.now();
        Month month = Month.of((date.getMonth().getValue()) + 1);
        LocalDate date2 = LocalDate.of(date.getYear(), month, date.getDayOfMonth());
        int opc=-1;
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                opc++;
            }
        }
        gestor.prestamos.add(new Prestamo(librosdis.get(libro), usuarios.get(opc), date, date2));
        usuarios.get(opc).getPrestamo().add(new Prestamo(librosdis.get(libro), usuarios.get(opc), date, date2));
        librospres.add(librosdis.get(libro));
        librosdis.remove(libro);
    }

    public void GenerarDevolucion() {
    }

}
