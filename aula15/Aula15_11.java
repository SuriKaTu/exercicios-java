package aula15;

import java.util.Scanner;

public class Aula15_11 {

    public static void main(String[]args){

        Scanner input = new Scanner (System.in);

        double  salarioNaoReajustado, salarioReajustado, valorAumento;

        System.out.println("Qual e o valor do seu salario ?");
            salarioNaoReajustado = input.nextDouble();


            if (salarioNaoReajustado <= 280.00){

                valorAumento = salarioNaoReajustado * 20 / 100;
                salarioReajustado = salarioNaoReajustado + valorAumento;
                
                System.out.println(" O valor do seu salario sem reajuste e de " + salarioNaoReajustado + " Reais");
                System.out.println(" Voce recebeu um aumento de 20 % no seu salario ");
                System.out.println(" O seu aumento foi de " + valorAumento + " Reais");
                System.out.println(" O valor atual do seu salario apos o reajuste passa a ser de " + salarioReajustado + " Reais");
                

                 } else if (salarioNaoReajustado > 280.00 && salarioNaoReajustado <= 699.99){

                    valorAumento = salarioNaoReajustado * 15 / 100;
                    salarioReajustado = salarioNaoReajustado + valorAumento;
                    
                    System.out.println(" O valor do seu salario sem reajuste e de " + salarioNaoReajustado + " Reais");
                    System.out.println(" Voce recebeu um aumento de 15 % no seu salario ");
                    System.out.println(" O seu aumento foi de " + valorAumento + " Reais");
                    System.out.println(" O valor atual do seu salario apos o reajuste passa a ser de " + salarioReajustado + " Reais");
                    
    
                      } else if (salarioNaoReajustado >= 700.00 && salarioNaoReajustado < 1499.99){

                          valorAumento = salarioNaoReajustado * 10 / 100;
                          salarioReajustado = salarioNaoReajustado + valorAumento;
                        
                          System.out.println(" O valor do seu salario sem reajuste e de " + salarioNaoReajustado + " Reais");
                          System.out.println(" Voce recebeu um aumento de 10 % no seu salario ");
                          System.out.println(" O seu aumento foi de " + valorAumento + " Reais");
                          System.out.println(" O valor atual do seu salario apos o reajuste passa a ser de " + salarioReajustado + " Reais");
                        
        
                           } else if (salarioNaoReajustado >= 1500.00){

                             valorAumento = salarioNaoReajustado * 5 / 100;
                             salarioReajustado = salarioNaoReajustado + valorAumento;
                            
                             System.out.println(" O valor do seu salario sem reajuste e de " + salarioNaoReajustado + " Reais");
                              System.out.println(" Voce recebeu um aumento de 5 % no seu salario ");
                              System.out.println(" O seu aumento foi de " + valorAumento + " Reais");
                             System.out.println(" O valor atual do seu salario apos o reajuste passa a ser de " + salarioReajustado + " Reais");
                            
            
                        }

 
                                input.close();
  
  
            }

      }