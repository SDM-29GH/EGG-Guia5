/*12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.*/
package guia5_ejercicio12;

import java.util.Locale;
import java.util.Scanner;

public class eje__12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingresar nota");
        int nota = leer.nextInt();

        do {
            if (nota >= 0 && nota <= 10) {
                System.out.println("CORRECTO. La nota es valida");
            } else {
                System.out.println("INCORRECTO. Ingresar nota entre 0 y 10: ");
                int nota1 = leer.nextInt();
                if (nota1 >= 0 && nota1 <= 10) {
                    System.out.println("CORRECTO. La nota es valida");
                    break;
                }
            }
        } while (nota > 10);
    }
}
