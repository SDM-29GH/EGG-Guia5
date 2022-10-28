/* 24. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).*/
package guia5_ejercicio24;

public class eje_24 {

    public static void main(String[] args) {
        
        int[][]Matriz = new int [3][3];
        
        Matriz[0][0] = 0; Matriz[0][1] = -2; Matriz[0][2]= 4;
        Matriz[1][0] = 2; Matriz[1][1] = 0; Matriz[1][2]= 2;
        Matriz[2][0] = -4; Matriz[2][1] = -2; Matriz[2][2]= 0;
        
        System.out.println("MATRIZ DE DIMENSIÓN 3X3: ");// MATRIZ M
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
        System.out.println("MATRIZ TRANSPUESTA: ");// MATRIZ TRANSPUESTA Mt
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matriz[j][i] + "  ");
            }
            System.out.println(" ");
        }
        
        System.out.println("MATRIZ ANTISIMETRICA: ");// MATRIZ ANTISIMETRICA Mant = -Mt
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matriz[j][i] * (-1) + "  ");
            }
            System.out.println(" ");
        }
    } 
    
}
