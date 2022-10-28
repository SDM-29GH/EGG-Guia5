package guia5_ejercicio14;

import java.util.Locale;
import java.util.Scanner;

public class eje__14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese numero entero positivo");
        int N1 = leer.nextInt();

        System.out.println("Ingrese nuevo numero entero positivo");
        int N2 = leer.nextInt();

        int suma, resta, multiplicacion;
        double division;
        int opcion;
        String confirma = null;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion:");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    suma = N1 + N2;
                    System.out.println("El valor de la suma es: " + suma);
                    break;
                case 2:
                    resta = N1 - N2;
                    System.out.println("El valor de la resta es: " + resta);
                    break;
                case 3:
                    multiplicacion = N1 * N2;
                    System.out.println("El valor de la multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    division = (double) N1 / N2;
                    System.out.println("El valor de la division es: " + division);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (SI/NO)? ");
                    confirma = leer.next();
                    if (confirma.equalsIgnoreCase("SI")) {
                        break;
                    }

            }

        } while (opcion != 5 || confirma.equalsIgnoreCase("NO") );
    }
}
