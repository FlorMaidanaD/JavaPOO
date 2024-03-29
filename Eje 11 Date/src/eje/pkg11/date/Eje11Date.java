/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. 
En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package eje.pkg11.date;

import java.util.Date;
import java.util.Scanner;


public class Eje11Date {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);  
        Date fechaActual = new Date();
        int dia, mes, anio;        
        System.out.print("Ingrese el dia: ");
        dia=leer.nextInt();
        System.out.print("Ingrese el mes: ");
        mes=leer.nextInt();        
        System.out.print("Ingrese Año (aaaa): ");
        anio=leer.nextInt()-1900;
        Date fecha = new Date (anio, mes-1, dia);
        System.out.println("Fecha ingresada: " + fecha);        
        System.out.println("Fecha actual: " + fechaActual);
        int dif= fecha.getYear()-fechaActual.getYear();
        System.out.println("diferencia: " + dif);            
     
    }    
}
