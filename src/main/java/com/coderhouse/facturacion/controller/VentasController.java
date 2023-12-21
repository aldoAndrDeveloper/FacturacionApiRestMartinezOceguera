package com.coderhouse.facturacion.controller;

import com.coderhouse.facturacion.dto.UsuarioDto;
import com.coderhouse.facturacion.dto.VentasDto;
import com.coderhouse.facturacion.service.FabricaUsuariosService;
import com.coderhouse.facturacion.service.UsuariosService;
import com.coderhouse.facturacion.service.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {
    @Autowired
    private VentasService ventasService;

    @PostMapping("/guardar")
    public ResponseEntity<VentasDto> save(@RequestBody VentasDto ventasDto) {
        /*Usamos este método para validar que el formato de fecha sea correcto
         * Si no lo es se arrojará la excepción que creamos con el mensaje:
         * "El formato de fecha no es válido, asegurate de ser dd/mm/aaaa"/
         */
        //fabricaClienteService.validarFecha(clienteDto.getEdad());
        //Si no falla entonces se agregará exitosamente el dato en la tabla
        return new ResponseEntity<>( ventasService.save(ventasDto), HttpStatus.OK);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<VentasDto>> findAll(){
        //Para convertir la fecha de nacimiento a la edad actual haremos lo siguiente

        //1.-Vamos a llamar la lista de clientes
        List<VentasDto> ventasDtoList =  ventasService.findAll();

        return new ResponseEntity<>(ventasDtoList,HttpStatus.OK);
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<VentasDto> findById(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(ventasService.findById(id), HttpStatus.OK);
        }catch(Exception ex){
            //Si no encuentra datos en lugar de mostrar un error mandaremos un Status de NOT_FOUND
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        try{
            //Se elimina usando el metodo de la clase de servicio usando el Id
            ventasService.deleteById(id);
            //Si se eliminó mandaremos un status 200
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception ex){
            //Si no se encuentra enviaremos un status 404
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
