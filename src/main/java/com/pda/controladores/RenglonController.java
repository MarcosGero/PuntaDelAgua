package com.pda.controladores;

import com.pda.servicios.RenglonService;
import org.springframework.beans.factory.annotation.Autowired;

public class RenglonController {
    private final RenglonService renglonService;
    //Autowired instancia renglonService
@Autowired
    public RenglonController(RenglonService renglonService) {
        this.renglonService = renglonService;
    }
}
