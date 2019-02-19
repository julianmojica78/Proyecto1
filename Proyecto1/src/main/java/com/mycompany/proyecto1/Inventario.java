/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Inventario
 * @author Julia David Bustos Mojica
 */
//metodo constructor
public class Inventario {
    
    int id_libros;
    int cantidad;
    String descripcion;
       public Inventario(int cantidad,String descripcion){
   
       this.cantidad = cantidad;
       this.descripcion = descripcion;
       
   }
      //metodo
      public static void main(String [] args){
       Inventario inventario1  = new Inventario(1,"");
      
   }
    
}
