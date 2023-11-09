package com.pda.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Renglon {
    @Id
    @SequenceGenerator(
            name="renglon_generator",
            sequenceName = "renglon_sequence",
            allocationSize = 50
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "renglon_generator"
    )
    @JsonProperty
    private long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venta_id")
    private Venta venta;

    private String nombre; //Producto.nombre
    private int cantidad;

    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Renglon(String nombre, int cantidad,double monto) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    public Renglon() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}
