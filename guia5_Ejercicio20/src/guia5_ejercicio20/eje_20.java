/* 20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente. */
package guia5_ejercicio20;

import java.util.Locale;
import java.util.Scanner;

public class eje_20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = i + 1;

        }

        for (int i = 0; i < vector.length; i++) {

            System.out.print(vector[i] + " ");

        }

        System.out.println();
    }
}
