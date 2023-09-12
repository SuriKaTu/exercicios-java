package aula15;

import java.util.Scanner;

public class Aula15_05 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        double notaA, notaB, media;

        System.out.println(" Digite uma das suas notas ");
            notaA = input.nextDouble();

        System.out.println(" Digite outra das suas notas ");
            notaB = input.nextDouble();

            media = (notaA + notaB)/2;

            if (media >= 7 && media < 10){

                System.out.println(" Aprovado ");
                 
                    }else if ( media < 7 ){

                       System.out.println( " Reprovado ");

                          }else if ( media == 10){

                                System.out.println(" Aprovado com distinçao ");
                          }


                    input.close();

    }
    
}
