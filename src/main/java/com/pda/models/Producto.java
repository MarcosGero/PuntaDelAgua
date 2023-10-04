
package com.pda.models;
import com.fasterxml.jackson.annotation.JsonProperty;
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
            strategy = GenerationType.IDENTITY,
            generator = "prueba"
    )
    @JsonProperty
    private long Id;

    public Producto (){

    }
    private String detalle;
    private int cantidadMinimaMayorista;

    private int stockMinimo;

    public Producto(int id, String nombre, String detalle, int cantidadMinimaMayorista, double precioMinorista, double precioMayor, int stockMinimo) {
        this.Id=id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantidadMinimaMayorista = cantidadMinimaMayorista;
        this.precioMinorista = precioMinorista;
        this.precioMayor = precioMayor;
        this.stockMinimo = stockMinimo;
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

    public int getCantidadMinimaMayorista() {
        return cantidadMinimaMayorista;
    }

    public int getStockMinimo () {return this.stockMinimo;};

    public void setStockMinimo (int stockMinimo) {this.stockMinimo = stockMinimo;};
    public void setCantidadMinimaMayorista(int cantidadMinimaMayorista) {
        this.cantidadMinimaMayorista = cantidadMinimaMayorista;
    }
}