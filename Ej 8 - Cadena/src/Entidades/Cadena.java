/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidades;

public class Cadena {

    private String frase;
    private int lon;

    public Cadena(String frase, int lon) {
        this.frase = frase;
        this.lon = lon;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", lon=" + lon + '}';
    }

    public int mostrarVocales(String f) {
        int cont = 0;
        for (int i = 0; i < f.length(); i++) {

            if (f.substring(i, i + 1).equals("a") || f.substring(i, i + 1).equals("e") || f.substring(i, i + 1).equals("i") || f.substring(i, i + 1).equals("o") || f.substring(i, i + 1).equals("u")) {
                cont++;
            }

        }
        return cont;
    }

    public void invertirFrase(String frase) {
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.substring(i, i + 1));
        }
        System.out.println("");
    }

    public int vecesRepetido(String letra) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (frase.substring(i, i + 1).equals(letra)) {
                cont++;
            }

        }
        return cont;
    }

    public void compararLongitud(String frase) {
        if (frase.length() == lon) {
            System.out.println("las frases tienen la misma longitud");
        } else {
            if (frase.length() > lon) {
                System.out.println("La nueva frase es mas larga");
            } else {
                System.out.println("la nueva frase es mas corta");

            }
        }
    }

    public void unirFrases(String frase) {
        this.frase = this.frase.concat(frase);
        System.out.println("completa: " + this.frase);
    }

    public void reemplazar(String letra) {

        frase=frase.replace(letra, "a");
        System.out.println(frase);

    }
    public boolean contiene(String letra){
        boolean cont=false;
        if (frase.contains(letra)){
            cont=true;
        }
        return cont;
    }

}
