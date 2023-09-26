package com.pda.dao;

import com.pda.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VentasRepository extends JpaRepository<Producto, Integer> {

}
