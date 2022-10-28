/*9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
package guia5_ejercicio9;

import java.util.Locale;
import java.util.Scanner;

public class eje_9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        
        int n = frase.length();
        
        System.out.println("La frase tiene " + n + " de largo");
        
        if(n == 8){
            System.out.println("CORRECTO. LA FRASE ES DE 8 DE LARGO.");
        }
        else{
            System.out.println("INCORRECTO. INGRESAR FRASE DE 8 DE LARGO.");
        }       
    }
}
