/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.xana.comercioiva.entities;

/**
 *
 * @author gabri
 */
public abstract class Articulo implements MetodosIva{
    
    //Atributos
    
    private String nombre;
    private final double precio;
    
    public Articulo(String nombre, double precio) {
        this.setNombre(nombre);
        this.precio = precio;
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

    @Override
    public abstract double getPrecioFinal();

    
    @Override
    public abstract double getParteIva();
    

    
}
