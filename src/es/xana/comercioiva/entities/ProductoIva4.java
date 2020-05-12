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
public class ProductoIva4 extends Articulo{
    
    //Atributos
    
    private static final int TIPO = 4;
    
    public ProductoIva4(String nombre, double precio) {
        super(nombre, precio);
    }
    
    @Override
    public double getParteIva(){
        double total;
        
        total = super.getPrecio() * TIPO/100;
        
        return total; 
    }
    
    @Override
    public double getPrecioFinal(){
        double total;
        
        total = super.getPrecio() + getParteIva();
        
        return total;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.getNombre() + " --- " + getPrecioFinal());
        
        return sb.toString();
    }

    
    
}