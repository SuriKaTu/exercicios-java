package aula15;

import java.util.Scanner;

public class Aula15_16 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        
            
            double valorA, valorB, valorC, delta, x1, x2;
           
            // corrigir
               
            
            System.out.println("Digite o valor de A ");
              valorA = input.nextDouble();
              
            System.out.println("Digite o valor de B ");
              valorB = input.nextInt();
              
            System.out.println("Digite o valor de C ");
              valorC = input.nextDouble(); 
              
              
              delta = (valorB * valorB) - (4 * valorA * valorC);
              
              
              
              x1 = - (valorB) - (Math.sqrt(delta) / (2 * valorA));
              
              x2 = - (valorB) + (Math.sqrt(delta)) / (2 * valorA);
          
           
         //  System.out.println(delta);
              
              if (valorA == 0 ){
                
                System.out.println("Esta equaçao nao e do segundo grau");
                
              }else if (delta < 0 ){
                
                 System.out.println(" Esta equaçao nao possui raizes reais ");
                 
              }else if (delta == 0){
                
                System.out.println(" Esta equaçao possui somente uma raiz com o valor de " + x1);
                
              }else if (delta > 0){
                
                System.out.println(" Esta equaçao possui duas raizes reais com os valores de " + x1 + "e" + x2);
                
              }
                  
                  input.close();
              
          }
          
        }
