package com.coderhouse.facturacion.repository;

import com.coderhouse.facturacion.model.CarritoDeCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoDeComprasRepository extends JpaRepository<CarritoDeCompras,Integer> {
}
