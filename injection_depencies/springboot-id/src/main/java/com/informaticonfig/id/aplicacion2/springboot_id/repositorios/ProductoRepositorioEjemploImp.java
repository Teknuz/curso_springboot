package com.informaticonfig.id.aplicacion2.springboot_id.repositorios;
import  com.informaticonfig.id.aplicacion2.springboot_id.models.ProductoEjemplo;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductoRepositorioEjemploImp implements ProductoRepositorioEjemplo {

        private Map<Long, ProductoEjemplo> bdFake = new HashMap<>();
    @Override
        public void guardar(ProductoEjemplo p){
            bdFake.put(p.getId(),p);
        }
    
        public ProductoEjemplo buscarPorId(Long id){
            return bdFake.get(id);
        }
        
        @Override
        public List<ProductoEjemplo> obtenerTodos(){
            return new ArrayList<>(bdFake.values());
        }

        @Override
        public ProductoEjemplo buscarPorId(long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
        }

   




}
