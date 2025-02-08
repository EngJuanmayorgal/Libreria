/*
 * Esta clase es quien gestiona los libros y los prestamos
 * 
 */
package Logica;

import GUI.PanelEstadisticas;
import GUI.VistaIngresar;
import GUI.VistaPrincipalAdmin;
import Modelo.*;
import java.util.*;

public class GestorLibreria {

    private ArrayList<Libro> libros;// Lista q me guarda los libros
    public ArrayList<Prestamo> prestamos;//lista q me guarda todos los prestamos
    public GestorAdmin admins;//me permite ingresar a las opciones de admin
    public GestorUsuario usuarios;//me permite entrar a las opciones de usuarios
    public VistaIngresar vistaIngre;
    public VistaPrincipalAdmin vistaApp;

    public GestorLibreria() {
        this.libros = new Serializacion().DeserializarLibros();
        this.prestamos = new Serializacion().DeserializarPrestamos();
        this.admins = new GestorAdmin(this);
        VistaIngresar();
        this.usuarios = new GestorUsuario(this);
    }

    public void VistaIngresar() {
        vistaIngre = new VistaIngresar(this);
    }

//Este metodo me crea la vista de la aplicacion para los administradores
    public void VistaAppAdmin(int o) {
        vistaApp = new VistaPrincipalAdmin(this);
    }
//Este metodo me crea un libro nuevo con los parametros q recibe

    public void AgregarLibro(String title, String autor, String genero, int disponibilidad) {
        libros.add(new Libro(idRamdonLibro(), title, autor, genero, disponibilidad));
        new Serializacion().SerializarLibros(libros);
    }
//este metodo recibe la posicion del libro y la edita
//con los nuevos parametros    

    public void EditarLibro(int libro, String title, String autor, String genero, int disponible) {
       for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().getIdLibro()==libro) {
               prestamo.getLibro().setTitulo(title);
               prestamo.getLibro().setAutor(autor);
                prestamo.getLibro().setGenero(genero);
               prestamo.getLibro().setDisponible(disponible);
            }
        }
        libros.get(EncontrarLibro1(libro)).setAutor(autor);
        libros.get(EncontrarLibro1(libro)).setGenero(genero);
        libros.get(EncontrarLibro1(libro)).setDisponible(disponible);
        libros.get(EncontrarLibro1(libro)).setTitulo(title);
        new Serializacion().SerializarLibros(libros);
    }
//este metodo elimina un libro en la posicion q recibe

    public void EliminarLibro(int libro) {
        libros.remove(libro);
        new Serializacion().SerializarLibros(libros);
    }

//este metodo me ayuda a encontrar un libro por su titulo
    public Libro EncontrarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
//este metodo me ayuda a encontrar un libro por su id
    public Libro EncontrarLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getIdLibro()==id) {
                return libro;
            }
        }
        return null;
    }
    
    
    //este metodo me ayuda a encontrar un libro por su id y me devuelve su posicion
    public int EncontrarLibro1(int id) {
        int i=0;
        for (Libro libro : libros) {
            if (libro.getIdLibro()==id) {
                return i;
            }
            i++;
        }
        return 0;
    }

// este metodo me orgamiza los libros mas prestados de manera descendente   
    public void LibroPopular() {
        List<String> lista = new ArrayList();
        for (Prestamo libro : prestamos) {
            lista.add(libro.getLibro().getTitulo());
        }
        Map<String, Integer> frecuencia = new HashMap<>();

        for (String elemento : lista) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }

        // Ordenamos por frecuencia en orden descendente
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Imprimimos los elementos ordenados por frecuencia
        PanelEstadisticas PE = new PanelEstadisticas(vistaApp);
        vistaApp.cambiarPaguina(PE);
        for (Map.Entry<String, Integer> entry : listaOrdenada) {
            PE.TablaDinamico(entry.getKey(), "" + entry.getValue());
        }
    }

    //este metodo me ayuda a encontrar un prestamo 
    public Prestamo EncontrarPrestamo(int id) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getIdPrestamo() == id) {
                return prestamo;
            }
        }
        return null;
    }

    //este metodo se asegura q no alla ningun prestamo con el mismo id
    public int idRamdonPrestamo() {
        Random random = new Random();
        int id = random.nextInt(1, 500);
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getIdPrestamo() == id) {
                id = idRamdonPrestamo();
                break;
            }
        }
        return id;
    }

    //este metodo se asegura q no alla ningun libro con el mismo id
    public int idRamdonLibro() {
        Random random = new Random();
        int id = random.nextInt(1, 500);
        for (Libro libro : libros) {
            if (libro.getIdLibro() == id) {
                id = idRamdonLibro();
                break;
            }
        }
        return id;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

}
