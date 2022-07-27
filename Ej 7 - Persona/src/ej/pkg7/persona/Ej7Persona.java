/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ej.pkg7.persona;

import Entidades.Persona;
import Servicios.ServiciosPersona;

public class Ej7Persona {

    public static void main(String[] args) {
        ServiciosPersona sp = new ServiciosPersona();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        int imc = 0;
        int bpeso = 0;
        int pesoi = 0;
        int speso = 0;
        boolean edad;
        int may = 0;
        int men = 0;

        System.out.println("Paso 1, ingresar 4 personas: ");

        p1 = sp.crearPersona();
        System.out.println("*****");
        p2 = sp.crearPersona();
        System.out.println("*****");
        p3 = sp.crearPersona();
        System.out.println("*****");
        p4 = sp.crearPersona();

        System.out.println("-------------------------");
        System.out.println("Atributos de las personas ingresadas: ");

        //aca me gustaria hacer un for pero no se como mandar a las distintas personas como parametro
        //persona 1
        System.out.println(p1);
        imc = sp.calcularIMC(p1);
        if (imc < 0) {
            bpeso++;

        } else {
            if (imc == 0) {
                pesoi++;
            } else {
                speso++;

            }
        }

        edad = sp.esMayorDeEdad(p1);
        if (edad == true) {
            may++;
        } else {
            men++;
        }

        //persona 2
        System.out.println(p2);
        imc = sp.calcularIMC(p2);
        if (imc < 0) {
            bpeso++;

        } else {
            if (imc == 0) {
                pesoi++;
            } else {
                speso++;

            }
        }

        edad = sp.esMayorDeEdad(p2);
        if (edad == true) {
            may++;
        } else {
            men++;
        }
        //persona 3
        System.out.println(p3);
        imc = sp.calcularIMC(p3);
        if (imc < 0) {
            bpeso++;

        } else {
            if (imc == 0) {
                pesoi++;
            } else {
                speso++;

            }
        }

        edad = sp.esMayorDeEdad(p3);
        if (edad == true) {
            may++;
        } else {
            men++;
        }
        //persona 4
        System.out.println(p4);
        imc = sp.calcularIMC(p4);
        if (imc < 0) {
            bpeso++;

        } else {
            if (imc == 0) {
                pesoi++;
            } else {
                speso++;

            }
        }

        edad = sp.esMayorDeEdad(p4);
        if (edad == true) {
            may++;
        } else {
            men++;
        }

        System.out.println("------------");
        System.out.println("Porcentajes IMC: ");
        System.out.println(bpeso * 100 / 4 + "% bajo peso");
        System.out.println(pesoi * 100 / 4 + "% peso ideal");
        System.out.println(speso * 100 / 4 + "% sobre peso");
        System.out.println("-----------");
        System.out.println("Porcentajes edades: ");
        System.out.println(may * 100 / 4 + "% mayores de edad");
        System.out.println(men * 100 / 4 + "% menores de edad");

    }

}
