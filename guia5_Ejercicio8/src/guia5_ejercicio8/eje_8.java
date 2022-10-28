/*8. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
package guia5_ejercicio8;

import java.util.Locale;
import java.util.Scanner;


public class eje_8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        String frase1 = "eureka";
       
        System.out.println("Ingrese una frase: ");
        String frase2 = leer.next();
        
        
        if (frase2.equals(frase1)){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
          
        ////   SEGUNDA FORMA    ////
        
        /*
        if (frase2 == frase1){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
        */
        
    }
    
}
