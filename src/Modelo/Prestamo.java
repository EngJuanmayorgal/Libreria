/*
 * esta clase es la forma en la que se ve un prestammo
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Prestamo implements Serializable {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private LocalDate fechaEntregado;
    private String observacion;
    private int idPrestamo;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaEntrega, int idPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.observacion = "NO ENTEGADO";
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.idPrestamo = idPrestamo;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(LocalDate fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
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

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
