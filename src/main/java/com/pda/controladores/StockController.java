package com.pda.controladores;

import com.pda.models.Stock;
import com.pda.models.Lote;
import com.pda.servicios.StockService;
import com.pda.dao.StockRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/* RestController importa los paquetes para indicar que la clase va a ser un controlador */
@RestController

/* RequestMapping define la ruta que se va a utilizar para obtener los datos en el navegador */
@RequestMapping(path = "api/stock")

public class StockController
{
    /* GetMapping se encarga de definir que la clase de va a comportar como una entidad GET en HTTP*/

    private final StockService service;

    public StockController(StockService service) {
        this.service = service;
    }



    /* Se define un metodo para poder devolver la informacion del modelo en forma de JSON */

    @GetMapping
    public ResponseEntity<List<Stock>> getStock() {
        List<Stock> stocks = service.findAll();
        return ResponseEntity.ok(stocks);
    }

}