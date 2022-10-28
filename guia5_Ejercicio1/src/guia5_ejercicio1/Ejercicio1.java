/*1. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/
package guia5_ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
    System.out.println("Ingrese numero entero: ");
    int numero1 = leer.nextInt();
    System.out.println("Ingrese nuevo numero entero: ");
    int numero2 = leer.nextInt();
    System.out.println("El valor de la suma es: " + (numero1 + numero2));
    } 
    
}
