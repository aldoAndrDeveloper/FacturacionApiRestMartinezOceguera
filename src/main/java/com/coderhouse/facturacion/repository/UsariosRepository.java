package com.coderhouse.facturacion.repository;

import com.coderhouse.facturacion.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsariosRepository extends JpaRepository<Usuarios,Integer> {
}
