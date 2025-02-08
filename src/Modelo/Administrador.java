/*
 * 
 * 
 */
package Modelo;

import java.io.Serializable;

public class Administrador extends Persona implements Serializable{
    
    private String pass;

    public Administrador(String pass, String name, int id, int number) {
        super(name, id, number);
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
