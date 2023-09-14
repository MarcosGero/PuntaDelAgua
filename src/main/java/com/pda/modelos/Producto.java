package com.pda.modelos;

import java.util.List;



public class Producto {
    private String nombre;
    private double precioMayor;
    private double precioMinorista;
    private int ID;
    private String detalle;
    private int cantidad;
    private String lote;
    private Proveedor proveedor;
    private List<Venta> ventas;

    public Producto(int id, String nombre, String detalle, Proveedor proveedor) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.proveedor = proveedor;
        this.ID=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioMayor() {
        return precioMayor;
    }

    public void setPrecioMayor(double precioMayor) {
        this.precioMayor = precioMayor;
    }

    public double getPrecioMinorista() {
        return precioMinorista;
    }

    public void setPrecioMinorista(double precioMinorista) {
        this.precioMinorista = precioMinorista;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
// Constructores, getters, setters y otros métodos relevantes...
}