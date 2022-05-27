package matriz;

import java.io.IOException;

public class Matriz2 {

    public static void main(String[] args) {
        //Declarar una matriz 3x2 que guarde cadenas
        String[][] nombre = {{"Luis", "Miguel"},
                             {"Carmen", "María"},
                             {"Jose", "Arturo"}};
        for (int f = 0; f < nombre.length; f++) {
            for (int c = 0; c < nombre[0].length; c++) {
                //System.out.print("\" "+nombre[f][c]+"\" " + "\t");
                System.out.printf("%-20s","\""+nombre[f][c]+"\"");
            }
            //System.out.println();
            System.out.print("\n");
            
         }
    }


    public static void pause() {
		try {
			  System.out.print("\nPresiona una tecla para continuar...");
              System.in.read();
        }catch(IOException e) {}
                
    }

}
