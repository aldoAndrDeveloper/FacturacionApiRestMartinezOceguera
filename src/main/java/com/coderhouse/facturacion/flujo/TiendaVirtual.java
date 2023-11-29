package com.coderhouse.facturacion.flujo;

import com.coderhouse.facturacion.model.CarritoDeCompras;
import com.coderhouse.facturacion.model.Productos;

import java.util.List;

public interface TiendaVirtual {
     void agregarCarrito(Productos producto, int idUsuario, int cantidad);
     List <CarritoDeCompras> verCarritoDeCompras(int idUsuario);
     void comprar(int idUsuario, String factura);
     List<Productos> verProductos();
     Productos agregarProducto(Productos producto);
}
