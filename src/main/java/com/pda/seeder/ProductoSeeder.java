package com.pda.seeder;

import com.pda.dao.ProductoDAO;
import com.pda.models.Producto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductoSeeder implements CommandLineRunner {

    private final ProductoDAO productoDAO;

    public ProductoSeeder(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        if (productoDAO.count() == 0) { // Evita la inserción si ya hay datos
            productoDAO.save(new Producto(1, "Queso Fresco", "Queso fresco de vaca", 50, 150.00, 120.50, 250));
            productoDAO.save(new Producto(2, "Manteca", "Manteca pura", 40, 210.00, 180.00, 250));
            productoDAO.save(new Producto(3, "Dulce de Leche", "Dulce de leche tradicional", 30, 110.00, 90.00, 250));
            productoDAO.save(new Producto(4, "Jamón", "Embutido de jamón", 25, 280.00, 250.00, 250));
            productoDAO.save(new Producto(5, "Leche entera pasteurizada", "Leche entera", 200, 120.00, 100.00, 200));
            productoDAO.save(new Producto(6, "Jamón", "Jamón", 25, 280.00, 250.00, 300));
            productoDAO.save(new Producto(7, "Yogurt natural", "Yogurt natural", 100, 120.00, 100.00, 200));
            productoDAO.save(new Producto(8, "Yogurt con frutas", "Yogurt con frutas", 100, 180.00, 150.00, 200));
            productoDAO.save(new Producto(9, "Helado de vainilla", "Helado de vainilla", 100, 120.00, 100.00, 200));
            productoDAO.save(new Producto(10, "Helado de chocolate", "Helado de chocolate", 100, 180.00, 150.00, 200));
            productoDAO.save(new Producto(11, "Galletas de chocolate", "Galletas de chocolate", 100, 120.00, 100.00, 200));
            productoDAO.save(new Producto(12, "Galletas de vainilla", "Galletas de vainilla", 100, 180.00, 150.00, 200));
            productoDAO.save(new Producto(13, "Chocolate en barra", "Chocolate en barra", 100, 120.00, 100.00, 200));
            productoDAO.save(new Producto(14, "Chocolate con leche", "Chocolate con leche", 100, 180.00, 150.00, 200));
            productoDAO.save(new Producto(15, "Arroz", "Arroz", 100, 120.00, 100.00, 200));
        }
    }


}
