package com.pda.modelos;

import java.util.List;



public class Producto {
    private int ID; //Será el código de Barras
    private String nombre;
    private double precioMayor;
    private double precioMinorista;
    private int cantidadMinimaMinorista;
    private String detalle;
    private int cantidad;
    private Proveedor proveedor; //Creo, deberia ser una lista, (Puede haber un producto que lo proveen distintos proveedores)


    public Producto(int id, String nombre, String detalle, Proveedor proveedor, int cantidadMinimaMinorista) {
        this.ID=id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.proveedor = proveedor;
        this.cantidadMinimaMinorista = cantidadMinimaMinorista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioMayor() {
        return precioMayor;
    }

    public void setPrecioMayor(double precioMayor) {
        this.precioMayor = precioMayor;
    }

    public double getPrecioMinorista() {
        return precioMinorista;
    }

    public void setPrecioMinorista(double precioMinorista) {
        this.precioMinorista = precioMinorista;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidadMinimaMinorista() {
        return cantidadMinimaMinorista;
    }

    public void setCantidadMinimaMinorista(int cantidadMinimaMinorista) {
        this.cantidadMinimaMinorista = cantidadMinimaMinorista;
    }
// Constructores, getters, setters y otros métodos relevantes...
}