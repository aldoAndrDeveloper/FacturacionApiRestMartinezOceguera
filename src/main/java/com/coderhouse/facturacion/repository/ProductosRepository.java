package com.coderhouse.facturacion.repository;

import com.coderhouse.facturacion.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Integer> {
}
