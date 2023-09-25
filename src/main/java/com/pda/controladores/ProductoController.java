package com.pda.controladores;
import com.pda.models.Producto;
import com.pda.servicios.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController


@RequestMapping(path = "api/producto")

public class ProductoController
{
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService=productoService;
    }

    @GetMapping
    public List<Producto> getProducto()
    {
         return this.productoService.getProducto();
    }

}
