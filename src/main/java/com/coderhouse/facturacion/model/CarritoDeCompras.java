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
    private String skuproducto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id")

    private Usuarios idusuario;
    private String fecha;
    private int cantidad;
    private boolean comprado;
    //@OneToOne(fetch = FetchType.EAGER)
    //@JoinTable( name = "usuarios", joinColumns = @JoinColumn ( name = "id"), inverseJoinColumns = @JoinColumn( name = "idusuario"))

    public CarritoDeCompras(CarritoDeComprasDto carritoDeComprasDto) {
        this.idCarrito   = carritoDeComprasDto.getIdCarrito();
        this.skuproducto = carritoDeComprasDto.getSkuproducto();
        this.idusuario   =   carritoDeComprasDto.getIdusuario();
        this.fecha       = carritoDeComprasDto.getFecha();
        this.cantidad    = carritoDeComprasDto.getCantidad();
        this.comprado    = carritoDeComprasDto.isComprado();
    }
}
