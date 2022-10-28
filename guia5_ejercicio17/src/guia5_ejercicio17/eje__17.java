/*17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo 
siguiente:
****
*  *
*  *
****  */
package guia5_ejercicio17;

import java.util.Locale;
import java.util.Scanner;

public class eje__17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE CANTIDAD DE ELEMENTOS POR LADO: ");
        int valor = leer.nextInt();
        
        for (int i = 0 ; i < valor ; i++) {
            for (int j = 0 ; j < valor ; j++) {
                if( i == 0 || i == valor - 1 || j == 0 || j == valor - 1){
                    System.out.print(" * ");
                }
                else {
                System.out.print("   ");
                }
            }
            System.out.println();           
        }    
    }
}
