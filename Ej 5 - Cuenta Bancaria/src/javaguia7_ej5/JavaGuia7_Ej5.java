/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package javaguia7_ej5;

import Entidades.Cuenta;
import Servicios.CuentaServicios;
import java.util.Scanner;


public class JavaGuia7_Ej5 {
public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        CuentaServicios cs = new CuentaServicios();
        Cuenta[] ctas = new Cuenta[9999];
        int id = 0;
        int cantDinero;
        int numCuenta = 0;
        int x = 0;
        System.out.println("Bienvenidos! ");
        do {

            System.out.println("");
            System.out.println("1. Nuevo Usuario \n"
                    + "2. Usuario Registrado \n"
                    + "3. Salir \n");
            x = leer.nextInt();
            switch (x) {
                case 1:
                    ctas[id] = cs.NuevaCuenta(id);
                    numCuenta = id;
                    id++;
                    break;

                case 2:
                    if (ctas[0] == null) {
                        System.out.println(ANSI_RED+"No existen cuentas cargadas primero ingrese una cuenta.");
                    } else {
                        System.out.println("Ingrese el numero de cuenta: ");
                        numCuenta = leer.nextInt();
                        x = 4;
                        break;
                                
                    }
                case 3:
                    break;

            }

        } while (x != 3 && x != 4);
        if (x == 4) {
            System.out.println("");
            System.out.println("");
            do {

                System.out.println("Ingrese la operacion a realizar: ");
                System.out.println("1. Ingresar Dinero\n2. Retirar Dinero\n"
                        + "3. Realizar una extraccion rápida\n4. Consultar Saldo\n5. Consultar datos"
                        + "de la cuenta\n0. Salir");
                System.out.println(" ");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dinero a ingresar: ");
                        cantDinero = leer.nextInt();
                        cs.ingreso(ctas[numCuenta], cantDinero);
                        break;
                    case 2:

                        System.out.println("Ingrese la cantidad de dinero retirar: ");
                        cantDinero = leer.nextInt();
                        cs.retirarDinero(ctas[numCuenta], cantDinero);
                        break;
                    case 3:

                        System.out.println("Ingrese la cantidad de dinero a retirar rapidamente: ");
                        cantDinero = leer.nextInt();
                        cs.extraccionRapida(ctas[numCuenta], cantDinero);
                        break;
                    case 4:

                        cs.consultarSaldo(ctas[numCuenta]);
                        break;
                    case 5:

                        cs.consultarDatos(ctas[numCuenta]);
                        break;

                }
                System.out.println("------------------------------ ");
                System.out.println(" ");
            } while (op != 0);

        }

    }

}
