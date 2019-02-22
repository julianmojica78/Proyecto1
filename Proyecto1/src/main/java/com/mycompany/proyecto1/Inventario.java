package com.mycompany.proyecto1;

/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Inventario
 * @author Julian David Bustos Mojica
 * @version 1.0
 */
public class Inventario {
    //declaracion de atributos
    /*
    atributo que captura el id_inventario
    */
    private int id_inventario;
    /*
    atributo que captura el id_libros
    */
    private int id_libros;
    /*
    atributo que captura la descripcion
    */
    private String descripcion;
    /*
    atributo que captura el stock del inventario
    */
    private int stock;
    /*
    atributo que captura las entradas del inventario
    */
    private int entrada;
    /*
    atributo que captura las salidas del inventario
    */
    private int salida;
    /*Creacion del constructor
        metodo constructor de la clase inventario
    */
    public Inventario(int id_inventario,int id_libros, String descripcion, int stock, int entrada, int salida) {
        
        this.id_inventario = id_inventario;
        this.id_libros = id_libros;
        this.descripcion = descripcion;
        this.stock = stock;
        this.entrada = entrada;
        this.salida = salida;
    }
       /*
       este metodo contara la cantidad de libros que hay en el stock
       */
       public void librosInventario (int stock){
       }
       /*
       este metodo contara el libro mas vendido que tenemos
       */
       public void librosSalida (int salida){
       }
   /*
   creacion de metodo para la impresion la informacion del inventario
   */
      public void mostrarInvntario(){
          
      }
    /*
    Metodo get para mostrar el  atributo id_inventario
    */
    public int getId_inventario() {
        return id_inventario;
    }
    /*
    Metodo get para mostrar el  atributo id_libros  
    */
    public int getId_libros() {
        return id_libros;
    }
    /*
    Metodo get para mostrar el  atributo descripcion 
    */
    public String getDescripcion() {
        return descripcion;
    }
    /*
    Metodo get para mostrar el  atributo stock
    */
    public int getStock() {
        return stock;
    }
    /*
    Metodo get para mostrar el  atributo entrada  
    */
    public int getEntrada() {
        return entrada;
    }
    /*
    Metodo get para mostrar el  atributo salida 
    */
    public int getSalida() {
        return salida;
    }
    /*
    Metodo set para modificar el atributo id_inventario  
    */
    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }
    /*
    Metodo set para modificar el atributo id_libros  
    */
    public void setId_libros(int id_libros) {
        this.id_libros = id_libros;
    }
    /*
    Metodo set para modificar el atributo descripcion
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /*
    Metodo set para modificar el atributo stock
    */
    public void setStock(int stock) {
        this.stock = stock;
    }
    /*
    Metodo set para modificar el atributo entrada  
    */
    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    /*
    Metodo set para modificar el atributo salida  
    */
    public void setSalida(int salida) {
        this.salida = salida;
    }
      
      
    
}
