
package Libreria;

import java.util.Scanner;

public class Misfunciones {
  public static double entrada(){
    Scanner sc = new Scanner(System.in);
    String er= "([0-9]+\\.[0-9]+)|[0-9]+";
    String scenti;
    double dcenti;
    boolean correcto;
    
    do{
        System.out.print ("ingrese grados centigrados?   ");
        scenti = sc.next();
        correcto=scenti.matches(er);
        if(!correcto){
            System.out.println("Error vuelva a ingresar dato");
            
        }
    }while(!correcto);
    dcenti = Double.parseDouble(scenti);
    return dcenti;
    
}
    
    
    
}
