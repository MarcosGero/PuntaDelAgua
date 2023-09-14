package com.pda.modelos;

import java.util.List;

public class Stock {
    private String codigo;
    private String nombreProducto;
    private List<Producto> productos;

    public Stock(String codigo, String nombreProducto, List<Producto> productos) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.productos = productos;
    }
}
