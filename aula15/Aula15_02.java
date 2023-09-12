package aula15;

import java.util.Scanner;

public class Aula15_02 {

    public static void main ( String [] args ){


        Scanner input = new Scanner ( System.in );

        int num ;

        System.out.println(" Digite um numero inteiro ? ");
            num = input.nextInt();
       

                if (num >= 0){

                    System.out.println(" O numero digitado e positivo ");
                }
                        else{

                            System.out.println(" O numero digitado e negativo ");
                        }

                        input.close();
    }
    
}
