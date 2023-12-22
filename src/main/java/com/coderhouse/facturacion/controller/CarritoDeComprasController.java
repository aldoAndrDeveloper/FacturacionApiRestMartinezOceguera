package com.coderhouse.facturacion.controller;

import com.coderhouse.facturacion.dto.CarritoDeComprasDto;
import com.coderhouse.facturacion.dto.VentasDto;
import com.coderhouse.facturacion.model.CarritoDeCompras;
import com.coderhouse.facturacion.repository.CarritoDeComprasRepository;
import com.coderhouse.facturacion.repository.VentasRepository;
import com.coderhouse.facturacion.service.CarritoDeComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrito")
public class CarritoDeComprasController {

   private final CarritoDeComprasRepository carritoDeComprasRepository;
   CarritoDeComprasController(CarritoDeComprasRepository carritoDeComprasRepository){
       this.carritoDeComprasRepository = carritoDeComprasRepository;

   }
    @Autowired
    private CarritoDeComprasService carritoDeComprasService;

   @Autowired
   private VentasController ventasController;

    @PostMapping("/guardar")
    public ResponseEntity<CarritoDeComprasDto> save(@RequestBody CarritoDeComprasDto carritoDeComprasDto) {
        return new ResponseEntity<>( carritoDeComprasService.save(carritoDeComprasDto), HttpStatus.OK);
    }

    @PutMapping("/comprar/{id}")
    public ResponseEntity<CarritoDeComprasDto> comprar(@PathVariable int id) {
       // carritoDeComprasService.findById(id);

        carritoDeComprasRepository.findById(id).map(carritoDeCompras -> {
            carritoDeCompras.setComprado(true);
            return carritoDeComprasRepository.save(carritoDeCompras);
        } );

        CarritoDeComprasDto carritoDeComprasDtoResp = new CarritoDeComprasDto();
        carritoDeComprasDtoResp = carritoDeComprasService.findById(id);

        CarritoDeCompras carritoDeCompras = new CarritoDeCompras();
        carritoDeCompras.setIdCarrito(carritoDeComprasDtoResp.getIdCarrito());
        carritoDeCompras.setCantidad(carritoDeComprasDtoResp.getCantidad());
        carritoDeCompras.setFecha(carritoDeComprasDtoResp.getFecha());
        carritoDeCompras.setIdusuario(carritoDeComprasDtoResp.getIdusuario());
        carritoDeCompras.setSkuproducto(carritoDeComprasDtoResp.getSkuproducto());
        carritoDeCompras.setComprado(carritoDeComprasDtoResp.isComprado());
        /* Actualizar compra*/
        VentasDto ventasDtoSet = new VentasDto();
        VentasDto ventasDtoGet = new VentasDto();
      //  ventasDtoSet.getIdCarrito().setIdCarrito(7);

        ventasDtoSet.setIdCarrito(carritoDeCompras);
        ventasDtoSet.setFactura("Factura de compra numero "+ id);
        //ventasDtoGet =
        ventasController.save(ventasDtoSet);
        return new ResponseEntity<>(HttpStatus.OK);
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
