package com.pda.servicios;

import com.pda.Iterador;

import com.pda.RenglonIterador;
import com.pda.dao.VentaDAO;
import com.pda.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VentaService {

    private final VentaDAO ventaDAO;

    @Autowired
    public VentaService(VentaDAO ventaDAO) {
        this.ventaDAO = ventaDAO;
    }

    // Método para agregar una venta
    public Venta addVenta(Venta venta) {
        return ventaDAO.save(venta);
    }

    // Método para obtener todas las ventas por siaca
    public List<Venta> getAllVentas() {
        return ventaDAO.findAll();
    }
    public void cancelVentaById(Long ventaId) {
        ventaDAO.deleteById(ventaId);
    }
    public Venta createVenta(Venta venta) {
        double total = 0;

        for (Renglon renglon : venta.getRenglones()) {
            renglon.setVenta(venta);
            total += renglon.getMonto();
        }

        venta.setMonto(total);
        return ventaDAO.save(venta);
    }

}
