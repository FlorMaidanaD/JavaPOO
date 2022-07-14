
package ejercicio1;

import Libreria.LIBRO;
import Servicio.SERVICIO;

public class Ejercicio1 {
 
    public static void main(String[] args) {

        SERVICIO LibroServicio = new SERVICIO();
        
        LIBRO Libro1 = LibroServicio.crearLibro();
        
        System.out.println(Libro1);
    }
}

