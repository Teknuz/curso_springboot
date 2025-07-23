package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informaticonfig.spring.app1.springboot_applications.Empleados;

@Controller
public class EjemploController {
    
    @GetMapping("/detalles_info")

    
    public String info(Model model){
      Empleados empleado1 = new Empleados("Jose","Gomez","Ypacarai","Desarrollador",22, 986202684, 001 ); 

        model.addAttribute("Empleado", empleado1);
       
        return "detalles_info";

    }

}
