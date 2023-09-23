package com.pda.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositoController {

    @GetMapping("/hola")
    public String hola()
    {
        return "¡Hola Mundo!";
    }
}
