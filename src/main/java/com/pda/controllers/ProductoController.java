package com.pda.controllers;

import com.pda.models.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @GetMapping
    public Producto manteca() {
        // Crear una instancia de Producto y devolverla
        Producto producto = new Producto(
                1,
                "Manteca Punta del Agua",
                "Punta del Agua",
                "Manteca 200G",
                10);
        return producto;
    }
}
