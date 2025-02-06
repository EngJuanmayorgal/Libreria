/*
 * 
 * 
 */
package Modelo;

import java.time.LocalDate;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private boolean entTiempo;
    private boolean entTarde;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public String Obsrvacion() {
        if (entTiempo) {
            return "A TIEMPO";
        }
        if (entTarde) {
            return "TARDE";
        }
        return "NO ENTREGADO";
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
