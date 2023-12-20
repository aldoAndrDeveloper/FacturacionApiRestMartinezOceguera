package com.coderhouse.facturacion.dto;


import com.coderhouse.facturacion.model.CarritoDeCompras;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarritoDeComprasDto {
    private int idCarrito;
    private String SKUProducto;
    private int idusuario;
    private String fecha;
    private int cantidad;

    public CarritoDeComprasDto(CarritoDeCompras carritoDeCompras) {
        this.idCarrito = carritoDeCompras.getIdCarrito();
        this.SKUProducto = carritoDeCompras.getSKUProducto();
        this.idusuario = carritoDeCompras.getIdusuario();
        this.fecha = carritoDeCompras.getFecha();
        this.cantidad = carritoDeCompras.getCantidad() ;
    }
}
