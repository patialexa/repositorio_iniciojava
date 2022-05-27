package matriz;

public class NewMain {

    public static void main(String[] args) {

{ //ejemplo 2
            int esp = 10;
            int as = 1;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= esp; j++) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= as; x++) {
                    System.out.print("* ");
                }
                System.out.println();
                esp = esp - 1;
                as = as + 1;
            }

        } //fin ejemplo 2
        
{
            int esp1 = 2;
            int as1 = 9;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= esp1; j++) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= as1; x++) {
                    System.out.print("* ");
                }
                System.out.println();
                esp1 = esp1 + 1;
                as1 = as1 - 1;
            }
}          
}} 
    