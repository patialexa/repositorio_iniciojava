
package bucle_for;

import java.util.Scanner;


public class SacarLetrasAlReves {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       String  cadena;
       System.out.print("ingrese cadena?");
       cadena = sc.nextLine();
       System.out.println("tamaño: "  + cadena.length());
       for(int i=cadena.length()-1; i>=0  ;i--)
           System.out.println(cadena.charAt(i));
    }
    
}
