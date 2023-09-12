package aula15;

import java.util.Scanner;

public class Aula15_10 {

    public static void main (String[]args){

        Scanner input = new Scanner (System.in);

        String letra;

        System.out.println(" Em qual horario voce estuda ? digite M para manha T para tarde e N para noite ");
            letra = input.nextLine();


            if (letra.equalsIgnoreCase("m")){

            System.out.println("Bom Dia !");
            
                }else if (letra.equalsIgnoreCase("t")){

                    System.out.println("Boa Tarde !");
                    
                         }else if(letra.equalsIgnoreCase("n")){

                             System.out.println("Boa Noite !");
                  
                          }else {

                            System.out.println("Valor digitado invalido ");

                          }
    
         input.close();                 
        
        }
    }