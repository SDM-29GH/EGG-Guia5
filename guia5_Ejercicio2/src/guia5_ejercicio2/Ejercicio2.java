/*2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.*/
package guia5_ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese su Nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su Apellido: ");
        String apellido = leer.next();

        System.out.println("Nombre es: " + nombre);
        System.out.println("Su apellido es : " + apellido);

    }
}
