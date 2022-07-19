
package Servicio;


import Libreria.LIBRO;
import java.util.Scanner;

public class SERVICIO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

/// FUNCIÓN PARA CREAR Y LLENAR CON INFO UN LIBRO:

    public LIBRO crearLibro() {

        System.out.println("Ingrese el ISBN del libro:");
        int Isbn = leer.nextInt();

        System.out.println("Ingrese el título del libro:");
        String Titulo = leer.next();

        System.out.println("Ingrese el autor del libro:");
        String Autor = leer.next();

        System.out.println("Ingrese el n° de páginas del libro:");
        int NumPaginas = leer.nextInt();

        return new LIBRO(Isbn, Titulo, Autor, NumPaginas);
    }
}


