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
public class Libro {
    private String titulo;
    private String autor; /*Referencia a Autor en la clase Autor cuando crea libro con el método publicar_libro*/
    private boolean disponible;
    private static List<Libro> lista_libros = new ArrayList<>();

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        lista_libros.add(this); /*Para meter cada libro creado en el listado de todos los libros cada vez que se crea un libro desde Autor*/ 
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static List<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(List<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }
    
    
    public void marcar_prestado() {
     this.disponible = false;   
    }
    
     public void marcar_devuelto() {
     this.disponible = true;
    }
    
}
