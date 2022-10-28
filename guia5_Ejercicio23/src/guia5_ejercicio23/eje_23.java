/*23. Realizar un programa que rellene un matriz de 4 x 4 de valores 
aleatorios y muestre la traspuesta de la matriz.*/
package guia5_ejercicio23;

import java.util.Locale;
import java.util.Scanner;

public class eje_23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int[][]Matriz = new int [4][4];
        int[][]matriz = new int[4][4];
        
        Matriz[0][0] = (int)(Math.random()*100);     Matriz[0][1] = (int)(Math.random()*100);
        Matriz[0][2] = (int)(Math.random()*100);     Matriz[0][3] = (int)(Math.random()*100);
        
        Matriz[1][0] = (int)(Math.random()*100);     Matriz[1][1] = (int)(Math.random()*100);
        Matriz[1][2] = (int)(Math.random()*100);     Matriz[1][3] = (int)(Math.random()*100);
        
        Matriz[2][0] = (int)(Math.random()*100);     Matriz[2][1] = (int)(Math.random()*100);
        Matriz[2][2] = (int)(Math.random()*100);     Matriz[2][3] = (int)(Math.random()*100);
        
        Matriz[3][0] = (int)(Math.random()*100);     Matriz[3][1] = (int)(Math.random()*100);
        Matriz[3][2] = (int)(Math.random()*100);     Matriz[3][3] = (int)(Math.random()*100);
        
        System.out.println("Matriz de Dimensión 4x4 con valores aleatorios: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Matriz[i][j] + "  ");
                //System.out.print((int)(Math.random()*10)+"  ");
            }
            System.out.println("");
        }
        
        System.out.println("**********");
        System.out.println("Matriz transpuesta: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Matriz[j][i] + "  ");
            }
            System.out.println("");
        }
        
        System.out.println("INGRESO DE DATOS POR USUARIO, USO DE FOR");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor de [" + i + "][" + j +"]");
                matriz[i][j] = entrada.nextInt();
            }  
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
        
        System.out.println("**********");
        System.out.println("Matriz transpuesta: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + "  ");
            }
            System.out.println("");
        }
        
    }  
}
