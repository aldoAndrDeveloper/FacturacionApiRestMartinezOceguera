package com.coderhouse.facturacion.model;

import com.coderhouse.facturacion.dto.UsuarioDto;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name ="usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String contrasenia;
    private byte edad;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idVendedor",nullable = true)
   //@PrimaryKeyJoinColumn
    private Vendedor vendedor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idComprador",nullable = true)
    //@PrimaryKeyJoinColumn
    private Comprador comprador;

    public Usuarios(UsuarioDto usuarioDto){
        this.id = usuarioDto.getId();
        this.nombre = usuarioDto.getNombre();
        this.apellidos = usuarioDto.getApellidos();
        this.correo = usuarioDto.getCorreo();
        this.telefono = usuarioDto.getTelefono();
        this.contrasenia = usuarioDto.getContrasenia();
        this.edad = usuarioDto.getEdad();
        this.vendedor = usuarioDto.getVendedor();
        this.comprador = usuarioDto.getComprador();

    }
    /*
    public Usuarios(Long id, String nombre, String apellidos, String correo, String telefono, String contrasenia, byte edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
        this.edad = edad;
    }*/
}
