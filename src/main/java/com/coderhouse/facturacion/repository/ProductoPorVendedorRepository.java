package com.coderhouse.facturacion.repository;

import com.coderhouse.facturacion.model.ProductosPorVendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoPorVendedorRepository extends JpaRepository<ProductosPorVendedor,Integer> {
}
