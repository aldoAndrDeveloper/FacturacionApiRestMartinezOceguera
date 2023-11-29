package com.coderhouse.facturacion.dto;

import com.coderhouse.facturacion.model.Productos;
import com.coderhouse.facturacion.model.ProductosPorVendedor;
import com.coderhouse.facturacion.model.Vendedor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductosPorVendedorDto {

    private Long id_producto_cliente;
    private Productos productos;
    private Vendedor vendedor;

    public ProductosPorVendedorDto(ProductosPorVendedor productosPorVendedor) {
        this.id_producto_cliente = productosPorVendedor.getId_producto_cliente();
        this.productos = productosPorVendedor.getProductos();
        this.vendedor = productosPorVendedor.getVendedor();
    }
}
