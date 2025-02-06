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

    public ArrayList<Libro> libros;// Lista q me guarda los libros
    public ArrayList<Prestamo> prestamos;//lista q me guarda todos los prestamos
    public GestorAdmin admins;//me permite ingresar a las opciones de admin
    public GestorUsuario usuarios;//me permite entrar a las opciones de usuarios
    public VistaIngresar vistaIngre;
    public VistaPrincipalAdmin vistaApp;
    private int id_admin;

    public GestorLibreria() {
        this.libros = new ArrayList<Libro>();
        this.prestamos = new ArrayList<Prestamo>();
        this.admins = new GestorAdmin(this);
        VistaIngresar();
        AgregarLibro("1", "1", "1", 1);
        AgregarLibro("2", "2", "2", 2);
        AgregarLibro("3", "3", "3", 3);
        AgregarLibro("4", "4", "4", 4);
        this.usuarios = new GestorUsuario(this);
    }

    public void VistaIngresar() {
        vistaIngre = new VistaIngresar(this);
    }

//Este metodo me crea la vista de la aplicacion para los administradores
    public void VistaAppAdmin(int o) {
        id_admin = o;
        vistaApp = new VistaPrincipalAdmin(this);
    }
//Este metodo me crea un libro nuevo con los parametros q recibe

    public void AgregarLibro(String title, String autor, String genero, int disponibilidad) {
        libros.add(new Libro(title, autor, genero, disponibilidad));
    }
//este metodo recibe la posicion del libro y la edita
//con los nuevos parametros    

    public void EditarLibro(int libro, String title, String autor, String genero, int disponible) {
        libros.get(libro).setTitulo(title);
        libros.get(libro).setAutor(autor);
        libros.get(libro).setGenero(genero);
        libros.get(libro).setDisponible(disponible);
    }
//este metodo elimina un libro en la posicion q recibe

    public void EliminarLibro(int libro) {
        libros.remove(libro);
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

}
