package funcion;

import Libreria.Misfunciones;
import java.util.Scanner;

public class funcion1 {

public static void main(String[] args) {
//Construir una funcion que convierta centigrados a farenheit 
double c= Misfunciones.entrada();
System.out.println("f:  "+ convertirCF(c));

}


public static double convertirCF(double c){
double f= 0;
f = (c * 1.8) + 32;
return f;
}
}

