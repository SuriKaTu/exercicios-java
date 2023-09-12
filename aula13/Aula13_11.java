package aula13;

import java.util.Scanner;

public class Aula13_11 {

    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);
		
		 int numA,numB;
		 double numC,respostaA,respostaB,respostaC;

		 
		 System.out.println(" Digite um numero inteiro :");
		    numA = input.nextInt();
		 
		 System.out.println("Digite outro numero inteiro :");
		    numB = input.nextInt();
		 
		 System.out.println(" Agora digite um numero real : ");
		    numC = input.nextDouble();
		 
		        respostaA = (( 2 * numA) + (numB / 2));
		   
		        respostaB = (( 3 * numA) + numC );
		   
		        respostaC = Math.pow(numC, 3);
                
		   System.out.println ((" O produto do dobro primeiro numero mais a metade do segundo e igual a : ") 
                                            + respostaA);
		   
		   System.out.println((" A soma do triplo do primeiro com o terceiro numero e igual a ") + respostaB);
		   
		   System.out.println((" O resultado do terceiro numero  elevado ao cubo e de : " ) + respostaC);
		   
		           input.close();

    }
    
}
