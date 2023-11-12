package com.pda.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "venta_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "renglones"})
    private Venta venta;
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producto;
    private int cantidad;

    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Renglon(Producto producto, int cantidad,double monto) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    public Renglon() {

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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
