package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicios {

    public Cuenta NuevaCuenta(int id) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta cm = new Cuenta();

        System.out.println("Ingrese los datos para la cuenta " + id);
        cm.setNumeroCuenta(id);
        System.out.println("Ingrese el N° de DNI: ");
        cm.setDni(leer.nextLong());
        System.out.println("Ingrese el Saldo: ");
        cm.setSaldo(leer.nextInt());
        return cm;
    }

    public void ingreso(Cuenta cm, int cantDinero) {
        cm.setSaldo(cm.getSaldo() + cantDinero);
        System.out.println("El saldo actual es " + cm.getSaldo());
    }

    public void retirarDinero(Cuenta cm, int cantDinero) {
        if (cm.getSaldo() >= cantDinero) {
            cm.setSaldo(cm.getSaldo() - cantDinero);
            System.out.println("El saldo actual es " + cm.getSaldo());

        } else {
            cm.setSaldo(0);
            System.out.println("El saldo actual es " + cm.getSaldo());
        }
    }

    public void extraccionRapida(Cuenta cm, int cantDinero) {
        if ((cm.getSaldo() * 0.2) > cantDinero) {
            cm.setSaldo(cm.getSaldo() - cantDinero);
            System.out.println("Su nuevo saldo es " + cm.getSaldo());
        } else {
            System.out.println("para retiro rapido no se puede extrar mas del 20% del saldo");
        }
      
    }

    public void consultarSaldo(Cuenta cm) {
        System.out.println("El saldo de su cuenta es " + cm.getSaldo());
    }

    public void consultarDatos(Cuenta cm) {
        System.out.println(cm);
      
    }
}
