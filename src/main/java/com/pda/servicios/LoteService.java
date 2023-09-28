package com.pda.servicios;

import com.pda.dao.LoteRepository;
import com.pda.models.Lote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteService {


    @Autowired
    private LoteRepository loteRepository;



    public List<Lote> findAll() {
        return loteRepository.findAll();
    }

    public List<Lote> findByProductoId(Long productoId) {
        return loteRepository.findByProductoId(productoId);
    }
}