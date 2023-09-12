package aula15;

import java.util.Scanner;

public class Aula15_01 {

    public static void main ( String [] args ){
    
        Scanner input = new Scanner ( System.in );

        int numA, numB;

        System.out.println(" Digite um numero inteiro ");
            numA = input.nextInt();
       
         System.out.println(" Digite um outro numero inteiro ");
            numB = input.nextInt();


            if (numA > numB){

                System.out.println(" O maior dos dois numeros e o numero : " + numA);
            }

                        else {

                            System.out.println(" O maior dos dois numeros e o numero : " + numB);
                        }


                input.close();        
    }
    
}
