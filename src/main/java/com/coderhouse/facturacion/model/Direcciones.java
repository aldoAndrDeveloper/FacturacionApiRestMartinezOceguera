package com.coderhouse.facturacion.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "direcciones")
public class Direcciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDirtecciones;
    private String calle;
    private String numExt;
    private String numInt;
    private String colonia;
    private String codigoPostal;
    /*
     * Para Ciudad, estado y pais podríamos poner listas alimentada desde una BD
     * pero para el entregable lo deajaré así estático*/
    private String ciudad;
    private String estado;
    private String pais;
}
