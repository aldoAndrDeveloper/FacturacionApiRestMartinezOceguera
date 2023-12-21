package com.coderhouse.facturacion.controller;

import com.coderhouse.facturacion.dto.CarritoDeComprasDto;
import com.coderhouse.facturacion.service.CarritoDeComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comprador/carrito/")
public class CarritoDeComprasController {
    @Autowired
    private CarritoDeComprasService carritoDeComprasService;

    @PostMapping("/guardar")
    public ResponseEntity<CarritoDeComprasDto> save(@RequestBody CarritoDeComprasDto carritoDeComprasDto) {
        return new ResponseEntity<>( carritoDeComprasService.save(carritoDeComprasDto), HttpStatus.OK);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<CarritoDeComprasDto>> findAll(){
        List<CarritoDeComprasDto> clienteDtoList =  carritoDeComprasService.findAll();

        return new ResponseEntity<>(clienteDtoList,HttpStatus.OK);
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<CarritoDeComprasDto> findById(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(carritoDeComprasService.findById(id), HttpStatus.OK);
        }catch(Exception ex){
            //Si no encuentra datos en lugar de mostrar un error mandaremos un Status de NOT_FOUND
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity< HttpStatus> deleteById(@PathVariable Integer id){
        try{
            //Se elimina usando el metodo de la clase de servicio usando el Id
            carritoDeComprasService.deleteById(id);
            //Si se eliminó mandaremos un status 200
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception ex){
            //Si no se encuentra enviaremos un status 404
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
