
package es.xana.comercioiva.entities;

public abstract class Articulo {
    
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

    
    public abstract double getPrecioFinal();

    
    public abstract double getParteIva();
    

    
}
