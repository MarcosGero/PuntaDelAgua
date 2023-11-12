package com.pda.seeder;

import com.pda.dao.ProductoDAO;
import com.pda.dao.VentaDAO;
import com.pda.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

@Component
public class VentaSeeder implements CommandLineRunner {
    private final VentaDAO ventaDAO;
    private final ProductoDAO productoDAO;
    public VentaSeeder(VentaDAO ventaDAO,ProductoDAO productoDAO) {
        this.ventaDAO = ventaDAO;
        this.productoDAO = productoDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        if (ventaDAO.count() == 0) {
            Calendar calendar = Calendar.getInstance();
            for (int i = 0; i < 20; i++) {
                calendar.add(Calendar.DAY_OF_YEAR, -i);
                // Obtén productos aleatorios
                Producto producto1 = productoDAO.findById((long) (Math.random() * 5 + 1)).orElseThrow();
                Producto producto2 = productoDAO.findById((long) (Math.random() * 5 + 1)).orElseThrow();

                // Cantidad y monto aleatorios (o fijos, según lo que necesites)
                int cantidad1 = (int) (Math.random() * 10 + 1);
                int cantidad2 = (int) (Math.random() * 10 + 1);
                double monto1 = cantidad1 * producto1.getPrecioMinorista();
                double monto2 = cantidad2 * producto2.getPrecioMinorista();

                Renglon renglon1 = new Renglon(producto1, cantidad1, monto1);
                Renglon renglon2 = new Renglon(producto2, cantidad2, monto2);

                // Total de la venta
                double totalVenta = monto1 + monto2;

                // Crea una venta
                Venta venta = new Venta(calendar.getTime(), totalVenta, Arrays.asList(renglon1, renglon2), TipoFactura.A, TipoVenta.MINORISTA);

                // Establece la venta en cada renglón
                renglon1.setVenta(venta);
                renglon2.setVenta(venta);

                // Guarda la venta
                ventaDAO.save(venta);
                calendar.setTime(new Date());
            }
        }

    }
}
