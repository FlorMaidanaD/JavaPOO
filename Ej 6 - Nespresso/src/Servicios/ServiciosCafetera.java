package Servicios;
import Entidad.Cafetera;
import java.util.Scanner;

public class ServiciosCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera NuevaCafetera() {
        Cafetera c = new Cafetera();
        System.out.println("Nueva Cafetera... Ingrese datos.");
        System.out.println("");
        System.out.print("Ingrese la capacidad max: ");
        c.setCapacidadMaxima(leer.nextInt());
        System.out.print("Ingrese la cantidad actual de cafe disponible (ingrese 0 si esta vacia): ");
        c.setCantidadActual(leer.nextInt());
        return c;
    }

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera c, int tam) {
        if (c.getCantidadActual() > tam) {
            c.setCantidadActual(c.getCantidadActual() - tam);
            System.out.println("La taza se llenó");

        } else {
            if (c.getCantidadActual() < tam) {
                System.out.println("No alcanzó para llenar la taza, solo se llenó con " + c.getCantidadActual());
                c.setCantidadActual(0);
            }
        }
    }

    
    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
        System.out.println("La cafetera se vació");
    }

    
    public void agregarCafe(Cafetera c, int cant) {
        int x = c.getCapacidadMaxima() - c.getCantidadActual();
        if (cant < x) {
            c.setCantidadActual(c.getCantidadActual() + cant);
            System.out.println("se ingreso el café");
        } else {

            System.out.println("La cafetera se llenó y sobró " + (cant - x));
            c.setCantidadActual(c.getCapacidadMaxima());
        }
    }
    
}
