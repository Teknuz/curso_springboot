package com.informaticonfig.excepciones.spring_excepciones.handler;
import java.text.NumberFormat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejoErrores {
  @ExceptionHandler(ArithmeticException.class)
  public ResponseEntity<String> handlerExceptionArithmetic(ArithmeticException e){
    return new ResponseEntity<>("Error: Division por cero no permitida",
        HttpStatus.BAD_REQUEST);
  }
  @ExceptionHandler(NumberFormatException.class)
  public ResponseEntity<String> handlerNumberFormat(NumberFormatException e){
    return new ResponseEntity<>("Error : Valor ingresado no es numerico",
        HttpStatus.BAD_REQUEST);
  }
 

}

    
