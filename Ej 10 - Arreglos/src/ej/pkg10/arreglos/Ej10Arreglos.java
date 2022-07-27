/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20
 */
package ej.pkg10.arreglos;
import java.util.Arrays;
import java.util.Scanner;
public class Ej10Arreglos {
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
       double [] a= new double [50]; 
       double [] b= new double [20];
       
        for (int i = 0; i < 50; i++) {
            Arrays.fill(a, i, i+1, Math.random()*10);
        }
       
        System.out.println("Arreglo a: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("A ordenado: " + Arrays.toString(a));
        for (int i = 0; i <= 10; i++) {
            Arrays.fill(b, i,i+1, a[i]);
        }
       
        double x = 0.5;
       Arrays.fill(b, 10, 19, x);
        System.out.println("Arreglo b: " + Arrays.toString(b));
    }
    
}
