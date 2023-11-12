package com.pda.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table
public class Venta {
    @Id
    @SequenceGenerator(
            name="venta_generator",
            sequenceName = "venta_sequence",
            allocationSize = 50
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "venta_generator"
    )
    @JsonProperty
    private long Id;
    @Enumerated(EnumType.STRING)
    private TipoFactura tipoFactura;
    @Enumerated(EnumType.STRING)
    private TipoVenta tipoVenta;

    public TipoVenta getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(TipoVenta tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    private Date fecha;
    private double monto;
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Renglon> renglones;

    public Venta (){

    }

    public Venta(Date fecha, double monto, List<Renglon> renglones,TipoFactura tipoFactura, TipoVenta tipoVenta) {
        this.fecha = fecha;
        this.monto = monto;
        this.renglones = renglones;
        this.tipoVenta = tipoVenta;
        this.tipoFactura = tipoFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public List<Renglon> getRenglones() {
        return renglones;
    }

    public void setRenglones(List<Renglon> renglones) {
        this.renglones = renglones;
    }
}
