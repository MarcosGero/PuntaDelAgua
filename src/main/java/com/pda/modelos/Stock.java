package com.pda.modelos;

import java.util.List;

public class Stock {
    private String codigo;
    private Producto producto;
    private List<Lote> lotes;

    public Stock(String codigo, String nombreProducto, Producto prod) {
        this.codigo = codigo;
        this.producto = prod;
    }

    public List<Lote> getLotes(){
        return this.lotes;
    }
}
