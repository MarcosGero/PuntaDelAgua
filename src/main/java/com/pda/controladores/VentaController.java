package com.pda.controladores;

import com.pda.models.Producto;
import com.pda.models.Venta;
import com.pda.servicios.VentaService;
import org.hibernate.Hibernate;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<Venta>> getVenta()
    {
        List<Venta> ventas = ventaService.getAllVentas();

        return ResponseEntity.ok(ventas);
    }
    @DeleteMapping("/{ventaId}")
    public ResponseEntity<String> cancelVenta(@PathVariable Long ventaId) {
        try {
            // Agregar un registro para verificar el ID del lote que se va a eliminar
            System.out.println("Intentando cancelar venta con ID: " + ventaId);

            ventaService.cancelVentaById(ventaId); // Donde "deleteLoteById" es un método en tu servicio para eliminar un lote por su ID.
            return ResponseEntity.ok("Venta cancelada correctamente.");
        } catch (Exception e) {
            // Agregar un registro para mostrar cualquier error que ocurra
            System.err.println("Error al cancelar venta: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al cancelar venta.");
        }
    }
    @PostMapping
    public ResponseEntity<Venta> addVenta(@RequestBody Venta venta) {
        System.out.println("La id de la venta es  : " + venta.getId());
        Venta nuevaVenta = ventaService.createVenta(venta);
        return ResponseEntity.ok(nuevaVenta);
    }


}