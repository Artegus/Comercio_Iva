
package es.xana.comercioiva.ui;

import es.xana.comercioiva.entities.Articulo;
import es.xana.comercioiva.entities.ProductoIva16;
import es.xana.comercioiva.entities.ProductoIva4;
import es.xana.comercioiva.entities.ProductoIva7;
import es.xana.comercioiva.entities.Factura;
import static es.xana.comercioiva.util.AñadirFactura.insertarProducto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner ter = new Scanner(System.in);
        
        ArrayList<Articulo> list = new ArrayList<>();
        Factura papel = new Factura(list);
        
        String nombreProducto = "";
        int opcion, tipo = 0;
        double precio = 0;
        
        do{
            System.out.print("Ticket\n"
                    + "1. Añadir producto\n"
                    + "2. Mostrar información de los productos\n"
                    + "3. Salir y mostrar factura\n"
                    + "opcion: ");
            opcion = ter.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Indica el nombre: ");
                    nombreProducto = ter.next();
                    System.out.print("Indica el precio: ");
                    precio = ter.nextDouble();
                    System.out.print("¿Cantidad de iva del producto?\n"
                            + "1. 16%\n"
                            + "2. 7%\n"
                            + "3. 4%\n"
                            + "opcion: ");
                    tipo = ter.nextInt();
                    insertarProducto(tipo, nombreProducto, precio, list);
                    break;
                case 2:
                    papel.mostrarInformacion();
                    break;
                case 3:
                    papel.mostrarFactura();
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while(opcion != 3);
    }
}




