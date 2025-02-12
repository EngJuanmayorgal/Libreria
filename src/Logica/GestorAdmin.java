/*
 * Esta case gestiona los administradores
 * 
 */
package Logica;

import Modelo.Administrador;
import Modelo.Serializacion;
import java.util.ArrayList;

public class GestorAdmin {

    private ArrayList<Administrador> admins;
    public Administrador admin;

    public GestorAdmin(GestorLibreria gestor) {
        admins = new Serializacion().DeserializarAdmins();
        new Serializacion().SerializarAdmins(admins);
    }
    
       //este metodo encuentra al usuario que inicio secion   
    public Administrador Admin(int id) {
        for (Administrador admi : admins) {
            if (admi.getId() == id) {
                return admi;
            }
        }
        return null;
    }

//Este metodo me crea un administrador y me lo agrega a lalista admins
    public void CrearAdmin(String pass, String name, int id, int number) {
        admins.add(new Administrador(pass, name, id, number));
        new Serializacion().SerializarAdmins(admins);
    }

//Este metodo busca si existe el admin
    public boolean EncontrarAdmin(int id) {
        admins = new Serializacion().DeserializarAdmins();
        for (Administrador admi : admins) {
            if (admi.getId() == id) {
                admin=Admin(id);
                return true;
            }
        }
        return false;
    }

//este metodo me confirma si la contraseña es correcta
    public boolean ConfirmarClave(int id, String pass) {
        for (Administrador admin : admins) {
            if (admin.getId() == id && admin.getPass().equals(pass)) {
                return true;
            }
        }
        return false;
    }

}
