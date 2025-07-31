package com.informaticonfig.id.aplicacion2.springboot_id.services;

import java.util.List;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;

public interface ProductoServicios {

    List<Productos> findAll();
    Productos buscaId(long idProducto);
}

