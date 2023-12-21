package com.coderhouse.facturacion.dto;

import com.coderhouse.facturacion.model.Ventas;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VentasDto {
    private Long idVenta;
    private String factura;
    private int idCarrito;

    public VentasDto(Ventas ventas) {
        this.idVenta = ventas.getIdVenta();
        this.factura = ventas.getFactura();
        this.idCarrito = ventas.getIdCarrito();
    }
}
