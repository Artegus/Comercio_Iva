
package es.xana.comercioiva.entities;


public class ProductoIva7 extends Articulo{
    
    //Atributos
    
    private static final int TIPO = 7;

    public ProductoIva7(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double getParteIva() {
        double total;

        total = super.getPrecio() * TIPO / 100;

        return total;
    }

    @Override
    public double getPrecioFinal() {
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
