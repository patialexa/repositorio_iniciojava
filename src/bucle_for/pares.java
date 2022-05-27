package src;

import java.util.Scanner;

public class pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ca;
        System.out.print("Ingrese la cadena: ");
        ca = sc.nextLine(); //Controla el retorno de carro
        System.out.println("Longitud: " + ca.length());
        if (ca.length() > 0) {
            for (int i = 0; i < ca.length(); i++) {
                if (i % 2 == 0) {
                    System.out.print(ca.charAt(i));
                }
            }
        } else {
            System.out.println("DEBE INGRESAR UNA CADENA");
        }
    }
}
