package com.pda.modelos;

import java.util.Date;
import java.util.List;

public class Lote {
    private Date fechaDeVencimiento;
    private int cantidad;//Cantidad de Productos con el mismo lote (es decir mismo vencimiento)

    public Lote(Date fechaDeVencimiento, int cantidad) {
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.cantidad = cantidad;
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
}
