/*Autora: Antonella Alares*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.biblioteca;

import java.util.*;

/**
 *
 * @author anto_
 */
public class SistemaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Creando instancias de las clases Autor - total 3 autores*/
         Autor autor1 = new Autor("Gabriel García Márquez");
         Autor autor2 = new Autor("Jane Austen");
         Autor autor3 = new Autor("Fiódor Dostoyevski");
         
        /*Creando instancias de la clase Usuario- total 3 Usuarios*/
         Usuario usuario1 = new Usuario("Antonella");
         Usuario usuario2 = new Usuario("Marco");
         Usuario usuario3 = new Usuario("Ana");
         
        /*Creando instancias de la clase MiembroPremium- total 3 Usuarios MiembroPremium*/
         MiembroPremium miembroPremium1 = new MiembroPremium("Laura- miembroPremium");
         MiembroPremium miembroPremium2 = new MiembroPremium("Antonio- miembroPremium");
         MiembroPremium miembroPremium3 = new MiembroPremium("Pablo- miembroPremium");
       
         
        /*Cada autor publica su libro correspondiente, de forma que cada autor ha publicado en este caso 3 libros suyos*/
         autor1.publicar_libro("Cien años de soledad", autor1.getNombre(), true);
         autor1.publicar_libro("La mala hora", autor1.getNombre(), true);
         autor1.publicar_libro("La buena hora", autor1.getNombre(), true);
         autor2.publicar_libro("Orgullo y Prejuicio", autor2.getNombre(), true);
         autor2.publicar_libro("Persuasión", autor2.getNombre(), true);
         autor2.publicar_libro("Mansfield Park", autor2.getNombre(), true);
         autor3.publicar_libro("Crimen y Castigo", autor3.getNombre(), true);
         autor3.publicar_libro("Noches Blancas", autor3.getNombre(), true);
         autor3.publicar_libro("Cartas a Anna", autor3.getNombre(), true);
         
        /*Para visualizar/comprobar que los libros publicados por los autores se han añadido a la lista de libros de cada autor*/
         
         System.out.println("*LIBROS PUBLICADOS - CONFIRMACIÓN A CADA AUTOR:");
         
         //autor 1
         System.out.println("Hola " + autor1.getNombre() + ", estos son los libros que has publicado:");
            for(Libro libro: autor1.getLibros()){
            System.out.println("Libro: " + libro.getTitulo()+ " - del autor: " + libro.getAutor());
            }
          
            System.out.println(" "); //Para espaciar
            
         //autor 2
         System.out.println("Hola " + autor2.getNombre() + ", estos son los libros que has publicado:");
            for(Libro libro: autor2.getLibros()){
            System.out.println("Libro: " + libro.getTitulo()+ " - del autor: " + libro.getAutor());
            }
            
          System.out.println(" "); //Para espaciar
            
         //autor 3
         System.out.println("Hola " + autor3.getNombre() + ", estos son los libros que has publicado:");
            for(Libro libro: autor3.getLibros()){
            System.out.println("Libro: " + libro.getTitulo()+ " - del autor: " + libro.getAutor());
            }
            
         System.out.println(" "); //Para espaciar
         
         System.out.println("*LIBROS PUBLICADOS:");
        
         System.out.println(" "); //Para espaciar
         
        /*Para visualizar/comprobar que los libros publicados por los autores se han añadido al listado de libros de la clase Libro*/
            System.out.println("Estos son todos los libros que se han publicado por el momento:");
            for(Libro libro: Libro.getLista_libros()){
            System.out.println("Libro: " + libro.getTitulo()+ " - del autor: " + libro.getAutor());
            }
         
        System.out.println(" "); //Para espaciar
            
        /* -----Si se descomenta, sirve para ver que ambos métodos de marcar prestado/devolver funcionan correctamente:
        
        System.out.println(" "); //Para espaciar
            
        //Para marcar como prestado - sólo para ver si funciona el método
        System.out.println("Estos son todos los libros que se han prestado por el momento:");
            for(Libro libro: Libro.getLista_libros()){
            libro.marcar_prestado();
            System.out.println("Libro: " + libro.getTitulo()+ " - disponibilidad: " + libro.getDisponible());
            }
            
        System.out.println(" "); //Para espaciar
            
        //Para marcar como devuelto- sólo para ver si funciona el método
         System.out.println("Estos son todos los libros que se han devuelto por el momento:");
            for(Libro libro: Libro.getLista_libros()){
            libro.marcar_devuelto();
            System.out.println("Libro: " + libro.getTitulo()+ " - disponibilidad: " + libro.getDisponible());
            }-----*/
        
        //Para ver los libros prestados por Usuarios y Miembros Premium
        System.out.println("*LIBROS PRESTADOS:");
        
        System.out.println(" "); //Para espaciar
        
         System.out.println("Estos son todos los libros prestados por el usuario:");
         usuario1.tomar_prestado("La mala hora");
         usuario1.tomar_prestado("Cien años de soledad");
         
         System.out.println(" "); //Para espaciar
         
         System.out.println("Estos son todos los libros prestados por el miembro Premium:");
         miembroPremium1.tomar_prestado("Persuasión");
         miembroPremium1.tomar_prestado("Crimen y Castigo");
         
         System.out.println(" "); //Para espaciar
        
        System.out.println("*LIBROS DEVUELTOS:");
        
        System.out.println(" "); //Para espaciar
        
        //Para ver los libros devueltos por Usuarios y Miembros Premium
         System.out.println("Estos son todos los libros devueltos por el usuario:");
         usuario1.devolver_libro("La mala hora");
         
         System.out.println(" "); //Para espaciar
        
         System.out.println("Estos son todos los libros devueltos por el miembro premium:");
         miembroPremium1.devolver_libro("Persuasión");
         
        
        System.out.println(" "); //Para espaciar
        
        System.out.println("*LIBROS RESERVADOS POR MIEMBRO PREMIUM:");
        
        //Para ver los libros reservados por el miembroPremium1
         miembroPremium2.reservar_libro("La mala hora"); /*Está disponible, ya que Usuario1 ya lo había devuelto (más arriba)*/
         miembroPremium2.reservar_libro("Crimen y Castigo"); /*No está disponible, ya que miembroPremium1 ya lo ha tomado prestado (más arriba)*/
         
        System.out.println(" "); //Para espaciar
         
        //Para visualizar y comprobar que el libro no disponible se ha añadido a la lista de reservados del MiembroPremium1: 
         
        System.out.println("Estos son los libros añadidos a la lista de libros reservados:");
        for(Libro libro: miembroPremium2.getLibros_reservados()){
            System.out.println("Libro: " + libro.getTitulo()+ " - del autor: " + libro.getAutor() + " - y no está disponible por ahora.");
            }
        System.out.println(" "); //Para espaciar
        
        System.out.println("*LIBROS PRESTADOS PARA MIEMBRO PREMIUM:"); 
        System.out.println("Estos son los libros añadidos a la lista de libros prestados:");
        for(Libro libro: miembroPremium2. getLibros_prestados()){
            System.out.println("Libro: " + libro.getTitulo()+ " - del autor: " + libro.getAutor() + " - y no está disponible por ahora.");
            }
         
        
        
    }
    
}
