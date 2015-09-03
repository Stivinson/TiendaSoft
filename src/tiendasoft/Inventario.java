package tiendasoft;

import java.util.Scanner;

/**
 *
 * @author Stivinson
 */
public class Inventario {
    private String nombre;
    private double cantidad;
    private double ventasTotales;
    private double precio;
    Scanner valor = new Scanner(System.in); 

    public Inventario(){
        
    }
   
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
 
    public void agregar(){  
        System.out.println("Ingrese el Nombre del producto: "); nombre=valor.next();
        System.out.println("Ingrese La cantidad del producto: "); cantidad=valor.nextInt();
        System.out.println("Ingrese el precio : "); precio=valor.nextInt();
       
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad: "+cantidad); 
        System.out.println("Precio: "+precio); 
        System.out.println("    "); 

     } 
    public void venta(){
    double ventas;
    System.out.println("Ingrese la cantidad que quier comprar: ");
    ventas=valor.nextInt();
    ventasTotales=ventasTotales+ventas;
    cantidad=cantidad-ventas;
    System.out.println("Venta realizada");  
    System.out.println("  ");
    } 
    public void total(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad: "+cantidad); 
        System.out.println("Ventas: "+ventasTotales); 
        System.out.println("Valor total de las ventas: "+(ventasTotales*precio)); 
        System.out.println("    "); 
    }
}