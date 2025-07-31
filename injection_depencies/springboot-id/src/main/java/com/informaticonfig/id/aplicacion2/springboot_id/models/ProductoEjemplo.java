package com.informaticonfig.id.aplicacion2.springboot_id.models;

public class ProductoEjemplo {
    private Long id;
    private String nombre;
    private double precio;

    public ProductoEjemplo(){}
    public ProductoEjemplo(Long id, String nombre, double precio){
        this.precio = precio;
        this.nombre = nombre;
        this.id = id;

    }

    //Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
