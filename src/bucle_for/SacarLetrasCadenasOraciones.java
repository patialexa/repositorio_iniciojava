
package bucle_for;

import java.util.Scanner;


public class SacarLetrasCadenasOraciones {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String  cadena;
       System.out.print("ingrese cadena?");
       cadena = sc.nextLine();
       System.out.println("tamaño: "  + cadena.length());
       for(int i=0; i<cadena.length() ;i++)
           System.out.println(cadena.charAt(i));
    }
    
}
