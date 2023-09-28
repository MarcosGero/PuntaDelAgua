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
    @OneToOne
    private Producto producto;
    private String nombre;//Producto.nombre
    private int stockMinimo;
    private int stockActual;
    private float peso; //Eventualmente no se utilizará (Productos que no se necesiten llevar cuenta de su peso)

    public Stock( String nombre) {
        this.nombre = nombre;
    }


    public Stock(){

    }

}
