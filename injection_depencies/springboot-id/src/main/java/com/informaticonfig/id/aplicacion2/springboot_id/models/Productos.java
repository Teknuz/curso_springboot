package com.informaticonfig.id.aplicacion2.springboot_id.models;

public class Productos {

private Long idProducto;
private String nombre;
private int precio;


public Productos(Long idProducto, String nombre, int precio) {
    this.idProducto = idProducto;
    this.nombre = nombre;
    this.precio = precio;
}



public Long getIdProducto() {
    return idProducto;
}
public void setIdProducto(Long idProducto) {
    this.idProducto = idProducto;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getPrecio() {
    return precio;
}
public void setPrecio(int precio) {
    this.precio = precio;
}


//Constructor

//Metodos getters y setters


    @Override
   public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            
            return new Productos(idProducto, nombre, precio);
        }
    }
}
