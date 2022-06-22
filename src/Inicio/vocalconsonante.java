package inicio;

import java.util.Scanner;

public class vocalconsonante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra ? ");
        String letra = sc.next().toLowerCase();
       
        char x = letra.charAt(0);
        String er = "[A-Za-z]";
        boolean y = letra.matches("[A-Za-z]");
        
        ///Character.isJavaIdentifierPart ('ñ');
        
        
        String cadena = "";
        
        if (y==true){
           System.out.println("letra");
        }
         
        else {
            System.out.println("no letra");
        }
        switch (x) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                cadena = "vocal";
                break;

            default:
                cadena = "consonante";

        }
        System.out.print(cadena);
        {

        }

    }
}

