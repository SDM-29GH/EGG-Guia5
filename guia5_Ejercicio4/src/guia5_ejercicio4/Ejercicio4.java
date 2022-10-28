/*4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package guia5_ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
            
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("TEMPERATURA EN GRADOS CENTIGRADOS: ");
        double temperatura = leer.nextDouble();
        System.out.println("LA TEMPERATURA ES: "+ temperatura + "°C");
        
        double F = 32 + (9 * (temperatura/5));
        System.out.println("TEMPERATURA "+temperatura+"°C, EN GRADOS FAHRENHEIT ES: " + F + "°F");
    }    
}
