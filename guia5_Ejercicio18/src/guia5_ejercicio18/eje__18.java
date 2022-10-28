/*18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **  */
package guia5_ejercicio18;

import java.util.Locale;
import java.util.Scanner;

public class eje__18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nro;

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("INGRESE EL VALOR " + (i + 1) + "(1-20)");
                nro = leer.nextInt();
            } while (nro < 1 || nro > 20);

            for (int j = 0; j < nro; j++) {
                if (j == 0) {
                    System.out.print(nro + ":");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
