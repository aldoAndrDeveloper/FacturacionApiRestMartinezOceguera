package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.CarritoDeComprasDto;
import com.coderhouse.facturacion.repository.CarritoDeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarritoDeComprasService {

    @Autowired // es para inyectar esta clase a nuestro servicio
    private FabricaCarritoDeCompras fabricaCarritoDeCompras;
    @Autowired
    private CarritoDeComprasRepository carritoDeComprasRepository;

    /**ClienteDto es el modelo con las variables (nombres) que se van a mostrar en el JSON
     * al recibir un json con los mismos nombres debemos convertirlos a los nombres originales de las tablas
     * por eso en el constructor de Cliente se igualan con los valores de ClienteDto
     **/
    public CarritoDeComprasDto save(CarritoDeComprasDto carritoDeComprasDto){
        return fabricaCarritoDeCompras.crearCarritoDeComprasDto(carritoDeComprasRepository.save(fabricaCarritoDeCompras.crearCarritoDeCompras(carritoDeComprasDto)));
    }
    public List<CarritoDeComprasDto> findAll(){
        return fabricaCarritoDeCompras.crearCarritoDeComprasDto(carritoDeComprasRepository.findAll());
    }
    public CarritoDeComprasDto findById(Integer id){
        return fabricaCarritoDeCompras.crearCarritoDeComprasDto(carritoDeComprasRepository.findById(id).get());}
    public void deleteById(Integer id){
        carritoDeComprasRepository.deleteById(id);
    }


}
