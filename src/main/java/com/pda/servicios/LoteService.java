package com.pda.servicios;

import com.pda.dao.LoteRepository;
import com.pda.models.Lote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LoteService {


    @Autowired
    private LoteRepository loteRepository;



    public List<Lote> findAll() {
        return loteRepository.findAll();
    }

    public void deleteLoteById(Long loteId) {
        loteRepository.deleteById(loteId);
    }

    public Lote actualizarCantidadLote(Long id, Lote loteActualizado) {
        Optional<Lote> loteOptional = loteRepository.findById(id);
        if (loteOptional.isPresent()) {
            Lote loteExistente = loteOptional.get();
            loteExistente.setCantidad(loteActualizado.getCantidad());
            return loteRepository.save(loteExistente);
        } else {
            return null;
        }
    }

    public List<Lote> findByProductoId(Long productoId) {
        return loteRepository.findByProductoId(productoId);
    }
}