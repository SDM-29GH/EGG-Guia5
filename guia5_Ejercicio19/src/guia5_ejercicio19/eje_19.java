/*  19. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €  */
package guia5_ejercicio19;

import java.util.Locale;
import java.util.Scanner;


public class eje_19 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        String moneda;
        double euro;
        
        System.out.println("INGRESE CANTIDAD O VALOR DE EUROS PARA CONVERTIR: ");
        euro = leer.nextDouble();
        System.out.println("PUEDE CONVERTIR EN: DOLARES, YENES Y LIBRAS");
        System.out.println("INDIQUE EN QUE MONEDA DESEA REALIZAR LA CONVERSIÓN: ");
        moneda = leer.next().toLowerCase();
        
        convertirMoneda(euro, moneda);
        
    }
    
    public static void convertirMoneda(double euro, String moneda) {
        switch (moneda) {
            case "dolares":
                System.out.println(euro + " EUROS EQUIVALE EN: " +euro * 1.28611 + " DOLARES");
                break;
            case "yenes":
                System.out.println(euro + " EUROS EQUIVALE EN: " +euro * 129.852 + " YENES");
                break;
            case "libras":
                System.out.println(euro + " EUROS EQUIVALE EN: " +euro * 0.86 + " LIBRAS");
                break;
            default :
                System.out.println("EL NOMBRE DE LA MONEDA ES INCORRECTO");
        }
    
    }
    
}
