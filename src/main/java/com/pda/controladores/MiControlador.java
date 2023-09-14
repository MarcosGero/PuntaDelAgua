package com.pda.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {
    @GetMapping("/")
    public String hola() {
        return "¡Hola Mundo!";
    }
}
