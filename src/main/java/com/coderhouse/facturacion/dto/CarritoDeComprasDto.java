package com.coderhouse.facturacion.dto;


import com.coderhouse.facturacion.model.CarritoDeCompras;
import com.coderhouse.facturacion.model.Usuarios;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarritoDeComprasDto {
    private int idCarrito;
    private String skuproducto;
    private Usuarios idusuario;
    private String fecha;
    private int cantidad;
    private boolean comprado;

    public CarritoDeComprasDto(CarritoDeCompras carritoDeCompras) {
        this.idCarrito = carritoDeCompras.getIdCarrito();
        this.skuproducto = carritoDeCompras.getSkuproducto();
        this.idusuario = carritoDeCompras.getIdusuario();
        this.fecha = carritoDeCompras.getFecha();
        this.cantidad = carritoDeCompras.getCantidad() ;
        this.comprado = carritoDeCompras.isComprado();
    }
}
