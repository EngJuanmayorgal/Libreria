package Modelo;

import java.io.*;
import java.util.ArrayList;

public class Serializacion {

    public void SerializarLibros(ArrayList libros) {
        try (FileOutputStream fileOut = new FileOutputStream("libros.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(libros);
        } catch (IOException e) {
        }
    }

    public ArrayList<Libro> DeserializarLibros() {
        ArrayList<Libro> libros = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("libros.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            libros = (ArrayList<Libro>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return libros;
    }

    public void SerializarUsuarios(ArrayList usuarios) {
        try (FileOutputStream fileOut = new FileOutputStream("usuarios.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(usuarios);
        } catch (IOException e) {
        }
    }

    public ArrayList<Usuario> DeserializarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("usuarios.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            usuarios = (ArrayList<Usuario>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return usuarios;
    }

    public void SerializarAdmins(ArrayList Administrador) {
        try (FileOutputStream fileOut = new FileOutputStream("Administrador.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(Administrador);
        } catch (IOException e) {
        }
    }

    public ArrayList<Administrador> DeserializarAdmins() {
        ArrayList<Administrador> Administrador = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("Administrador.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Administrador = (ArrayList<Administrador>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return Administrador;
    }
    public void SerializarPrestamos(ArrayList Prestamos) {
        try (FileOutputStream fileOut = new FileOutputStream("Prestamos.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(Prestamos);
            System.out.println("admin serie");
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println("no se serie admin");
        }
    }

    public ArrayList<Prestamo> DeserializarPrestamos() {
        ArrayList<Prestamo> Prestamos = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("Prestamos.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Prestamos = (ArrayList<Prestamo>) in.readObject();
            System.out.println("pres deserie");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.toString());
            System.out.println("no se deserie pres");
        }
        return Prestamos;
    }
}
