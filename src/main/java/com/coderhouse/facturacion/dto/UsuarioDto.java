package com.coderhouse.facturacion.dto;

import com.coderhouse.facturacion.model.Comprador;
import com.coderhouse.facturacion.model.Usuarios;
import com.coderhouse.facturacion.model.Vendedor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDto {

    private Long id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String contrasenia;
    private byte edad;
    private Vendedor vendedor;
    private Comprador comprador;


    public UsuarioDto (Usuarios usuarios){
        this.id = usuarios.getId();
        this.nombre = usuarios.getNombre();
        this.apellidos = usuarios.getApellidos();
        this.correo = usuarios.getCorreo();
        this.telefono = usuarios.getTelefono();
        this.contrasenia = usuarios.getContrasenia();
        this.edad = usuarios.getEdad();
        this.vendedor = usuarios.getVendedor();
        this.comprador = usuarios.getComprador();

    }
}
