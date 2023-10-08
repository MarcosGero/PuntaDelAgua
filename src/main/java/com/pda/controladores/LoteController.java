package com.pda.controladores;

import com.pda.models.Lote;
import com.pda.servicios.LoteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/* RestController importa los paquetes para indicar que la clase va a ser un controlador */
@RestController

/* RequestMapping define la ruta que se va a utilizar para obtener los datos en el navegador */
@RequestMapping(path = "api/lote")

public class LoteController
{
    /* GetMapping se encarga de definir que la clase de va a comportar como una entidad GET en HTTP*/

    private final LoteService service;

    public LoteController(LoteService service) {
        this.service = service;
    }



    /* Se define un metodo para poder devolver la informacion del modelo en forma de JSON */

    @GetMapping
    public ResponseEntity<List<Lote>> getLote() {
        List<Lote> lotes = service.findAll();
        return ResponseEntity.ok(lotes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Lote>> getLotesByProductoId(@PathVariable Long id) {
        List<Lote> lotes = service.findByProductoId(id);
        return ResponseEntity.ok(lotes);
    }
    @DeleteMapping("/{loteId}")
    public ResponseEntity<String> deleteLote(@PathVariable Long loteId) {
        try {
            // Agregar un registro para verificar el ID del lote que se va a eliminar
            System.out.println("Intentando eliminar el lote con ID: " + loteId);

            service.deleteLoteById(loteId); // Donde "deleteLoteById" es un método en tu servicio para eliminar un lote por su ID.
            return ResponseEntity.ok("Lote eliminado correctamente.");
        } catch (Exception e) {
            // Agregar un registro para mostrar cualquier error que ocurra
            System.err.println("Error al eliminar el lote: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el lote.");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lote> actualizarCantidadLote(@PathVariable Long id, @RequestBody Lote loteActualizado) {
        try {
            Lote loteExistente = service.actualizarCantidadLote(id, loteActualizado);
            if (loteExistente != null) {
                return ResponseEntity.ok(loteExistente);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }


}