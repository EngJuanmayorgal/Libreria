/*
 * Esta clase es quien gestiona los libros y los prestamos
 * 
 */
package Logica;

import Modelo.*;
import java.util.ArrayList;

public class GestorLibreria {

    private ArrayList<Libro> libros;// Lista q me guarda los libros
    private ArrayList<Prestamo> prestamos;//lista q me guarda todos los prestamos
    private GestorAdmin admins;//me permite ingresar a las opciones de admin
    private GestorUsuario usuarios;//me permite entrar a las opciones de usuarios

    public GestorLibreria() {
        this.libros = new ArrayList<Libro>();
        this.prestamos = new ArrayList<Prestamo>();
        this.admins = new GestorAdmin();
        this.usuarios = new GestorUsuario();
    }    
    
    
    
    public void AgregarLibro() {
    }

    public void EditarLibro() {
    }

    public void EliminarLibro() {
    }
}
