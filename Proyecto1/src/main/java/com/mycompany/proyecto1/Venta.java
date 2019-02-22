package com.mycompany.proyecto1;
/**
 *en esta clase se declaran los atributos y los metodos que necesitaran la clase Vendedor
 * @author Julian David Bustos Mojica
 * @version 1.0
 */
public class Venta {
    /*
    atributo que captura el id_inventario
    */
     private int id_inventario;
    /*
    atributo que captura el id_venta
    */
     private int id_venta;
    /*
    atributo que captura el cantidad
    */
     private int cantidad;
    /*Creacion del constructor
        metodo constructor de la clase venta
    */
    public Venta(int id_inventario, int id_venta, int cantidad) {
        this.id_inventario = id_inventario;
        this.id_venta = id_venta;
        this.cantidad = cantidad;
    }
    
    /*
    metodo para agregar las ventas
    */
    public void agregarVenta(){
        
    }
    /*
    Metodo get para mostrar el  atributo id_inventario
    */
    public int getId_inventario() {
        return id_inventario;
    }
    /*
    Metodo get para mostrar el  atributo id_venta
    */
    public int getId_venta() {
        return id_venta;
    }
    /*
    Metodo get para mostrar el  atributo cantidad
    */
    public int getCantidad() {
        return cantidad;
    }
    /*
    Metodo set para modificar el atributo id_inventario  
    */
    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }
    /*
    Metodo set para modificar el atributo id_venta  
    */
    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    /*
    Metodo set para modificar el atributo cantidad  
    */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
     
     
}
