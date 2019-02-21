package com.mycompany.proyecto1;

/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Usuario
 * @author Julia David Bustos Mojica
 * @version 1.0
 */
public class Usuario {
    
    //declaracion de atributos
    
    //atributo que captura el id_usuario
    private int id_usuario;
    //atributo que captura el nombre del usuario
    private String nombre;
    //atributo que captura el apellido del usuario
    private String apellido;
    //atributo que captura la cedula del usuario
    private String cedula;
    //atributo que captura la direccion del usuario
    private String direccion;   
    //atributo que captura el id_libros
    private int id_libros;
    //atributo que captura el id_inventario
    private int id_inventario;
    /*Creacion del constructor
        metodo constructor de la clase usuario
    */
    public Usuario(int id_usuario, String nombre, String apellido, String cedula, String direccion ,int id_libros,int id_inventario) {
        
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.id_libros = id_libros;
        this.id_inventario = id_inventario;
    }
    
      /*
    Metodo donde se realizara la venta de de los libros 
    */  
    public void venta(){
        
    }
    /*
    Metodo get para mostrar el  atributo id_usuario  
    */
    public int getId_usuario() {
        return id_usuario;
    }
    /*
    Metodo get para mostrar el  atributo nombre 
    */
    public String getNombre() {
        return nombre;
    }
    /*
    Metodo get para mostrar el  atributo apellido  
    */
    public String getApellido() {
        return apellido;
    }
    /*
    Metodo get para mostrar el  atributo cedula 
    */
    public String getCedula() {
        return cedula;
    }
    /*
    Metodo get para mostrar el  atributo direccion 
    */
    public String getDireccion() {
        return direccion;
    }
    /*
    Metodo set para modificar el atributo id_usuario
    */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    /*
    Metodo set para modificar el atributo nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
    Metodo set para modificar el atributo apellido 
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /*
    Metodo set para modificar el atributo cedula  
    */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /*
    Metodo set para modificar el atributo direccion  
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}


