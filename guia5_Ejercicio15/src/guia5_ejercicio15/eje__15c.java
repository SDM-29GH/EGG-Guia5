/*15. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
package guia5_ejercicio15;

import java.util.Locale;
import java.util.Scanner;

public class eje__15c {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int valor, numero, i = 1, j = -1, cantidad = 20;

        System.out.println("Ingrese 20 numeros  ");
        numero = leer.nextInt();
        while (i <= numero || j >= numero) {
            if (numero < 0 && j < 0) {
                System.out.println(j);
                j = j - 1;
            } else {
                System.out.println(i);
                i = i + 1;
            }
        }

    }

}
