/*
 * 
 * 
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Usuario extends Persona implements Serializable{
    private String address;
    private ArrayList<Prestamo> prestamo; 
    private ArrayList<Prestamo> estrega; 

    public Usuario(String address, String name, int id, int number) {
        super(name, id, number);
        this.address = address;
        this.prestamo = new ArrayList<>();
        this.estrega = new ArrayList<>();
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(ArrayList<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }

    public ArrayList<Prestamo> getEstrega() {
        return estrega;
    }

    public void setEstrega(ArrayList<Prestamo> estrega) {
        this.estrega = estrega;
    }
    
    
}
