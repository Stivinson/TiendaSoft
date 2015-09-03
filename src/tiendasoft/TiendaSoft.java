
package tiendasoft;
import java.util.Scanner;
import java.lang.Math;

public class TiendaSoft {
   int contUser;
   public void Menu(){
        System.out.println("Menu");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Buscar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Mostrar Inventario");
        System.out.println("5. Realizar Venta");
        System.out.println("6. Mostar Ganancias totales");
        System.out.println("7. Salir");
     }

    public static void main(String[] args) {
       int opc,i,flag=0,j,k;
       TiendaSoft Datos = new TiendaSoft();
       String nombre;
       String cantidad;
       Scanner valor = new Scanner(System.in);
       Inventario [] producto  = new Inventario[100];   
       for(k=0;k<10;k++){    
           producto[k]=new Inventario();
       }
       do{
        Datos.Menu();
            opc=valor.nextInt();
           
            if(opc!=1){             
                if(Datos.contUser==0) {
                    System.out.println("No hay Productos, Debe ingresar producto ");
                    opc=1;
                }
            }
             switch(opc){
                case 1:
                    if(Datos.contUser==100){
                      System.out.println("Ya no hay mas espacio para nuevos clientes ");
                    }else{
                    producto[Datos.contUser].agregar();
                    Datos.contUser++;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que quiere buscar : ");
                    nombre=valor.next();
                    for(i=0;i<Datos.contUser;i++){
                        if(nombre.compareTo(producto[i].getNombre())==0){
                            flag=1;
                           producto[i].mostrar();
                        break;
                     }else;
                    }
                    if(flag!=1)System.out.println("Ese producto no existe: ");
                    break;
                case 3:
                System.out.println("Ingrese el nombre del prodcuto a eliminar: ");
                nombre=valor.next();
                    for(i=0;i<Datos.contUser;i++){
                        if(nombre.compareTo(producto[i].getNombre())==0){
                           flag=1;
                           for(j=i;j<Datos.contUser-1;j++){
                              if(i==Datos.contUser-1){
                                  producto[Datos.contUser-1]=new Inventario();
                                  break;
                              }else{
                              producto[j]=producto[i+1];
                              }   
                              } 
                           Datos.contUser--;
                           System.out.println("Producto eliminado: ");
                           break;
                        }                                                   
                    }
                if(flag!=1)System.out.println("Ese producto no existe: ");
                case 4:
                    System.out.println("Esta son los productos con los que cuenta la ");
                    System.out.println("         TiendaSoft V1.0                     ");
                    for(i=0;i<Datos.contUser;i++){
                            producto[i].mostrar();
                    }
                    break;
                case 5:
                    System.out.println("Cual producto quier comprar: ");
                    nombre=valor.next();
                    for(i=0;i<Datos.contUser;i++){
                        if(nombre.compareTo(producto[i].getNombre())==0){
                            flag=1;
                            producto[i].venta();
                        break;
                        }else;
                    }
                if(flag!=1)System.out.println("Ese nombre no existe: ");
                    break;
                case 6:
                    for(i=0;i<Datos.contUser;i++){
                          producto[i].total();
                                   
                    }
                    break;
                     
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
             flag=0;
             System.out.println("Numero de productos actuales:  "+ Datos.contUser);
        }while(opc!=7);
    }
    
}
