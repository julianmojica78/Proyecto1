/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Libros
 * @author Julia David Bustos Mojica
 */
public class Libros {
    
    //atributos
    int id_libros;
    String autor;
    String version;
    String editorial;
    String precio;
    
    //metodo constructor
   public Libros(String autor,String version,String editorial,String precio){
   
       this.autor = autor;
       this.editorial = editorial;
       this.version = version;
       this.precio = precio;
       
   }
   //metodo
      public static void main(String [] args){
       Libros libro1 = new Libros("","","","");
      
   }
    
}
