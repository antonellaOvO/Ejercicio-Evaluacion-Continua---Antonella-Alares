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
    
    public void reservar_libro(String nombre){ /*Opci�n 1 en caso de hacer la lista de libros_prestados de Usuario como protected*/
    boolean libroEncontrado = false;
      for(Libro libro: Libro.getLista_libros()){
          boolean dispo = libro.getDisponible(); /*hay que crear una variable d�nde almacenar la disponibilidad del libro, porque sino en el if no lo coje bien al ser un boolean*/
            if(libro.getTitulo().equals(nombre)){
                libroEncontrado = true;
                if(dispo == false){
                    libros_reservados.add(libro);
                    System.out.println("Libro: " + libro.getTitulo()+ " - No est� disponible por ahora. Pero al ser Premium, te lo hemos a�adido a tu listado de libros reservados.");
                } else{   
                libros_prestados.add(libro);
                libro.marcar_prestado();
                System.out.println("Libro: " + libro.getTitulo()+ " - Disponibilidad del libro cambiada a: " + libro.getDisponible());
                }
                
                break; /*Indicamos break para que cuando coja el titulo del libro correcto, salga del loop que hace sobre el if*/
            }
        } 
      if(libroEncontrado == false){
          System.out.println("Libro con t�tulo: " + nombre + " no encontrado.");
      }
      
      }
    
   /* public void reservar_libro2(String nombre){ ----Opci�n 2 en caso de no hacer la Opci�n 1 y por tanto, tendriamos que utilizar el m�todo de devolver_libro de la clase Usuario*/ 
    /*boolean libroEncontrado = false;
      for(Libro libro: Libro.getLista_libros()){
          boolean dispo = libro.getDisponible(); *//*hay que crear una variable d�nde almacenar la disponibilidad del libro, porque sino en el if no lo coje bien al ser un boolean*/
       /*     if(libro.getTitulo().equals(nombre)){
                libroEncontrado = true;
                if(dispo == false){
                    libros_reservados.add(libro);
                    System.out.println("Libro: " + libro.getTitulo()+ " - No est� disponible por ahora. Pero al ser Premium, te lo hemos a�adido a tu listado de libros reservados.");
                } else{   
                super.tomar_prestado(nombre);
                //System.out.println("Libro: " + libro.getTitulo()+ " - Disponibilidad del libro cambiada a: " + libro.getDisponible());
                }
                
                break; /*Indicamos break para que cuando coja el titulo del libro correcto, salga del loop que hace sobre el if*/
    /*        }
        } 
      if(libroEncontrado == false){
          System.out.println("Libro con t�tulo: " + nombre + " no encontrado.");
      }    
   }
    
    
    
     public void devolver_libro(String nombre){ ----esto se har�a para poder heredar el m�todo devolver_libro de la clase Usuario, y as� poder utilizar este m�todo en el m�todo reservar_libro2
         super.devolver_libro(nombre);
     }*/
    
    
}

