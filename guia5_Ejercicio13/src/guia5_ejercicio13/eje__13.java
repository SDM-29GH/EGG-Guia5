/*13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/
package guia5_ejercicio13;

import java.util.Locale;
import java.util.Scanner;

public class eje__13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int i=0, suma=0, limite;
        
        // PRIMERA FORMA: CICLO O BUCLE "WHILE"
        
        System.out.println("Ingrese el numero o valor limite positivo");
        limite = leer.nextInt();
        System.out.println("El valor o numero límite positivo es: " + limite);
        System.out.println("Ingrese numeros hasta que el valor de la suma de numeros que ingreso, supere el límite: " + limite);
        
        while (suma <= limite) {
            System.out.println("Ingrese el numero para sumar: ");
            i = leer.nextInt();
            suma = suma + i;
            System.out.println("El valor de la suma es : " + suma + " siendo menor al valor límite " + limite);
            if (suma > limite) {
                System.out.println("El valor "+ suma +" superó el valor límite " + limite);
                break;
            }
        }
        
        //  SEGUNADA FORMA: CICLO O BUCLE "DO WHILE"
        /*
        System.out.println("Ingrese el numero o valor limite positivo");
        limite = leer.nextInt();
        do{
            System.out.println("Ingrese el valor o numero para sumar: ");
            i = leer.nextInt();
            suma = suma + i;
            System.out.println("El valor de la suma es : " + suma + " siendo menor al valor límite " + limite);
                if (suma > limite) {
                System.out.println("El valor "+ suma +" superó el valor límite " + limite);
                break;
            }
        }while(suma<=limite);
        */
    }
}
