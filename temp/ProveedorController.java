package com.pda.temp;

import com.pda.temp.Proveedor;
import com.pda.temp.ProveedorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/* RestController importa los paquetes para indicar que la clase va a ser un controlador */
@RestController

/* RequestMapping define la ruta que se va a utilizar para obtener los datos en el navegador */
@RequestMapping(path = "api/proveedor")

public class ProveedorController
{
    private ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService){
        this.proveedorService = proveedorService;
    }
    /* GetMapping se encarga de definir que la clase de va a comportar como una entidad GET en HTTP*/
    @GetMapping

    /* Se define un metodo para poder devolver la informacion del modelo en forma de JSON */
    public Proveedor getStock()
    {
        Proveedor proveedor = new Proveedor();
        return proveedorService.getProveedor();
    }

}