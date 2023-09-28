package com.pda.servicios;

import com.pda.dao.ProductoRepository;
import com.pda.models.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoService {
private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {

        this.productoRepository = productoRepository;
    }

    public List<Producto> getProducto()
    {
        return productoRepository.findAll();
    }
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }


}
