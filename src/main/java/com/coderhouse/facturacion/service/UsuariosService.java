package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.UsuarioDto;
import com.coderhouse.facturacion.repository.UsariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired // es para inyectar esta clase a nuestro servicio
    private FabricaUsuariosService fabricaUsuariosService;
    @Autowired
    private UsariosRepository usariosRepository;

    /**ClienteDto es el modelo con las variables (nombres) que se van a mostrar en el JSON
     * al recibir un json con los mismos nombres debemos convertirlos a los nombres originales de las tablas
     * por eso en el constructor de Cliente se igualan con los valores de ClienteDto
     **/
    public UsuarioDto save(UsuarioDto clienteDto){
        return fabricaUsuariosService.crearUsuariosDto(usariosRepository.save(fabricaUsuariosService.crearUsuario(clienteDto)));
    }
    public List<UsuarioDto> findAll(){
        return fabricaUsuariosService.crearUsuariosDto(usariosRepository.findAll());
    }
    public UsuarioDto findById(Integer id){
        return fabricaUsuariosService.crearUsuariosDto(usariosRepository.findById(id).get());}
    public void deleteById(Integer id){
        usariosRepository.deleteById(id);
    }

}
