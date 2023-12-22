package com.coderhouse.facturacion.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "comprador")

public class Comprador {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idComprador;


    //Constructor que recibe argumentos
/*    public Comprador(int idComprador) {
        this.idComprador = idComprador;
    }
   */
/*
    public Comprador(Long id, String nombre, String apellidos, String correo, String telefono, String contrasenia, byte edad, Long idVendedor, Long idComprador, int idComprador1) {
        super(id, nombre, apellidos, correo, telefono, contrasenia, edad, idVendedor, idComprador);
        this.idComprador = idComprador1;
    }
*/
}
