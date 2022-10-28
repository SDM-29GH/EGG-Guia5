/*10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/
package guia5_ejercicio10;

import java.util.Locale;
import java.util.Scanner;

public class eje__10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese una frase o palabra:");
        String frase = leer.next();

        //String frase = "Ala";
        String primerLetra = frase.substring(0, 1);
        String letra = "A";
        System.out.println("La primera letra de la frase o palabra, " + frase + ", es: "  + primerLetra);
        
        if (primerLetra.equals(letra)) {
            System.out.println("La primera letra es: " + primerLetra  + ". ES CORRECTO");
        } else {
            System.out.println("La primera letra es: " + primerLetra + ". ES INCORRECTO");
        }
    }
}
