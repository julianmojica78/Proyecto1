package com.mycompany.proyecto1;

/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Libros
 * @author Julia David Bustos Mojica
 * @version 1.0
 */
public class Libros {
    
    //declaracion de atributos
    
    //atributo que captura el id_libros
    private int id_libros;
    //atributo que captura el autor del libro
    private String autor;
    //atributo que captura la version del libro
    private String version;
    //atributo que captura la editorial del libro
    private String editorial;
    //atributo que captura el precio del libro
    private String precio;
      
    /*Creacion del constructor
        metodo constructor de la clase libros
    */
   public Libros(String autor,String version,String editorial,String precio){
   
       this.autor = autor;
       this.editorial = editorial;
       this.version = version;
       this.precio = precio;
       
   }
   
   /*
   creacion de metodo para verificar los precios de los libros
   */
   public void preciosLibros(String precio){
       this.precio = precio;
   
   }
   /*
   creacion de metodo para la impresion la informacion de precios de los libros
   */
      public void mostrarDatos(){
      
          System.out.println("El libro mas caro"+precio);
          System.out.println("El libro mas barato"+precio);
      
      }
    /*
    Metodo get para mostrar el atributo id_libros  
    */
    public int getId_libros() {
        return id_libros;
    }
    /*
    Metodo get para mostrar el atributo autor  
    */
    public String getAutor() {
        return autor;
    }
    /*
    Metodo get para mostrar la atributo version  
    */
    public String getVersion() {
        return version;
    }
    /*
    Metodo get para mostrar la atributo editorial  
    */
    public String getEditorial() {
        return editorial;
    }
    /*
    Metodo get para mostrar el  atributo precio  
    */
    public String getPrecio() {
        return precio;
    }
    /*
    Metodo set para modificar el atributo id_libros  
    */
    public void setId_libros(int id_libros) {
        this.id_libros = id_libros;
    }
    /*
    Metodo set para modificar el atributo autor  
    */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /*
    Metodo set para modificar el atributo version  
    */
    public void setVersion(String version) {
        this.version = version;
    }
    /*
    Metodo set para modificar el atributo editorial  
    */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    /*
    Metodo set para modificar el atributo precio  
    */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
      
      
    
}
