package com.pda.servicios;

import com.pda.dao.VentasRepository;
import com.pda.models.Producto;
import com.pda.models.Renglon;
import com.pda.models.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VentaService {

    private final VentasRepository ventaRepository;

    @Autowired
    public VentaService(VentasRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    // Método para agregar una venta
    public Venta addVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    // Método para obtener todas las ventas por siaca
    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }
    public Venta createVentaFromProductos(List<Producto> productos) {
        Venta venta = new Venta();
        venta.setFecha(new Date()); // Establecer la fecha actual

        List<Renglon> renglones = new ArrayList<>();
        Map<String, Renglon> renglonMap = new HashMap<>();
        double total = 0;

        for (Producto producto : productos) {
            Renglon renglon = renglonMap.get(producto.getNombre());

            if (renglon == null) {
                // Si el producto no está en los renglones, crear un nuevo renglón
                renglon = new Renglon(producto.getNombre(), 0, 0); // Inicializar con cantidad 0 porque se incrementará más adelante
                renglon.setVenta(venta); // Asociar el renglon con la venta
                renglones.add(renglon);
                renglonMap.put(producto.getNombre(), renglon);
            }

            // Incrementar la cantidad del renglón
            renglon.setCantidad(renglon.getCantidad() + 1);
            total += producto.getPrecioMinorista(); // Sumar al total
        }

        venta.setRenglones(renglones); // Asociar los renglones con la venta
        venta.setMonto(total);

        return ventaRepository.save(venta); // Guardar la venta y los renglones en la base de datos
    }


}
