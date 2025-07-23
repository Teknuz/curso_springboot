package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.informaticonfig.spring.app1.springboot_applications.Empleados;



@RestController
@RequestMapping("/api/variable")
public class PathVariableController {
    
    @GetMapping("/pagina1/{mensaje}")
       public ParametroDTO pagina1(@PathVariable String mensaje){


        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;

       }
    
       @PostMapping("/solicitud")
       //Creacion de metodo creacion de empleados
            public Empleados creaEmpleados(@RequestBody Empleados empleado1){
                

                return empleado1;
            }

        
       }






