package aula13;

import java.util.Scanner;

public class Aula13_03 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        double numA,numB,soma;

    System.out.println(" Digite um numero ");
        numA = input.nextDouble();    

    System.out.println(" Digite outro numero ");
        numB = input.nextDouble();
        
             soma = numA + numB ;

        System.out.println(" O resultado da soma de : " + numA + " + " + numB + " e de : " + soma);

                input.close();

    }
    
}
