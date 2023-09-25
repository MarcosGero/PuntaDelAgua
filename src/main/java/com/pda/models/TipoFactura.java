package com.pda.models;

public enum TipoFactura {
    A, B, C;
    public String getTipoFactura() {
        switch (this) {
            case A:
                return "Factura tipo A";
            case B:
                return "Factura tipo B";
            case C:
                return "Factura tipo C";
            default:
                return "Tipo de factura no válida";
        }
    }
}
