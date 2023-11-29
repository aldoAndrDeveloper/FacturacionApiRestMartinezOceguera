package com.coderhouse.facturacion.service;

import com.coderhouse.facturacion.dto.ProductosPorVendedorDto;
import com.coderhouse.facturacion.dto.UsuarioDto;
import com.coderhouse.facturacion.repository.ProductoPorVendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoPorVendedorService {

    @Autowired // es para inyectar esta clase a nuestro servicio
    private FabricaProductosPorVendedor fabricaProductosPorVendedor;
    @Autowired
    private ProductoPorVendedorRepository productoPorVendedorRepository;

    /**
     * ClienteDto es el modelo con las variables (nombres) que se van a mostrar en el JSON
     * al recibir un json con los mismos nombres debemos convertirlos a los nombres originales de las tablas
     * por eso en el constructor de Cliente se igualan con los valores de ClienteDto
     **/
    public ProductosPorVendedorDto save(ProductosPorVendedorDto productosPorVendedorDto) {
        return fabricaProductosPorVendedor.crearProductosPorVendedorDto(productoPorVendedorRepository.save(fabricaProductosPorVendedor.crearProductosPorVendedor(productosPorVendedorDto)));
    }

    public List<ProductosPorVendedorDto> findAll() {
        return fabricaProductosPorVendedor.crearProductosPorVendedorDto(productoPorVendedorRepository.findAll());
    }

    public ProductosPorVendedorDto findById(Integer id) {
        return fabricaProductosPorVendedor.crearProductosPorVendedorDto(productoPorVendedorRepository.findById(id).get());
    }

    public void deleteById(Integer id) {
        productoPorVendedorRepository.deleteById(id);
    }

}
