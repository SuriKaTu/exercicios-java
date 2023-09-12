package aula13;

import java.util.Scanner ;

public class Aula13_09 {

    public static void main (String [] args ){

        Scanner input = new Scanner (System.in);
		
		double farenhaint,celcius;
		
		System.out.println(" Digite a temperatura em graus farenhaint : ");
		    farenhaint = input.nextDouble(); 
		
		        celcius = (5 * (farenhaint - 32) / 9 );
		
		System.out.println(( "A temperatura em graus celcius e de ") + celcius + (" graus "));
		
		        input.close();

    }
    
}
