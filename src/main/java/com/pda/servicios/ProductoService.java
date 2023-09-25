package com.pda.servicios;

import com.pda.modelos.Producto;
import org.springframework.stereotype.Service;


@Service
public class ProductoService {

    public ProductoService() {

    }

    public Producto getProducto()
    {
        Producto producto = new Producto();
        return producto;
    }
}
