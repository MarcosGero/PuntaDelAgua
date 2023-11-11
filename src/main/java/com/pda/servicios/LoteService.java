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
    public Long obtenerUltimaId() {
        Long ultimaId = loteDAO.findMaxId(); // Deberás crear este método en tu LoteDAO.
        return ultimaId != null ? ultimaId + 1 : 1L; // Si no hay registros, asigna 1 como primera ID.
    }
    public Lote saveLote(Lote nuevoLote) {
        Long ultimaId = obtenerUltimaId();
        nuevoLote.setId(ultimaId);
        return loteDAO.save(nuevoLote);
    }

    public List<Lote> findByProductoId(Long productoId) {
        return loteDAO.findByProductoId(productoId);
    }
}