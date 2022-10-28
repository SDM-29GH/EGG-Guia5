/*5. Escribir un programa que lea un número entero por teclado y muestre 
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/
package guia5_Ejecicio5;

import static java.lang.Math.sqrt;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingresar numero entero");
        int numero = leer.nextInt();
        
        double raiz = sqrt(numero);
        int raiz_1 = (int) Math.sqrt(numero);

        System.out.println("El doble es: " + numero * 2);
        System.out.println("El triple es: " + numero * 3);
        System.out.println("La raiz cuadrada es: " + raiz);
        System.out.println("La raiz cuadrada es : " + raiz_1);
    }

}
