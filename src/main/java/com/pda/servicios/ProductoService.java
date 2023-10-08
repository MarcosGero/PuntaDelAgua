package com.pda.servicios;

import com.pda.dao.ProductoDAO;
import com.pda.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoService {
private final ProductoDAO productoDAO;

    public ProductoService(ProductoDAO productoDAO) {

        this.productoDAO = productoDAO;
    }

    public List<Producto> getProducto()
    {
        return productoDAO.findAll();
    }
    public Optional<Producto> findById(Long id) {
        return productoDAO.findById(id);
    }


}
