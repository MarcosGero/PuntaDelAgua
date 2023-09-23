package com.pda.modelos;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

/* anotaciones para la serialización totalmente sacado de stackoverflow,perdon gente soy de boquita el mas grande */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
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
