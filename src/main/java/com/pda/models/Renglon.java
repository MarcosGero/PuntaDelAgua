package com.pda.models;

public class Renglon {
    private String nombre; //Producto.nombre
    private int cantidad;
    private float peso;//Eventualmente no se utiliza

    public Renglon(String nombre, int cantidad, float peso) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
