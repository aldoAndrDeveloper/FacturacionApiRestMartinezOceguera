package com.coderhouse.facturacion.flujo;

import com.coderhouse.facturacion.model.CarritoDeCompras;
import com.coderhouse.facturacion.model.Ventas;
import com.coderhouse.facturacion.model.Productos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FlujoDeTienda implements TiendaVirtual{



    private Productos productos;
    private List<Productos> productosList = new ArrayList<>();

    private List<CarritoDeCompras> carritoDeComprasList = new ArrayList<>();

    private CarritoDeCompras carritoDeCompras;

    /*Sacamos la fecha actual*/
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    /*Sobre carga de metodos*/
    @Override
    public void agregarCarrito(Productos producto,int idUsuario, int cantidad) {
/*
        //Se agregan los elementos al carrito de compras usando el objeto carritoDeCompras y su constructor para añadirlos a una lista
       carritoDeCompras = new CarritoDeCompras(producto.getSKU(),idUsuario, dtf.format(now),cantidad);
       carritoDeComprasList.add(carritoDeCompras);

       System.out.println("###Agregando a Carrito###");
       System.out.println("Producto con SKU: "+producto.getSKU()+" agregado al carrito");
*/
    }

    @Override
    public List<CarritoDeCompras> verCarritoDeCompras(int idUsuario) {
        List<CarritoDeCompras> verCarritoDeCompras = new ArrayList<>();
        try {
            //Vamos a iterar la lista para llenar una nueva con el id del usuario que solicita
            System.out.println("###Ver Carrito de compras###");
          /*  for (CarritoDeCompras carrito : carritoDeComprasList) {
                if (carrito.getIdusuario() == idUsuario) {
                    System.out.println("SKU: "+ carrito.getSkuproducto());
                    System.out.println("Cantidad: "+ carrito.getCantidad());
                    System.out.println("Fecha "+carrito.getFecha());

                    verCarritoDeCompras.add(carrito);
                }
            }*/
        }//IndexOutOfBoundsException si no encuentra el id
        catch (IndexOutOfBoundsException exception) {
            System.out.println("Error de carrito "+ exception.getMessage());
        }//Cualquier otro erro lanza este mensaje
        catch (Exception exception){
            System.out.println("Error al consultar " + exception.getMessage());
        }


        return verCarritoDeCompras;
    }

    @Override
    public void comprar(int idUsuario, String factura) {
/*

        System.out.println("###Comprando###");
        //Creamos una lista que llenaremos desde el método verCarritoDeCompras()
        List<CarritoDeCompras> carritoDeComprasList1;
        try {
            carritoDeComprasList1 = verCarritoDeCompras(idUsuario);
            //iteramos la lista para ir creando la venta de cada articulo
            for (CarritoDeCompras carrito : carritoDeComprasList1) {
                new Ventas(carrito.getSKUProducto(), carrito.getIdusuario(), dtf.format(now), carrito.getCantidad(), factura);
                System.out.println("Compra éxitosa del producto "+carrito.getSKUProducto() +" - Cantidad de este producto: "+carrito.getCantidad());

            }
        }catch (Exception exception){
            System.out.println("Fallo la compra "+exception.getMessage());
        }
*/
    }

    @Override
    public List<Productos> verProductos() {
        //iteramos la lista con los productos agregados usando un for
        System.out.println("###Ver Productos###");
        for(int i = 0; i < productosList.size();i++){
            System.out.println("######################################");
            System.out.println("SKU :"+productosList.get(i).getSKU());
            System.out.println("Nombre :"+productosList.get(i).getNombreProducto());
            System.out.println("Descripción :"+productosList.get(i).getDescripcionProducto());
        }
        System.out.println("###Fin de la lista de Productos###");


        return productosList;
    }

    //sobreescribiremos el metodo para agregarProducto() y a la vez lo sobrecargaremos para agregar mas de un producto.

    @Override
    public Productos agregarProducto(Productos productos) {



        System.out.println("###Agregar producto###");
        System.out.println("Producto con SKU "+productos.getSKU()+" agregado");
        productosList.add(productos);

        return productos;
    }
    public List<Productos> agregarProducto(List<Productos> productos){
        System.out.println("###Agregar productos###");
        for(Productos productoObj: productos){
            System.out.println("Producto con SKU "+productoObj.getSKU()+" agregado");
        }
        return productos;
    }






    /*public void agregarCarrito(List<Productos> productosList, int idUsuario, int cantidad){

        //Sacamos la fecha actual
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        try {
            for (int i = 0; i < productosList.size(); i++) {
                //Sea agregan los elementos al carrito de compras
                new CarritoDeCompras(productosList.get(i).getSKU(), idUsuario, dtf.format(now), cantidad);
            }
        }catch(IndexOutOfBoundsException ex) {
            System.out.println("error: "+ex.getMessage());
        }catch(Exception exception){
            System.out.println("error: "+exception.getMessage());
        }
    }
*/
}
