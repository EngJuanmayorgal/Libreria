/*
 * Esta clase es el esquema de cada libro
 * 
 */
package Modelo;

import java.io.Serializable;

public class Libro implements Serializable {

    private String titulo;
    private String autor;
    private String genero;
    private int disponible;

    public Libro(String titulo, String autor, String genero, int disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
