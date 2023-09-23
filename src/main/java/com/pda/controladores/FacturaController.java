package com.pda.controladores;

import com.pda.modelos.Factura;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



/* RestController importa los paqueres para indicar que la clase va a ser un controlador */
@RestController

/* RequestMapping define la ruta que se va a utilizar para obtener los datos en el navegador */
@RequestMapping(path = "api/factura")

public class FacturaController
{
    /* GetMapping se encarga de definir que la clase de va a comportar como una entidad GET en HTTP*/
    @GetMapping

    /* Se define un metodo para poder devolver la informacion del modelo en forma de JSON */
    public Factura getFactura()
    {
        Factura factura = new Factura();
        return factura;

    }

}