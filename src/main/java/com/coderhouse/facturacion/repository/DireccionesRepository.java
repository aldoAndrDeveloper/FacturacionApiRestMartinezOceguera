package com.coderhouse.facturacion.repository;

import com.coderhouse.facturacion.model.Direcciones;
import org.hibernate.query.criteria.JpaParameterExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionesRepository extends JpaRepository<Direcciones,Integer> {
}
