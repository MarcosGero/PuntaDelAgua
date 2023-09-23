package com.pda.modelos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Stock {
    private String codigo;
    private String nombreProducto;
    private List<Producto> productos;

    public Stock(){

    }
    public Stock(String codigo, String nombreProducto, List<Producto> productos) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.productos = productos;
    }
}
