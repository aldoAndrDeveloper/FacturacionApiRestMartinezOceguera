package com.coderhouse.facturacion.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vendedor")
public class Vendedor  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVendedor;
    private String nombreDeTienda;
/*
    public Vendedor(Long idVendedor, String nombreDeTienda) {
        this.idVendedor = idVendedor;
        this.nombreDeTienda = nombreDeTienda;
    }

    public Vendedor(Long id, String nombre, String apellidos, String correo, String telefono, String contrasenia, byte edad, Long idVendedor, Long idComprador, Long idVendedor1, String nombreDeTienda) {
        super(id, nombre, apellidos, correo, telefono, contrasenia, edad, , comprador);
        this.idVendedor = idVendedor1;
        this.nombreDeTienda = nombreDeTienda;
    }
    */
}

