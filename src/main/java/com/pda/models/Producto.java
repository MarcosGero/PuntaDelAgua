
package com.pda.models;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table
public class Producto {
     //Será el código de Barras
    private String nombre;
    private double precioMayor;
    private double precioMinorista;
    @Id
    @SequenceGenerator(
            name="prueba",
            sequenceName = "prueba",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "prueba"
    )
    private long ID;
    private String detalle;
    private int cantidad;
    //private Proveedor proveedor;

    private int cantidadMinimaMayorista;
    private String proveedor;
    public Producto (){

    }

    public Producto(int id, String nombre, String detalle, String proveedor, int cantidadMinimaMayorista) {
        this.ID=id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.proveedor = proveedor;
        this.cantidadMinimaMayorista = cantidadMinimaMayorista;
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
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidadMinimaMayorista() {
        return cantidadMinimaMayorista;
    }

    public void setCantidadMinimaMayorista(int cantidadMinimaMayorista) {
        this.cantidadMinimaMayorista = cantidadMinimaMayorista;
    }
}