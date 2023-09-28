package com.pda.dao;

import com.pda.models.Lote;
import com.pda.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.security.Signature;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Long> {

    @Query("SELECT * FROM lote WHERE stockid = :productoId")
    public List<Lote> findByProductoId(@Param("productoId") Long productoId);
}
