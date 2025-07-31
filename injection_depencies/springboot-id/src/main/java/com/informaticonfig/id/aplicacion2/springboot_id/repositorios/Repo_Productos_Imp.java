package com.informaticonfig.id.aplicacion2.springboot_id.repositorios;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;


@Component
public class Repo_Productos_Imp implements ProductoRepositorio{
    //Creacion de lista
    List<Productos> datos;

   public Repo_Productos_Imp(){
    this.datos = Arrays.asList(
        new Productos(1L, "Disco Duro 1TB", 500),
        new Productos(2L, "Mouse Logitech", 700),
        new Productos(3L, "Memoria USB 20GB", 150)
    );
   }
    @Override
public List<Productos> findAll(){
    return datos;
}
    @Override
    public Productos buscaId(long idProducto){
        return datos.stream() // convierte la lista para poder hacer operaciones
        .filter(p->p.getIdProducto() // invocamos submetodo filter con una expresion lambda, y devuelve todos los elementos que cumplen la condicion
        .equals(idProducto)) //
        .findFirst().orElseThrow();//Obtiene el primer elemento y luego manda una excepcion en caso de que no se encuentre
    }


    
}
