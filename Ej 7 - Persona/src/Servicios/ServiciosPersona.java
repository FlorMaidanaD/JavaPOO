
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {
Scanner leer = new Scanner(System.in);
/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
*/
    public Persona crearPersona (){
        Persona p = new Persona ();      
        System.out.print("Nombre: ");
        p.setNombre(leer.next());      
        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        
        System.out.print("Sexo (Hombre H, Mujer M, Otro O - (en may)): ");
        int x=0;
        do{
        char s = leer.next().charAt(0);
        if (s == 'H'|| s== 'M'|| s== 'O'){
            p.setSexo(s);   
            x=4;
        }else{
            System.out.println("El sexo ingresado no es correcto, reingrese...");
            System.out.print("sexo: ");
        }
        }while(x!=4);        
      
        System.out.print("Peso: ");
        p.setPeso(leer.nextDouble());
        System.out.print("Altura: ");
        p.setAltura(leer.nextDouble()); 
        return p;
    }
    /*
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    public int calcularIMC(Persona p){
        System.out.print("IMC: ");
        int ret=0;
        double imc = p.getPeso()/(p.getAltura()*p.getAltura());
        if (imc<20){
            System.out.println ("La persona esta por debajo de su peso ideal");
            ret= -1;
            
        }else{
            //preguntar aca como hacer para incluir un double
            if (imc<25 && imc>20){
             System.out.println ("La persona esta en su peso ideal");
            ret= 0;  
                        
        }else{
                if(imc>25){
                     System.out.println ("La persona tiene sobrepeso");
            ret= 1;
                }
            }
        }
        return ret;
    }
    /*
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
    public boolean esMayorDeEdad(Persona p){
        boolean l = false;
        if(p.getEdad()>=18){
            l=true;            
        }
        return l;
    }
}
