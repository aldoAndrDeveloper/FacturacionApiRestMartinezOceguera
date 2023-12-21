package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.CarritoDeComprasDto;
import com.coderhouse.facturacion.dto.VentasDto;
import com.coderhouse.facturacion.repository.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasService {

    @Autowired // es para inyectar esta clase a nuestro servicio
    private FabricaVentas fabricaVentas;
    @Autowired
    private VentasRepository ventasRepository;

    /**ClienteDto es el modelo con las variables (nombres) que se van a mostrar en el JSON
     * al recibir un json con los mismos nombres debemos convertirlos a los nombres originales de las tablas
     * por eso en el constructor de Cliente se igualan con los valores de ClienteDto
     **/
    public VentasDto save(VentasDto ventasDto){
        return fabricaVentas.crearVentasDto(ventasRepository.save(fabricaVentas.crearVentas(ventasDto)));
    }
    public List<VentasDto> findAll(){
        return fabricaVentas.crearVentasDto(ventasRepository.findAll());
    }
    public VentasDto findById(Integer id){
        return fabricaVentas.crearVentasDto(ventasRepository.findById(id).get());}
    public void deleteById(Integer id){
        ventasRepository.deleteById(id);
    }



}
