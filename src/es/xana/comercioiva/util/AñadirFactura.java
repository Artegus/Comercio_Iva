
package es.xana.comercioiva.util;

import es.xana.comercioiva.entities.ProductoIva16;
import es.xana.comercioiva.entities.ProductoIva4;
import es.xana.comercioiva.entities.ProductoIva7;
import java.util.ArrayList;

public class AñadirFactura {
    
    
    public static void insertarProducto(int opcion, String nombre, double precio, ArrayList list){
        
        ProductoIva4 ivaCuatro = null;
        ProductoIva7 ivaSiete = null;
        ProductoIva16 ivaDieciseis = null;
        
        switch(opcion){
            case 1: 
                ivaDieciseis = new ProductoIva16(nombre, precio);
                list.add(ivaDieciseis);
                break;
            case 2:
                ivaSiete = new ProductoIva7(nombre, precio);
                list.add(ivaSiete);
                break;
            case 3:
                ivaCuatro = new ProductoIva4(nombre, precio);
                list.add(ivaCuatro);
                break;
            default:
                System.out.println("Incorrecto");
        }
    }
    
}
