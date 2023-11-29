package com.coderhouse.facturacion.model;

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
/*
    public Ventas (String SKUProducto, int idUsuario, String fecha, int cantidad, String factura){
        super(SKUProducto,  idUsuario,  fecha, cantidad);
        this.factura=factura;
    }
*/
}
