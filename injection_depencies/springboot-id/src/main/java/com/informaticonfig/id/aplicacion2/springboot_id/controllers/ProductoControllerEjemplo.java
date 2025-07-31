package com.informaticonfig.id.aplicacion2.springboot_id.controllers;



import com.informaticonfig.id.aplicacion2.springboot_id.models.ProductoEjemplo;
import com.informaticonfig.id.aplicacion2.springboot_id.services.ProductoServiceEjemplo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControllerEjemplo  {

    @Autowired
    private ProductoServiceEjemplo servicio;

    @PostMapping
    public String agregarProducto(@RequestBody ProductoEjemplo producto) {
        servicio.agregarProducto(producto);
        return "Producto agregado";
    }

    @GetMapping("/{id}")
    public ProductoEjemplo obtenerProducto(@PathVariable Long id) {
        return servicio.obtenerProductoEjemplo(id);
    }

    @GetMapping
    public List<ProductoEjemplo> listarProductos() {
        return servicio.listarProductos();
    }
}
