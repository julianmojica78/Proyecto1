package com.mycompany.proyecto1;
/**
 *
 * @author Julian David Bustos Mojica
 * @version 1.0
 */
public class Principal {
    
       public static void main(String [] args){
       Inventario inventario1  = new Inventario(1,1,"",1,1,1);
       inventario1.librosInventario(100);
       inventario1.librosSalida(20);
       inventario1.mostrarInvntario();
       
       Libros libros1 = new Libros("","","","");
       libros1.preciosLibros("1000");
       libros1.mostrarDatos();
       
       Usuario usuario1 = new Usuario(1,"","","","");

       
      
   }
    
}
