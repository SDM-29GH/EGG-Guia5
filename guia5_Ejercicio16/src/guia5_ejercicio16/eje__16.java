/*16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
package guia5_ejercicio16;

import java.util.Locale;
import java.util.Scanner;


public class eje__16 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        String codigo;
        int i=0, aciertos = 0, desaciertos = 0;
        
        do {
            i++;
            do {
                System.out.println("INGRESE LA SECUENCIA " + i + "(5 CARACTERES): ");
                codigo = entrada.next();
            } while (codigo.length() != 5);
            
            if(codigo.substring(0, 1).equalsIgnoreCase("X") && codigo.substring(4, 5).equalsIgnoreCase("O") || codigo.equals("&&&&&")){
                aciertos++;
            }else{
                desaciertos++;
            }
            if (i==10) {
                System.out.println("CANTIDAD DE ACIERTOS: " + aciertos);
                System.out.println("CANTIDAD DE DESACIERTOS " + desaciertos);
                break;
            }
        } while (!codigo.equals("&&&&&")); 
        
        
        
        /*
        String frase;
        int cc = 0, ci = 0, i = 0;
        do {
            System.out.println("Ingrese codigo numero " + (++i));
            frase = entrada.next().toUpperCase();
            int longitud = frase.length();
            if ((longitud >= 2 && longitud <= 5) && frase.substring(0, 1).equals("X") && frase.substring(0,5).equals("O")){
                cc++;
            }else if (!frase.equals("&&&&&")){
                ci++;
            }
        } while (!frase.equals("&&&&&"));
        
        System.out.println("Cantidad de frases correctas: " + cc);
        System.out.println("Cantidad de frases incorrectas: " + ci);
        */
        
    }
}
