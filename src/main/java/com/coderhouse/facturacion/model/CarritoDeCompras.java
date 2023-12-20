package com.coderhouse.facturacion.model;

import com.coderhouse.facturacion.dto.CarritoDeComprasDto;
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

    public CarritoDeCompras(CarritoDeComprasDto carritoDeComprasDto) {
        this.idCarrito = carritoDeComprasDto.getIdCarrito();
        this.SKUProducto = carritoDeComprasDto.getSKUProducto();
        this.idusuario = carritoDeComprasDto.getIdusuario();
        this.fecha = carritoDeComprasDto.getFecha();
        this.cantidad = carritoDeComprasDto.getCantidad();
    }
}
