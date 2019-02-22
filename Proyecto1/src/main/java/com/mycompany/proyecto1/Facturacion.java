package com.mycompany.proyecto1;
/**
 *
 * @author Julian David Bustos Mojica
 * @version 1.0
 */
public class Facturacion {
    //declaracion de atributos
    /*
    atributo que captura el codigoFacturacion
    */
    private int codigoFacturacion;
    /*
    atributo que captura el id_usuario
    */
    private int id_usuario;
    /*
    atributo que captura el id_venta
    */
    private int id_venta;
    
    /*Creacion del constructor
        metodo constructor de la clase facturacion
    */
    public Facturacion(int codigoFacturacion, int id_usuario, int id_venta) {
        this.codigoFacturacion = codigoFacturacion;
        this.id_usuario = id_usuario;
        this.id_venta = id_venta;
    }
    /*
    metodo para la generacion de la factura 
    */
    public void generarFacturacion(){
        
    }
    /*
    Metodo get para mostrar el  atributo codigoFacturacion
    */
    public int getCodigoFacturacion() {
        return codigoFacturacion;
    }
    /*
    Metodo get para mostrar el  atributo id_usuario  
    */
    public int getId_usuario() {
        return id_usuario;
    }
    /*
    Metodo get para mostrar el  atributo id_venta  
    */
    public int getId_venta() {
        return id_venta;
    }
    /*
    Metodo set para modificar el atributo codigoFacturacion
    */
    public void setCodigoFacturacion(int codigoFacturacion) {
        this.codigoFacturacion = codigoFacturacion;
    }
    /*
    Metodo set para modificar el atributo id_usuario
    */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    /*
    Metodo set para modificar el atributo id_venta
    */
    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    
    
}

