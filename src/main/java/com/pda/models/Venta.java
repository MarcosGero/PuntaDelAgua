package com.pda.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table
public class Venta {
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
    private long id;
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
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<Renglon> renglones;

    public Venta (){

    }

    public Venta(Date fecha, double monto, List<Renglon> renglones) {
        this.fecha = fecha;
        this.monto = monto;
        this.renglones = renglones;
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
