package bucle_for;

public class SacaLetrasCadena {

    public static void main(String[] args) {
        //inicio final(condicion) incremento

        //-5 -4 -3 -2 -1
        {//BLOQUE DE CODIGO 
            int n = -5;
            for (int i = n; i <= -1; i++) {
                System.out.println(i);
            }
        }

        //-1 -2 -3 -4 -5
        {//BLOQUE DE CODIGO
            int n = -1;
            for (int i = n; i >= -5; i--) {
                System.out.println(i);
            }
        }
 
        //ROMPER UN BUCLE (BREAK)
        {//BLOQUE DE CODIGO
            int n = 10;    //1 2 3 4 5 6 7 8 9 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                if(i == 5) break;
            }
        }

    }

}
/*
i = -1 >= -5  Verdadero
i = -2 >= -5  Verdadero
        
i = -5 >= -5  Verdadero
i = -6 >= -5  Falso 
 */
