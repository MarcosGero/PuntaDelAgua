package com.pda.models;

public enum TipoVenta {
    MINORISTA, MAYORISTA;
    public String getTipoVenta() {
        switch (this) {
            case MAYORISTA:
                return "Venta mayorista";
            case MINORISTA:
                return "Venta minorista";
            default:
                return "Tipo de venta no válido";
        }
    }
}
