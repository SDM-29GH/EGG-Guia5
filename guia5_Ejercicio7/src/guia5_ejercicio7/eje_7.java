/*7. Crear un programa que dado un numero determine si es par o impar.*/
package guia5_ejercicio7;

import java.util.Locale;
import java.util.Scanner;

public class eje_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingresar numero");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR");
        } else {
            System.out.println("El numero " + numero + " es IMPAR");
        }
    }
}
