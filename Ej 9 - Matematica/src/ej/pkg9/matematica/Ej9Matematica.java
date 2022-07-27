/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej.pkg9.matematica;

import Entidades.Matematica;
import java.util.Scanner;


public class Ej9Matematica {

    public static void main(String[] args) {
    Matematica m=new Matematica();
    Scanner leer=new Scanner(System.in);
    
        System.out.println("Generaremos 2 numeros...");
        double num1, num2;
        num1=Math.random()*11;
        num2=Math.random()*11;
        m.setNum1(num1);
        m.setNum2(num2);
        System.out.println("generados:" + m);
        System.out.println("El mayor es: " + m.devolverMayor());
        System.out.println("La potencia del mayor elevado del menor es: " + m.calcularPotencia());
        System.out.println("La raiz cuadrada del menor es: " + m.calculaRaiz());
            
        
    
    
    
    }
    
}
