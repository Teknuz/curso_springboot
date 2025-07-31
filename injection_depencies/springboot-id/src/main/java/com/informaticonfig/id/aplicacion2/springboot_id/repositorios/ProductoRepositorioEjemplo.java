package com.informaticonfig.id.aplicacion2.springboot_id.repositorios;

import java.util.List;

import com.informaticonfig.id.aplicacion2.springboot_id.models.ProductoEjemplo;

public interface  ProductoRepositorioEjemplo {
    void guardar(ProductoEjemplo p);
    ProductoEjemplo buscarPorId(long id);
    List<ProductoEjemplo> obtenerTodos();
}
