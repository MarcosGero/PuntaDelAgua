package com.pda.seeder;

import com.pda.dao.LoteDAO;
import com.pda.dao.ProductoDAO;
import com.pda.models.Lote;
import com.pda.models.Producto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class LoteSeeder implements CommandLineRunner {
    private final LoteDAO loteDAO;
    private final ProductoDAO productoDAO;


    public LoteSeeder(LoteDAO loteDAO,ProductoDAO productoDAO) {
        this.loteDAO = loteDAO;
        this.productoDAO = productoDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (loteDAO.count() == 0) {
            int lotesPorProducto = 5;
            int totalProductos = 15; // Total de productos

            for (long productoId = 1; productoId <= totalProductos; productoId++) {
                for (long loteNum = productoId + 0; loteNum < productoId + lotesPorProducto; loteNum++) {
                    // Calcula la fecha de vencimiento y cantidad para cada lote
                    Date fechaVencimiento = dateFormat.parse("2024-" + String.format("%02d", (loteNum + 1)) + "-" + String.format("%02d", (productoId * 2)));
                    int cantidad = (int) (Math.random() * 100 + 50); // Cantidad aleatoria entre 50 y 150

                    // Crea y guarda el lote
                    Lote lote = new Lote(productoId, fechaVencimiento, cantidad);
                    lote.setId(loteNum);
                    loteDAO.save(lote);
                }
            }

        }
    }
}
