package com.informaticonfig.id.aplicacion2.springboot_id.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;
import com.informaticonfig.id.aplicacion2.springboot_id.services.Productos_Services;



@RestController
@RequestMapping("/api")
public class Product_Controller {

    //private Productos_Services servicio = new Productos_Services();
    @GetMapping()
    
   public List <Productos> ListaProductos(){
     Productos_Services servicio = new Productos_Services();
    return servicio.findAll();
    
   }

   @GetMapping("/{idProducto}")
   public Productos mostrar(@PathVariable int idProducto){
    Productos_Services servicio = new Productos_Services();

    return servicio.buscaId(idProducto);
   }
   





}
