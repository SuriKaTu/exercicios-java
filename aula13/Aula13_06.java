package aula13;

import java.util.Scanner;

public class Aula13_06 {
    
    public static void main (String [] args ){

        Scanner input = new Scanner (System.in);
		
		double raio,pi;
		
		
        System.out.println("qual o valor do raio ");
		    raio = input.nextDouble();
		 
		        pi = 3.14;
		 
		System.out.println((" O valor da area desse circulo e de ") + ((raio * raio)*pi ) + (" cm") );
		
		
		            input.close();

    }
}
