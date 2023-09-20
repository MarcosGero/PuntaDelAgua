package com.pda.modelos;

import java.util.List;

public class Stock {
    private String codigo;//debe serl el mismo que Producto.ID
    private String nombre;//Producto.nombre
    private int stockMinimo;
    private int stockActual;
    private float peso; //Eventualmente no se utilizará (Productos que no se necesiten llevar cuenta de su peso)

    private Lote lote;

    public Stock(String codigo, String nombre, List<Producto> productos) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}
