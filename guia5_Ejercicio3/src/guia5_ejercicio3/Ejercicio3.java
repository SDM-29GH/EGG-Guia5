/*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/
package guia5_ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese una frase: ");
        String frase = leer.next();

        System.out.println("FRASE EN MAYUSCULAS:  " + frase.toUpperCase());
        System.out.println("FRASE EN MINUSCULAS:  " + frase.toLowerCase());
        
       
    }

        
}
        
    

