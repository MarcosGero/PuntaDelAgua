package com.pda.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table
public class Lote {

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
    @JsonProperty
    private long Id;
    private long productId;
    private Date fechaDeVencimiento;
    private int cantidad;//Cantidad de Productos con el mismo lote (es decir mismo vencimiento)

    public Lote(Date fechaDeVencimiento, int cantidad) {
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.cantidad = cantidad;
    }

    public Lote() {

    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
