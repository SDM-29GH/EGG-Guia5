/*6. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.*/
package guia5_ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class eje_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingresar numero entero");
        int numero1 = leer.nextInt();
        System.out.println("Ingresar otro numero entero");
        int numero2 = leer.nextInt();
        System.out.println("Dado el numero " + numero1 + " y el numero " + numero2);

        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor que el numero " + numero2);
        }
        if (numero2 > numero1) {
            System.out.println("El numero " + numero2 + " es mayor que el numero " + numero1);
        }
    }
}
