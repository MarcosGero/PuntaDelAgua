package com.pda.dao;

import com.pda.models.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LoteDAO extends JpaRepository<Lote, Long> {

    @Query("SELECT l FROM Lote l WHERE l.productId = :productoId")
    public List<Lote> findByProductoId(@Param("productoId") Long productoId);

    @Query("SELECT COALESCE(MAX(l.id), 0) FROM Lote l")
    Long findMaxId();

}
