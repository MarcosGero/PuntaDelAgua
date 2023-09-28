package com.pda.controladores;

import com.pda.models.Producto;
import com.pda.models.Venta;
import com.pda.servicios.VentaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/* RestController importa los paquetes para indicar que la clase va a ser un controlador */
@RestController

/* RequestMapping define la ruta que se va a utilizar para obtener los datos en el navegador */
@RequestMapping(path = "api/venta")

public class VentaController
{
    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    /* GetMapping se encarga de definir que la clase de va a comportar como una entidad GET en HTTP*/
    @GetMapping

    /* Se define un metodo para poder devolver la informacion del modelo en forma de JSON */
    public Venta getVenta()
    {
        Venta venta = new Venta();
        return venta;
    }
    @PostMapping
    public ResponseEntity<Venta> addVenta(@RequestBody List<Producto> productos) {
        Venta nuevaVenta = ventaService.createVentaFromProductos(productos);
        return ResponseEntity.ok(nuevaVenta);
    }


}