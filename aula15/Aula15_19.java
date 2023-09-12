package aula15;

import java.util.Scanner;

public class Aula15_19 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);


        int numA, numB, resultado;
        String resposta;


        System.out.println("Digite um numero");
            numA = input.nextInt();
        
        System.out.println("Digite outro numero");
            numB = input.nextInt();

        System.out.println("Qual oporaçao voce deseja realizar ? adiçao, subtraçao, multiplicaçao ou divisao ? ");    


            if(resposta.equalsIgnoreCase("adiçao")){

               ((numA + numB) = resultado);

                System.out.println("o resusltado dessa conta e " + resultado);
             
                  }else if(resposta.equalsIgnoreCase("subtraçao")){

                            ((numA - numB) = resultado );
                        
                    }else if (resposta.equalsIgnoreCase("divisao")){

                            ((numA / numB) = resultado);
                        
                        }else if (resposta.equalsIgnoreCase("multiplicaçao")){

                            ((numA * numB) = resultado);

                                }

                                System.out.println(resultado);

                   input.close();             

    }
    
}
