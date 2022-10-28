/* 22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
package guia5_ejercicio22;

import java.util.Locale;
import java.util.Scanner;


public class eje_22 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nro, j, unDigito=0, dosDigitos=0, tresDigitos=0, cuatroDigitos=0, cincoDigitos=0;
        
        System.out.print("INGRESE EL TAMAÑO DEL VECTOR: ");
        nro = leer.nextInt();
        
        int[] vector = new int[nro];
        
        for (int i = 0; i < nro; i++) {
            vector[i] = (int) (Math.random() * 10001);
        }
        
        for (int i = 0; i < nro; i++) {
            j = 0;
            while (vector[i] > 0) {
                vector[i]  = (vector[i] / 10);
                j++;
            }
            if (j == 1) {
                unDigito++;
            }
            if (j == 2){
                dosDigitos++;
            }
            if (j == 3) {
                tresDigitos++;
            }
            if (j == 4) {
                cuatroDigitos++;
            }
            if (j == 5) {
                cincoDigitos++;
            }
        }
        
        System.out.println("NUMEROS 1 DIGITO: " + unDigito);
        System.out.println("NUMEROS 2 DIGITO: " + dosDigitos);
        System.out.println("NUMEROS 3 DIGITO: " + tresDigitos);
        System.out.println("NUMEROS 4 DIGITO: " + cuatroDigitos);
        System.out.println("NUMEROS 5 DIGITO: " + cincoDigitos);
        
    }
    
}
