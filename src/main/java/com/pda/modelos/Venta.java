package com.pda.modelos;

import java.util.Date;
import java.util.List;

public class Venta {
    private Date fecha;
    private double monto;
    private TipoVenta tipoVenta;
    private TipoFactura tipoFactura;
    private List<Renglon> renglones;

    public Venta(Date fecha, double monto, TipoVenta tipoVenta, TipoFactura tipoFactura, List<Renglon> renglones) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipoVenta = tipoVenta;
        this.tipoFactura = tipoFactura;
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

    public List<Renglon> getRenglones() {
        return renglones;
    }

    public void setRenglones(List<Renglon> renglones) {
        this.renglones = renglones;
    }
}
