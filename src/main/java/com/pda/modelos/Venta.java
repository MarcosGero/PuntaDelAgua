package com.pda.modelos;

import java.util.Date;
import java.util.List;

public class Venta {
    static private int lastID = 0;

    private int ID;
    private Date fecha;
    private double monto;
    private String tipo;
    private List<Producto> productos;
    private Factura factura;

    public Venta(){

    }

    public Venta(double monto, String tipo, List<Producto> productos, Factura factura) {
        this.ID = lastID + 1;
        this.monto = monto;
        this.tipo = tipo;
        this.productos = productos;
        this.factura = factura;
    }
}
