/*
 * 
 * 
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Usuario extends Persona{
    private String address;
    private ArrayList<Prestamo> prestamo;
    

    public Usuario(String address, String name, int id, int number) {
        super(name, id, number);
        this.address = address;
        this.prestamo = new ArrayList<>();
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
    
    
}
