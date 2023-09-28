package com.pda.dao;

import com.pda.models.Lote;
import com.pda.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Long> {

    List<Lote> findByStockProductoId(Long stockProductoId);
}
