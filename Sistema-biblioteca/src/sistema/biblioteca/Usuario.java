/*Autora: Antonella Alares*/
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
   protected List<Libro> libros_prestados; /*declaramos protected para que esta lista la pueda heredar la clase MiembroPremium*/

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
   
   public void tomar_prestado(String nombre){
      boolean libroEncontrado = false;
      for(Libro libro: Libro.getLista_libros()){
          boolean dispo = libro.getDisponible(); /*hay que crear una variable dónde almacenar la disponibilidad del libro, porque sino en el if no lo coje bien al ser un boolean*/
            if(libro.getTitulo().equals(nombre)){
                libroEncontrado = true;
                if(dispo == true){
                    libro.marcar_prestado();
                    libros_prestados.add(libro);
                    System.out.println("Libro: " + libro.getTitulo()+ " - Disponibilidad del libro cambiada a: " + libro.getDisponible());
                } else{
                    System.out.println("Libro " + libro.getTitulo()+ " No disponible" );
                }
                break;/*Indicamos break para que cuando coja el titulo del libro correcto, salga del loop que hace sobre el if*/
        }                 
      }
      if(libroEncontrado == false){
          System.out.println("Libro con título: " + nombre + " no encontrado.");
      }
       
   }
   
  
   public void devolver_libro(String nombre){
   boolean libroEncontrado = false;
      for(Libro libro: Libro.getLista_libros()){
          boolean dispo = libro.getDisponible(); /*hay que crear una variable dónde almacenar la disponibilidad del libro, porque sino en el if no lo coje bien al ser un boolean*/
            if(libro.getTitulo().equals(nombre)){
                libroEncontrado = true;
                if(dispo == false){
                    libro.marcar_devuelto();
                    libros_prestados.add(libro);
                    System.out.println("Libro: " + libro.getTitulo()+ " - Disponibilidad del libro cambiada a: " + libro.getDisponible());
                } else{
                    System.out.println("Libro " + libro.getTitulo()+ " No disponible" );
                }
                break; /*Indicamos break para que cuando coja el titulo del libro correcto, salga del loop que hace sobre el if*/
        }                 
      }
      if(libroEncontrado == false){
          System.out.println("Libro con título: " + nombre + " no encontrado.");
      }
   }
    
}
