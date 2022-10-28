/*  21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido */
package guia5_ejercicio21;

import java.util.Locale;
import java.util.Scanner;

public class eje_21 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int[] vector = new int [10];
        int contador = 0;
        
        System.out.println("INGRESE EL VALOR PARA BUSCAR");
        int nro = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 11);
            System.out.print(vector[i]+ "  ");
        }
        System.out.println("");
        
        for (int i = 0; i < vector.length; i++){
            if(vector[i] == nro) {
                System.out.println("El numero "+nro+" está en la POSICION " + i +" VECTOR [" + vector[i] + "]");
                contador++;
            }
        }
        
        System.out.println(nro + " EL NUMERO ESTA REPETIDO " + contador + " VECES");
        
    }
    
}
