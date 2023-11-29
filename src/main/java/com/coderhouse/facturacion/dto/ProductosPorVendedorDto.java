package com.coderhouse.facturacion.dto;

import com.coderhouse.facturacion.model.Productos;
import com.coderhouse.facturacion.model.ProductosPorVendedor;
import com.coderhouse.facturacion.model.Vendedor;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductosPorVendedorDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto_cliente;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idProducto",nullable = true)
    private Productos productos;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idVendedor",nullable = true)
    private Vendedor vendedor;

    public ProductosPorVendedorDto(ProductosPorVendedor productosPorVendedor) {
        this.id_producto_cliente = productosPorVendedor.getId_producto_cliente();
        this.productos = productosPorVendedor.getProductos();
        this.vendedor = productosPorVendedor.getVendedor();
    }
}
