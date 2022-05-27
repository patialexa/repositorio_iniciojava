package matriz;

public class piramide2 {

    public static void main(String[] args) {
        int esp = 11;
        int as = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= esp; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= as; x++) {
                System.out.print("*");
            }
            System.out.println();
            esp = esp - 1;
            as = as + 2;
        }
    }

}
