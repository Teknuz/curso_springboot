package com.informaticonfig.id.aplicacion2.springboot_id.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.informaticonfig.id.aplicacion2.springboot_id.models.ProductoEjemplo;

import com.informaticonfig.id.aplicacion2.springboot_id.repositorios.ProductoRepositorioEjemplo;

@Service
public class ProductoServiceEjemploImp implements ProductoServiceEjemplo {
    @Autowired
    private ProductoRepositorioEjemplo repo;
    @Override
    public void agregarProducto(ProductoEjemplo p){
        repo.guardar(p);
    }
    @Override
    public ProductoEjemplo obtenerProductoEjemplo(Long id){
        return (ProductoEjemplo) repo.buscarPorId(id);
    }
    public ProductoEjemplo obtenerProducto(Long id) {
        return (ProductoEjemplo) repo.buscarPorId(id);
    }
    @Override

    public List<ProductoEjemplo> listarProductos() {
        return  repo.obtenerTodos();
    }
}
