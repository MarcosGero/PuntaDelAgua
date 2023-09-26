package com.pda.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.OneToMany;

import java.util.List;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Stock {
    private String codigo;//debe serl el mismo que Producto.ID
    private String nombre;//Producto.nombre
    private int stockMinimo;
    private int stockActual;
    private float peso; //Eventualmente no se utilizará (Productos que no se necesiten llevar cuenta de su peso)

    public Stock(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    private Producto producto;

    @OneToMany
    private List<Lote> lotes;

    public Stock(String codigo, String nombreProducto, Producto prod) {
        this.codigo = codigo;
        this.producto = prod;
    }
    public Stock(){

    }

    public List<Lote> getLotes(){
        return this.lotes;
    }
}
