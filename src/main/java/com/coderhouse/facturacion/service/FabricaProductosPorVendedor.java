package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.ProductosPorVendedorDto;
import com.coderhouse.facturacion.dto.UsuarioDto;
import com.coderhouse.facturacion.model.ProductosPorVendedor;
import com.coderhouse.facturacion.model.Usuarios;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaProductosPorVendedor {

    public ProductosPorVendedor crearProductosPorVendedor(ProductosPorVendedorDto productosPorVendedorDto){
        return new ProductosPorVendedor(productosPorVendedorDto);
    }

    public  ProductosPorVendedorDto crearProductosPorVendedorDto(ProductosPorVendedor  productosPorVendedor){
        return new ProductosPorVendedorDto(productosPorVendedor);
    }


    public List<ProductosPorVendedorDto> crearProductosPorVendedorDto(List<ProductosPorVendedor> clienteList){
        List<ProductosPorVendedorDto> productosPorVendedorDtos = new ArrayList<>();
        clienteList.stream().forEach(
                productosPorVendedor -> productosPorVendedorDtos.add(crearProductosPorVendedorDto(productosPorVendedor))
        );

        return productosPorVendedorDtos;
    }
}
