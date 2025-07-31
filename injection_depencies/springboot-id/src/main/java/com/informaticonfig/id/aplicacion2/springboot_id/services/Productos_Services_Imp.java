package com.informaticonfig.id.aplicacion2.springboot_id.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;
import com.informaticonfig.id.aplicacion2.springboot_id.repositorios.ProductoRepositorio;


@Component
public class Productos_Services_Imp implements ProductoServicios{

 @Autowired
    private ProductoRepositorio repositorio;

    @Override
   public List<Productos> findAll(){


        return repositorio.findAll().stream().map(p-> {
            Double precioTotal = p.getPrecio() * 1.50d;
          //  Productos nuevoPrecio = new Productos(p.getIdProducto(), p.getNombre(), precioTotal.intValue());
          Productos newProductos = (Productos) p.clone();
          newProductos.setPrecio(precioTotal.intValue());
          return newProductos;
        }).collect(Collectors.toList());
    }
        @Override
    public Productos buscaId(long idProducto){
        return repositorio.buscaId(idProducto);
    }



}
