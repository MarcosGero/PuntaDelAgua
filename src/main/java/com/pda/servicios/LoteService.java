package com.pda.servicios;

import com.pda.dao.LoteRepository;
import com.pda.dao.ProductoRepository;
import com.pda.models.Lote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteService {

    private final LoteRepository loteRepository;

    public LoteService(LoteRepository loteRepository) {

        this.loteRepository = loteRepository;
    }

    public List<Lote> findAll() {
        return loteRepository.findAll();
    }

    public void deleteLoteById(Long loteId) {
        loteRepository.deleteById(loteId);
    }

    public List<Lote> findByProductoId(Long productoId) {
        return loteRepository.findByProductoId(productoId);
    }
}