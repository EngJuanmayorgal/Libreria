/*
 * Esta case gestiona los administradores
 * 
 */
package Logica;

import Modelo.Administrador;
import java.util.ArrayList;

public class GestorAdmin {

    private ArrayList<Administrador> admins;
    private GestorLibreria gestor;

    public GestorAdmin(GestorLibreria gestor) {
        this.gestor = gestor;
        admins = new ArrayList<>();
        CrearAdmin("1", "1", 1, 1);
    }

//Este metodo me crea un administrador y me lo agrega a lalista admins
    public void CrearAdmin(String pass, String name, int id, int number) {
        admins.add(new Administrador(pass, name, id, number));
    }

//Este metodo busca si existe el admin
    public boolean EncontrarAdmin(int id) {
        for (Administrador admin : admins) {
            if (admin.getId() == id) {
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
