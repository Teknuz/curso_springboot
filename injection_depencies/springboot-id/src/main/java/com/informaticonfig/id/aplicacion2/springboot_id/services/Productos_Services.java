package com.informaticonfig.id.aplicacion2.springboot_id.services;

import java.util.List;
import java.util.stream.Collectors;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;
import com.informaticonfig.id.aplicacion2.springboot_id.repositorios.Repo_Productos;

public class Productos_Services {

    private Repo_Productos repositorio = new Repo_Productos();

    public List<Productos> findAll(){


        return repositorio.findAll().stream().map(p-> {
            Double precioTotal = p.getPrecio() * 1.50d;
            p.setPrecio(precioTotal.intValue());
            return p;
        }).collect(Collectors.toList());
    }
    
    public Productos buscaId(long idProducto){
        return repositorio.buscaId(idProducto);
    }

}
