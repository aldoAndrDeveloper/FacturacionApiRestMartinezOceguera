package com.coderhouse.facturacion.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name="productos")

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    //ID del producto
    private String SKU;
    //nonmbre del producto
    private String nombreProducto;
    //Descripción del producto
    private String descripcionProducto;
    //Precio del producto
    private double precio;
    //Cantidad del producto en inventario
    private int cantidadInventariada;
    //Reseñas del producto
   // private List <ReseniasDeProducto> reseniasDeProductos;
    // Vendedores que venden ese producto, puede haber varios vendedores que vendan el mismo producto
 //   private List<Vendedor> vendedores;

    public Productos(String SKU, String nombreProducto, String descripcionProducto, double precio, int cantidadInventariada) {
        this.SKU = SKU;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.cantidadInventariada = cantidadInventariada;
       // this.reseniasDeProductos = reseniasDeProductos;
      //  this.vendedores = vendedores;
    }
}
