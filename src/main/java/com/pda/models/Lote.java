package com.pda.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table
public class Lote {

    @Id
    @SequenceGenerator(
            name="lote_generator",
            sequenceName = "lote_sequence",
            allocationSize = 50
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "lote_generator"
    )
    @JsonProperty
    private long Id;
    private long productId;
    private Date fechaDeVencimiento;
    private int cantidad;//Cantidad de Productos con el mismo lote (es decir mismo vencimiento)

    public Lote(long productId, Date fechaDeVencimiento, int cantidad) {
        this.productId = productId;
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
    public void setId(long Id) {
        this.Id = Id;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
}
