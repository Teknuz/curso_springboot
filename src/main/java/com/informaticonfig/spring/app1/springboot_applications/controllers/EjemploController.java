package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {
    
    @GetMapping("/detalles_info")

    
    public String info(Model model){
        model.addAttribute("Titulo","Servidor en Linea");
        model.addAttribute("Servidor","Informaticonfig");
        model.addAttribute("Ip","192.93.94.167");
        return "detalles_info";

    }

}
