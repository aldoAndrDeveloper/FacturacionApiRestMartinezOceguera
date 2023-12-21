package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.VentasDto;
import com.coderhouse.facturacion.model.Ventas;

import java.util.ArrayList;
import java.util.List;

public class FabricaVentas {


    public Ventas crearVentas(VentasDto ventasDto){
        return new Ventas(ventasDto);
    }

    public  VentasDto crearVentasDto(Ventas  ventas){
        return new VentasDto(ventas);
    }


    public List<VentasDto> crearVentasDto(List<Ventas> ventasList){
        List<VentasDto> ventasDtoArrayList = new ArrayList<>();
        ventasList.stream().forEach(
                ventasDto -> ventasDtoArrayList.add(crearVentasDto(ventasDto))
        );

        return ventasDtoArrayList;
    }
}
