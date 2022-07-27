/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.

• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.

• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ej.pkg6.nespresso;

import Entidad.Cafetera;
import Servicios.ServiciosCafetera;
import java.util.Scanner;

public class Ej6Nespresso {

    public static void main(String[] args) {
        ServiciosCafetera sc = new ServiciosCafetera();
        Cafetera caf = new Cafetera ();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Primero creamos la cafetera");
        System.out.println("---------------------------");
        caf = sc.NuevaCafetera();
        int x=0;
        do{
            System.out.println("");
            System.out.println("1. Llenar cafetera\n2. Servir taza\n3. Vaciar cafetera\n4. Agregar café\n5. Informe\n6. Salir");
            x=leer.nextInt();
            switch (x){
                case 1:
                    sc.llenarCafetera(caf);
                    break;
                case 2:
                    int tam;
                    System.out.println("Ingrese el tamaño de la taza");
                    tam=leer.nextInt();                            
                    sc.servirTaza(caf, tam);
                    break;
                case 3:
                    sc.vaciarCafetera(caf);
                   break;
                case 4: 
                    int cant;
                    System.out.println("Ingrese la cantidad a agregar: ");
                    cant = leer.nextInt();
                    sc.agregarCafe(caf, cant);
                    break;   
                case 5: 
                    System.out.println(caf);
                    break;
            }     
            System.out.println("");
        }while (x!=6);   
           
        
 
    }
    
}
