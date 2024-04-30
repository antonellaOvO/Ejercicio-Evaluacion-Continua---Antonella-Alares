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
public class MiembroPremium extends Usuario {
    
    private List<Libro> libros_reservados;

    public MiembroPremium(String nombre) {
        super(nombre);
        this.libros_reservados = new ArrayList<>();
    }


    
    public List<Libro> getLibros_reservados() {
        return libros_reservados;
    }

    public void setLibros_reservados(List<Libro> libros_reservados) {
        this.libros_reservados = libros_reservados;
    }

    
    
}
