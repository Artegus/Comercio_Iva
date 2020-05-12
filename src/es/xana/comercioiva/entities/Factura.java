
package es.xana.comercioiva.entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Factura {
    
    private LocalDate fecha;
    private ArrayList<Articulo> articulos;

    public Factura(ArrayList articulos) {
        this.fecha = LocalDate.now();
        this.articulos =  articulos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    

    public double calcularFactura(){
        
        double total = 0;
        
        for (int i = 0; i < articulos.size(); i++) {
            if(articulos.get(i) instanceof ProductoIva4)
                total += ((ProductoIva4)articulos.get(i)).getPrecioFinal();
            else if(articulos.get(i) instanceof ProductoIva7)
                total += ((ProductoIva7)articulos.get(i)).getPrecioFinal();
            else
                total += ((ProductoIva16)articulos.get(i)).getPrecioFinal();
        }
        
        
        return total;
    }
    
    public void mostrarFactura(){
        
        if(!articulos.isEmpty()){
            for (int i = 0; i < articulos.size(); i++) {
            System.out.print((i+1) + " ");
            if(articulos.get(i) instanceof ProductoIva4)
                System.out.println(((ProductoIva4)articulos.get(i)).toString());
            else if(articulos.get(i) instanceof ProductoIva7)
                System.out.println(((ProductoIva7)articulos.get(i)).toString());
            else
                System.out.println(((ProductoIva16)articulos.get(i)).toString());
            }
            System.out.printf("Total: %.2f Fecha: %s\n",calcularFactura(), getFecha());
        } else {
            System.out.println("Se ha salido de la factura.\n");
        }
        
        
        
    }
    
    public void mostrarInformacion(){
        
        if(!articulos.isEmpty()){
            for (int i = 0; i < articulos.size(); i++) {
            System.out.println("Producto - "+(i+1));
            System.out.printf("\tNombre: %s\n"
                            + "\tPrecio base: %.2f \n", articulos.get(i).getNombre(), articulos.get(i).getPrecio());
            
            System.out.printf("\tParte IVA: %.2f\n"
                    + "\tPrecio base + IVA: %.2f\n",articulos.get(i).getParteIva(), articulos.get(i).getPrecioFinal());
            }
        } else {
            System.out.println("Aun no hay productos en la factura.");
        }
        
        
    }
    
    
    
    
}
