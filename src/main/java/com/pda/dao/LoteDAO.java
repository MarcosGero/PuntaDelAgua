package com.pda.dao;

import com.pda.models.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LoteDAO extends JpaRepository<Lote, Long> {

<<<<<<< Updated upstream:src/main/java/com/pda/dao/LoteDAO.java
    @Query("SELECT l FROM Lote l WHERE l.productId = :productoId")
=======
    @Query("SELECT l.id, l.fechaDeVencimiento, l.cantidad, l.stockId FROM Lote l WHERE l.productoId = :productoId\n")
>>>>>>> Stashed changes:src/main/java/com/pda/dao/LoteRepository.java
    public List<Lote> findByProductoId(@Param("productoId") Long productoId);

}
