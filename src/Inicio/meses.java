package inicio;

import java.util.Scanner;

public class meses {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el mes para saber cuantos dias tiene? ");
        int dia = sc.nextInt();
        int numero = 0;
        switch(dia) {
            case 1 : case 3: case 5 : case  7: case 8: case 10: case 12: numero = 31; break;
            case 4 : case 6: case 9: case 11: numero = 30; break;
            case 2 : numero =  28 ; break; 
            
           
         default: System.out.println("ENTRADA INCORRECTA");
        }
 if (dia>=1  &&dia <=12){
        {
       
           
        System.out.println("Cantidad de dias del mes  : " + numero);
    }
               
}
  }  
}



