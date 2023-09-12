package aula13;

import java.util.Scanner;

public class Aula13_12 {
 
    public static void main ( String [] args ){

        Scanner input = new Scanner (System.in);
		
		double altura,resultado;
		
		System.out.println(" Digite a sua altura ");
		    altura = input.nextDouble();
		
		        resultado = ((72.7 * altura) - 58);
		
		System.out.println ((" Seu peso ideal e de ") + resultado + (" Kg ") );
		
		        input.close();


    }
    
}
