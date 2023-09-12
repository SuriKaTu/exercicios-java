package aula15;

import java.util.Scanner;

public class Aula15_13 {

    public static void main (String []args){

        Scanner input = new Scanner (System.in);

        int diaSemana;

        System.out.println(" Digite um numero de 1 a 7 para representar um dia da semana ( 1 - domingo 2 - segunda ...)");           
            diaSemana = input.nextInt();

            switch (diaSemana) {
                case 1:
                    System.out.println("Domingo");
                    break;
            
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
            
                case 3:
                    System.out.println("Terça-Feira");
                    break; 
            
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
            
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
            
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
            
                case 7:
                    System.out.println("Sabado");
                    break; 
            
              default: 
                System.out.println(" Entrada invalida");
                break;
            
              }

                input.close();
                
            }
    
        }
