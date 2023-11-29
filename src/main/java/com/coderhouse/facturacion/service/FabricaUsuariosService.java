package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.UsuarioDto;
import com.coderhouse.facturacion.model.Usuarios;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaUsuariosService {
    public Usuarios crearUsuario(UsuarioDto usuarioDto){
        return new Usuarios(usuarioDto);
    }

    public  UsuarioDto crearUsuariosDto(Usuarios  usuarios){
        return new UsuarioDto(usuarios);
    }


    public List<UsuarioDto> crearUsuariosDto(List<Usuarios> clienteList){
        List<UsuarioDto> usuariosDtoList = new ArrayList<>();
        clienteList.stream().forEach(
                usuarioDto -> usuariosDtoList.add(crearUsuariosDto(usuarioDto))
        );

        return usuariosDtoList;
    }
}
