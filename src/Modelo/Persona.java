/*
 * clase base para los tipo de usuario 
 * 
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Persona implements Serializable{

    private String name;
    private int id;
    private int number;

    public Persona(String name, int id, int number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    
}
