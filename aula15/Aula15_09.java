package aula15;

import java.util.Scanner;

public class Aula15_09 {
    

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int valorA, valorB, valorC;

    System.out.println("Digite um valor");

    valorA = input.nextInt();

    System.out.println(" Digite outro valor ");

    valorB = input.nextInt();

    System.out.println(" Digite outro valor ");

    valorC = input.nextInt();

    if (valorA <= valorB && valorB <= valorC && valorA < valorC) {

        System.out.println(" Os valores em ordem decresente sao " + valorC + valorB + valorA);

             } else if (valorB <= valorA && valorA <= valorC && valorC > valorB) {

                 System.out.println(" Os valores em ordem decrescente sao " + valorC + valorA + valorB);

                     } else if (valorB <= valorC && valorC <= valorA && valorA > valorB) {

                        System.out.println("Os valores em ordem decrescente sao " + valorA + valorC + valorB);

                    } else if (valorC <= valorB && valorB <= valorA && valorA > valorC) {

                          System.out.println("Os valores em ordem decrescente sao " + valorA + valorB + valorC);

                 } else if (valorC <= valorA && valorA <= valorB && valorB > valorC) {

                     System.out.println(" Os valores em ordem decrescente sao " + valorB + valorA + valorC);

         } else if (valorA <= valorC && valorC <= valorB && valorB > valorA) {

             System.out.println("Os valores em ordem decrescente sao " + valorB + valorC + valorA);
    }

    input.close();
  }
}
