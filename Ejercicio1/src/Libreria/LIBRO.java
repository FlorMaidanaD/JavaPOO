
package Libreria;

import java.util.Scanner;

public class LIBRO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

////    ATRIBUTOS     //////////////////////////////////////////////////////////  
    private int Isbn;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

////    CONSTRUCTORES     //////////////////////////////////////////////////////  
    public LIBRO() {
    }

    public LIBRO(int Isbn, String Titulo, String Autor, int NumPaginas) {
        this.Isbn = Isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

////    SETTERS     ////////////////////////////////////////////////////////////       
    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

////    GETTERS     ////////////////////////////////////////////////////////////          
    public int getIsbn() {
        return Isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "Isbn=" + Isbn + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    }
}

