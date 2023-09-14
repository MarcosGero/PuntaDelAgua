package com.pda.controladores;

@RestController
public class MiControlador {
    @GetMapping("/")
    public String hola() {
        return "¡Hola Mundo!";
    }
}
