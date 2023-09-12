package aula15;

import java.util.Scanner;

public class Aula15_14 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        double notaA, notaB, media;
        

        System.out.println(" Digite a primeira nota do aluno no semestre :");
            notaA = input.nextDouble();

        System.out.println("Digite a segunda nota do aluno no semestre :");
            notaB = input.nextDouble();

        media = (notaA + notaB) / 2;

        if( media >= 9.0 && media <= 10.0){

            System.out.println(" seu conceito foi A ");
            System.out.println(" A media desse aluno foi de : " + media );
            System.out.println(" Suas notas foram : " + notaA + " e " + notaB);
            System.out.println(" Você foi APROVADO ");

             } else if (media >= 7.5 && media < 9.0){

                System.out.println(" seu conceito foi B ");
                System.out.println(" A media desse aluno foi de : " + media );
                System.out.println(" Suas notas foram : " + notaA + " e " + notaB);
                System.out.println(" Você foi APROVADO ");

                 } else if (media >= 6.0 && media < 7.5){

                    System.out.println(" seu conceito foi C ");
                    System.out.println(" A media desse aluno foi de : " + media );
                    System.out.println(" Suas notas foram : " + notaA + " e " + notaB);
                    System.out.println(" Você foi APROVADO ");
                
                     } else if (media >= 4.0 && media < 6.0){

                        System.out.println(" seu conceito foi D ");
                        System.out.println(" A media desse aluno foi de : " + media );
                        System.out.println(" Suas notas foram : " + notaA + " e " + notaB);
                        System.out.println(" Você foi REPROVADO ");
                     
                         } else if (media >= 0.0 && media < 4.0 ){

                            System.out.println(" seu conceito foi E ");
                            System.out.println(" A media desse aluno foi de : " + media );
                            System.out.println(" Suas notas foram : " + notaA + " e " + notaB);
                            System.out.println(" Você foi REPROVADO ");
                         
                             }

              input.close();
              
    }
    
}
