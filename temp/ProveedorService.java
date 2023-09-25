package com.pda.temp;

import org.springframework.stereotype.Service;

@Service
public class ProveedorService {
    public Proveedor getProveedor(){
        return new Proveedor();
    }
}
