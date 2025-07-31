package com.informaticonfig.id.aplicacion2.springboot_id.repositorios;

import java.util.List;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;

public interface  ProductoRepositorio {
        List<Productos> findAll();
        Productos buscaId(long idProducto);

}
