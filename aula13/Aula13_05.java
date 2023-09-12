package aula13;

import java.util.Scanner;

public class Aula13_05 {

    public static void main (String [] args ){

        Scanner input = new Scanner (System.in);
		
		double metro,centimetro;
		
		System.out.println(" Qual o valor em metros que você deseja converter em centímetros?");
		    metro = input.nextDouble();
		
		        centimetro = metro * 100;
		
		System.out.println(" O valor em centimentos para o valor informado e de : " + centimetro + " centímetros" );
		
		            input.close();

    }
    
}
