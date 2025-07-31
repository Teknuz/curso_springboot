package com.informaticonfig.id.aplicacion2.springboot_id.services;

import java.util.List;

import com.informaticonfig.id.aplicacion2.springboot_id.models.ProductoEjemplo;



public interface ProductoServiceEjemplo {
    void agregarProducto(ProductoEjemplo p);
    ProductoEjemplo obtenerProductoEjemplo(Long id);
    List<ProductoEjemplo> listarProductos();

}
