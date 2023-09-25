package com.pda.modelos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Stock {
    private String codigo;
    private Producto producto;
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
