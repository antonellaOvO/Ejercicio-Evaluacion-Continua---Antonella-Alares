/*Antonella Alares*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.biblioteca;

import java.util.*;

/**
 *
 * @author anto_
 */
public class Usuario {
   private String nombre;
   private List<Libro> libros_prestados; 

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.libros_prestados = new ArrayList<>();
    }
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros_prestados() {
        return libros_prestados;
    }

    public void setLibros_prestados(List<Libro> libros_prestados) {
        this.libros_prestados = libros_prestados;
    }
   
}
