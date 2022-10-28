/*25. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.*/
package guia5_ejercicio25;

import java.util.Locale;
import java.util.Scanner;

public class eje_25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int[][] matriz = new int[3][3];

        //sumaFila1 = sumaFila2 = sumaFila3 = sumaColumna1 = sumaColumna2 = sumaColumna3 = sumaDiagonal1 = sumaDiagonal2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.println("Ingrese el valor de [" + i + "][" + j + "]");
                matriz[i][j] = entrada.nextInt();
                if (matriz[i][j] > 9) {
                    System.out.println("Ingrese el valor del numero entre el 1 al 9: ");
                    matriz[i][j] = entrada.nextInt();
                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        int sumaFila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        int sumaFila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        int sumaFila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        int sumaColumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        int sumaColumna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        int sumaColumna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[2][0] + matriz[1][1] + matriz[0][2];
        int sumaFilas = sumaFila1 = sumaFila2 = sumaFila3;
        int sumaColumnas = sumaColumna1 = sumaColumna2 = sumaColumna3;
        int sumaDiagonales = sumaDiagonal1 = sumaDiagonal2;

        if (sumaFilas == sumaColumnas && sumaFilas == sumaDiagonales && sumaColumnas == sumaDiagonales) {
            System.out.println("Suma de Filas = " + sumaFilas + " | Suma de columnas = "+sumaColumnas + " | Suma de Diagonales = " + sumaDiagonales);
            System.out.println("LA MATRIZ ES MAGICA");
        } else {
            System.out.println("LA MATRIZ ES CUADRADA");
        }

    }

}
