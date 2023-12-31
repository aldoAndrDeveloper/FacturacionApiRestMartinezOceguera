package com.coderhouse.facturacion.model;

import com.coderhouse.facturacion.dto.CarritoDeComprasDto;
import com.coderhouse.facturacion.dto.VentasDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;
    private String factura;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "idCarrito")
    private CarritoDeCompras idCarrito;

    public Ventas(VentasDto ventasDto) {
        this.idVenta = ventasDto.getIdVenta();
        this.factura = ventasDto.getFactura();
        this.idCarrito = ventasDto.getIdCarrito();
    }
}
