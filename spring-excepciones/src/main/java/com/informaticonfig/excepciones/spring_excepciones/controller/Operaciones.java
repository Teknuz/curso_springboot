package com.informaticonfig.excepciones.spring_excepciones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/division")

public class Operaciones {
    @GetMapping
    public String Divide() {
        int valor = 20/3;
        return "Resultado: " + valor;
    }
    
    
}
