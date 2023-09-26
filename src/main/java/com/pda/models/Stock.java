package com.pda.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Stock {
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
    private long Id;
    private String codigo;//debe serl el mismo que Producto.ID
    private String nombre;//Producto.nombre
    private int stockMinimo;
    private int stockActual;
    private float peso; //Eventualmente no se utilizará (Productos que no se necesiten llevar cuenta de su peso)

    public Stock(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    @OneToOne
    private Producto producto;


    public Stock(String codigo, String nombreProducto, Producto prod) {
        this.codigo = codigo;
        this.producto = prod;
    }
    public Stock(){

    }

}
