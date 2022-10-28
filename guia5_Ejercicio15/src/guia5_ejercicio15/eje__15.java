/*15. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
package guia5_ejercicio15;

import java.util.Locale;
import java.util.Scanner;

public class eje__15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int i = 1, suma, n, numero = 1;
        suma = 0;

        System.out.println("Ingresar cantidad de numero entero para realizar la suma: ");
        n = leer.nextInt();

        while (numero != 0 && i > 0 && i <= n) {
            System.out.println("Ingresar numero entero positivo: ");
            numero = leer.nextInt();
            System.out.println("El " + i + "° numero ingresado es: \n" + numero);
            if(numero == 0){
                System.out.println("Se ingresó el número: " + numero);
                break;
            }
            if (numero > 0 && i > 0 && i <= n) {
                suma = suma + numero;
                i++;    
            }else if(numero < 0) {
                System.out.println("El numero ingresado es negativo");
            }
        }
        
        if(i == n+1){
            System.out.println("SUMA DE " + (i-1) + " NUMEROS INGRESADOS POSITIVOS: " + suma);
        }   
    }
}
