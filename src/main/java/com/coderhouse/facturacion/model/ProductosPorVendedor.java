package com.coderhouse.facturacion.model;

import com.coderhouse.facturacion.dto.ProductosPorVendedorDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "producto_por_vendedor")
public class ProductosPorVendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto_cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idProducto")
    private Productos productos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idVendedor")
    private Vendedor vendedor;

    public ProductosPorVendedor(ProductosPorVendedorDto productosPorVendedorDto) {
        this.id_producto_cliente = productosPorVendedorDto.getId_producto_cliente();
        this.productos = productosPorVendedorDto.getProductos();
        this.vendedor = productosPorVendedorDto.getVendedor();
    }

}
