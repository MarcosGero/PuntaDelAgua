package com.pda.servicios;

import com.pda.Iterador;

import com.pda.RenglonIterador;
import com.pda.dao.VentaDAO;
import com.pda.models.*;
import org.hibernate.Hibernate;
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
        List<Venta> ventas = ventaDAO.findAll();
        return ventas;
    }
    public void cancelVentaById(Long ventaId) {
        ventaDAO.deleteById(ventaId);
    }
    public Venta createVenta(Venta venta) {
        RenglonIterador rengIt = new RenglonIterador(venta.getRenglones());


         while (rengIt.hasNext()) {
             rengIt.next().setVenta(venta);
         }
        venta.setMonto(rengIt.sumarMontos());//Para encapsulacion aunque haga dos vueltas, se usa el sumarMontos del mismo iterador
        //Calculo el monto en el back para consistencia de datos. asegurarse de que al guardar los renglones el monto de la venta se corresponda con esos renglones.
        return ventaDAO.save(venta);
    }

}
