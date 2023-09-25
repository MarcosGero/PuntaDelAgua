package com.pda.modelos;


import jakarta.persistence.*;

import java.util.List;


@Entity
@Table
public class Producto {
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
    private int ID;
    private String detalle;
    private int cantidad;
    //private Proveedor proveedor;

    public Producto() {
        this.nombre = nombre;
        this.detalle = detalle;
        //this.proveedor = proveedor;
        /*this.ID=id;*/
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


// Constructores, getters, setters y otros métodos relevantes...
}