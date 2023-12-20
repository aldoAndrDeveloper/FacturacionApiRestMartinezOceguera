package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.CarritoDeComprasDto;
import com.coderhouse.facturacion.model.CarritoDeCompras;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaCarritoDeCompras {


    public CarritoDeCompras crearCarritoDeCompras(CarritoDeComprasDto carritoDeComprasDto){
        return new CarritoDeCompras(carritoDeComprasDto);
    }

    public  CarritoDeComprasDto crearCarritoDeComprasDto(CarritoDeCompras  carritoDeCompras){
        return new CarritoDeComprasDto(carritoDeCompras);
    }


    public List<CarritoDeComprasDto> crearCarritoDeComprasDto(List<CarritoDeCompras> carritoDeComprasList){
        List<CarritoDeComprasDto> carritoDeComprasDtos = new ArrayList<>();
        carritoDeComprasList.stream().forEach(
                carritoDeCompras -> carritoDeComprasDtos.add(crearCarritoDeComprasDto(carritoDeCompras))
        );

        return carritoDeComprasDtos;
    }
}
