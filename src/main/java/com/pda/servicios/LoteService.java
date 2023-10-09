package com.pda.servicios;

import com.pda.dao.LoteDAO;
import com.pda.models.Lote;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoteService {

    private final LoteDAO loteDAO;

    public LoteService(LoteDAO loteDAO) {

        this.loteDAO = loteDAO;
    }

    public List<Lote> findAll() {
        return loteDAO.findAll();
    }

    public void deleteLoteById(Long loteId) {
        loteDAO.deleteById(loteId);
    }

    public Lote actualizarCantidadLote(Long id, Lote loteActualizado) {
        Optional<Lote> loteOptional = loteDAO.findById(id);
        if (loteOptional.isPresent()) {
            Lote loteExistente = loteOptional.get();
            loteExistente.setCantidad(loteActualizado.getCantidad());
            return loteDAO.save(loteExistente);
        } else {
            return null;
        }
    }

    public List<Lote> findByProductoId(Long productoId) {
        return loteDAO.findByProductoId(productoId);
    }
}