/* 26. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.*/
package guia5_ejercicio26;

import java.util.Locale;
import java.util.Scanner;

public class eje_26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int[][] Matriz = new int[10][10];
        int[][] SubMatriz = new int[3][3];
        
        Matriz[0][0]=1;  Matriz[0][1]=26; Matriz[0][2]=36; Matriz[0][3]=47; Matriz[0][4]=5;  Matriz[0][5]=6;  Matriz[0][6]=72; Matriz[0][7]=81; Matriz[0][8]=95; Matriz[0][9]=10;
        Matriz[1][0]=11; Matriz[1][1]=12; Matriz[1][2]=13; Matriz[1][3]=21; Matriz[1][4]=41; Matriz[1][5]=22; Matriz[1][6]=67; Matriz[1][7]=20; Matriz[1][8]=10; Matriz[1][9]=61;
        Matriz[2][0]=56; Matriz[2][1]=78; Matriz[2][2]=87; Matriz[2][3]=90; Matriz[2][4]=9;  Matriz[2][5]=90; Matriz[2][6]=17; Matriz[2][7]=12; Matriz[2][8]=87; Matriz[2][9]=67;
        Matriz[3][0]=41; Matriz[3][1]=87; Matriz[3][2]=24; Matriz[3][3]=56; Matriz[3][4]=97; Matriz[3][5]=74; Matriz[3][6]=87; Matriz[3][7]=42; Matriz[3][8]=64; Matriz[3][9]=35;
        Matriz[4][0]=32; Matriz[4][1]=76; Matriz[4][2]=79; Matriz[4][3]=1;  Matriz[4][4]=36; Matriz[4][5]=5;  Matriz[4][6]=67; Matriz[4][7]=96; Matriz[4][8]=12; Matriz[4][9]=11;
        Matriz[5][0]=99; Matriz[5][1]=13; Matriz[5][2]=54; Matriz[5][3]=88; Matriz[5][4]=89; Matriz[5][5]=90; Matriz[5][6]=75; Matriz[5][7]=12; Matriz[5][8]=41; Matriz[5][9]=76;
        Matriz[6][0]=67; Matriz[6][1]=78; Matriz[6][2]=87; Matriz[6][3]=45; Matriz[6][4]=14; Matriz[6][5]=22; Matriz[6][6]=26; Matriz[6][7]=42; Matriz[6][8]=56; Matriz[6][9]=78;
        Matriz[7][0]=98; Matriz[7][1]=45; Matriz[7][2]=34; Matriz[7][3]=23; Matriz[7][4]=32; Matriz[7][5]=56; Matriz[7][6]=74; Matriz[7][7]=16; Matriz[7][8]=19; Matriz[7][9]=18;
        Matriz[8][0]=24; Matriz[8][1]=67; Matriz[8][2]=97; Matriz[8][3]=46; Matriz[8][4]=87; Matriz[8][5]=13; Matriz[8][6]=67; Matriz[8][7]=89; Matriz[8][8]=93; Matriz[8][9]=24;
        Matriz[9][0]=21; Matriz[9][1]=68; Matriz[9][2]=78; Matriz[9][3]=98; Matriz[9][4]=90; Matriz[9][5]=67; Matriz[9][6]=12; Matriz[9][7]=41; Matriz[9][8]=65; Matriz[9][9]=12;

        System.out.println("MATRIZ DE 10 X 10\n");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print(Matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
        System.out.println("************************");
        
        SubMatriz[0][0]=36; SubMatriz[0][1]=5; SubMatriz[0][2]=67;
        SubMatriz[1][0]=89; SubMatriz[1][1]=90; SubMatriz[1][2]=75;
        SubMatriz[2][0]=14; SubMatriz[2][1]=22; SubMatriz[2][2]=26;
        
        System.out.println("SUB-MATRIZ 3 X 3");

        for (int i = 0; i < SubMatriz.length; i++) {
            for (int j = 0; j < SubMatriz.length; j++) {
                System.out.print(SubMatriz[i][j] + "  ");
                if (Matriz[i][j] == SubMatriz[i][j]) {
                    System.out.println("La SubMatriz está dentro de la Matriz");
                }
            }
            System.out.println(" ");
        }
    
        
        /*
        System.out.println("***************************");
        System.out.println("INGRESE VALORES DE LA SUBMATRIZ PARA BUSCAR PARA BUSCAR EN LA MATRIZ");
        for (int i = 0; i < SubMatriz.length; i++) {
            for (int j = 0; j < SubMatriz.length; j++) {
                System.out.println("Ingrese el valor de [" + i + "][" + j + "]");
                SubMatriz[i][j] = entrada.nextInt();
                if (Matriz[i][j] == SubMatriz[i][j]) {
                    System.out.println("El numero " + SubMatriz[i][j] + " está en la POSICION [" + i +"]["+j+"]"+ " de la MATRIZ [" + Matriz[i][j] + "]");
                    int contador = 0;
                    contador++;
                }
            }
            
            System.out.println(" ");
        }
        */
        
        /*
        for (int i = 0; i < SubMatriz.length; i++) {
            for (int j = 0; j < SubMatriz.length; j++) {
                System.out.print(SubMatriz[i][j] + "  ");
            }
            System.out.println();
        }
        
               
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (Matriz[i][j] == 36 && Matriz[i][j] == 5 && Matriz[i][j] == 67 && Matriz[i][j] == 89 && Matriz[i][j] == 90 
                        && Matriz[i][j] == 75 && Matriz[i][j] == 14 && Matriz[i][j] == 22 && Matriz[i][j] == 26) {
                    System.out.println("La SubMatriz 3x3 " + SubMatriz[i][j] + " está en la POSICION [" + i +"]["+j+"]"+ " de la MATRIZ 10x10 [" + Matriz[i][j] + "]");
                }
            }

        }
        */
        
        
        for (int k = 0; k < 9; k++) {
            System.out.println("INGRESE EL VALOR PARA BUSCAR");
            int nro = entrada.nextInt();
            int contador = 0;

            for (int i = 0; i < Matriz.length; i++) {
                for (int j = 0; j < Matriz.length; j++) {
                    if (Matriz[i][j] == nro) {
                        System.out.println("El numero " + nro + " está en la POSICION [" + i + "][" + j + "]" + " de la MATRIZ [" + Matriz[i][j] + "]");

                        contador++;
                    }
                }
            }
            System.out.println(" EL NUMERO" + nro + " ESTA REPETIDO " + contador + " VECES EN LA MATRIZ");

        }
 
    }
}
