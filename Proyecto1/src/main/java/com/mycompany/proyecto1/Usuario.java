/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Usuario
 * @author Julia David Bustos Mojica
 */
public class Usuario {
    
    int id_libros;
    String nombre;
    String apellido;
    String cedula;
    String direccion;
    public Usuario(int id_libros,String nombre,String apellido,String cedula, String direccion){
        
        this.id_libros = id_libros;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        
        
    }
    
         //metodo
      public static void main(String [] args){
       Usuario usuario1  = new Usuario(1,"","","","");
      
   }
}


