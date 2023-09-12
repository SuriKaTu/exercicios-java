package aula13;

import java.util.Scanner;

public class Aula13_07 {
    
    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);
		
		double ladoA,ladoB,area;

		
		System.out.println(" Digite o valor de um dos lados em cm ");
		    ladoA = input.nextDouble();
		
			System.out.println(" Digite o valor do outro lado em cm ");
		        ladoB = input.nextDouble();

	        	    area = ladoA * ladoB;
		
		System.out.println((" O valor da area dessa figura e de ") + area + (" E o seu dobro e de ") +
                                                 (area * 2) + (" cm quadrados "));


		
		            input.close();

    }
}
