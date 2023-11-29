package com.coderhouse.facturacion.repository;

import com.coderhouse.facturacion.model.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador,Integer> {
}
