package aula13;

import java.util.Scanner;

public class Aula13_04 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        double notaA,notaB,notaC,notaD,media;

        System.out.println(" digite a nota do primeiro bimestre: ");
            notaA = input.nextDouble();

        System.out.println(" digite a nota do segundo bimestre: ");
            notaB = input.nextDouble();

        System.out.println(" digite a nota do terceiro bimestre: ");
            notaC = input.nextDouble();

        System.out.println(" digite a nota do quarto bimestre: ");
            notaD = input.nextDouble();

                 media = (notaA + notaB + notaC + notaD ) / 4 ; 

        System.out.println(" A media das sua notas e de: " + media + " pontos ");

                    input.close();

    }
    
}
