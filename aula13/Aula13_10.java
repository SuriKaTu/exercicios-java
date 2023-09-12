package aula13;

import java.util.Scanner;

public class Aula13_10 {

    public static void main ( String [] args){

        Scanner input = new Scanner(System.in);

		double celcius, farenhaint;


		System.out.println(" Digite a temperatura em graus celcius ");
		    celcius = input.nextDouble();

		        farenhaint = (celcius * 1.8) + 32 ;

		System.out.println((" A trmperatura em farenhaint e de ") + farenhaint + (" graus "));

                    input.close();

    }
    
}
