package com.pda.dao;

import com.pda.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VentaDAO extends JpaRepository<Venta, Long> {

}
