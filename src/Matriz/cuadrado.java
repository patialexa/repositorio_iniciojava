package matriz;

import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el lado: ");

            int la = sc.nextInt();
            for (int i = 1; i <= la; i++) {
                for (int j = 1; j <= la; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
}