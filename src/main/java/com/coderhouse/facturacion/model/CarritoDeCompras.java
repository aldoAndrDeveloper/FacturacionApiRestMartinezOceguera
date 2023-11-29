package com.coderhouse.facturacion.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="carrito_de_compras")
public class CarritoDeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarrito;
    private String SKUProducto;
    private int idusuario;
    private String fecha;
    private int cantidad;

    public CarritoDeCompras(String SKUProducto, int idusuario, String fecha, int cantidad) {
        this.SKUProducto = SKUProducto;
        this.idusuario = idusuario;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }
}
