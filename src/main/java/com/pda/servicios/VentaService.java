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
    public Venta createVentaFromProductos(List<Producto> productos) {
        Iterador<Renglon> iterador = new RenglonIterador(productos);
        List<Renglon> renglones = new ArrayList<>();
        double total = 0;

        while(iterador.hasNext()) {
            Renglon renglon = iterador.next();
            renglones.add(renglon);
            total += renglon.getCantidad() * renglon.getMonto();
        }

        Venta venta = new Venta();
        venta.setRenglones(renglones);
        venta.setMonto(total);

        return ventaDAO.save(venta); // Guardar la venta y los renglones en la base de datos
    }

}
