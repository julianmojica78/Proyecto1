package com.mycompany.proyecto1;
/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Vendedor
 * @author Julian David Bustos Mojica
 * @version 1.0
 */
public class Vendedor {
    
    //declaracion de atributos
    /*
    atributo que captura el idvendedor
    */
    private int idvendedor;
    /*
    atributo que captura el nombre del usuario
    */
    private String nombre;
    /*
    atributo que captura el apellido del usuario
    */
    private String apellido;
    /*
    atributo que captura la cedula del usuario
    */
    private String cedula;
    
    /*Creacion del constructor
        metodo constructor de la clase usuario
    */
    public Vendedor(int idvendedor, String nombre, String apellido, String cedula) {
        this.idvendedor = idvendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    
    /*
    metodo para agregar libros 
    */
    public void agregarLibro(){
        
    }
    
    /*
    Metodo get para mostrar el  atributo id_usuario  
    */
    public int getIdvendedor() {
        return idvendedor;
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
    Metodo set para modificar el atributo id_usuario
    */
    public void setIdvendedor(int idvendedor) {
        this.idvendedor= idvendedor;
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
}
