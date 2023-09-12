package aula15;

import java.util.Scanner;

public class Aula15_08 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        int valorA, valorB, valorC;

        System.out.println(" Digite um valor ");
            valorA = input.nextInt();

        System.out.println(" Digite um valor ");
            valorB = input.nextInt();

        System.out.println(" Digite um valor ");
            valorC = input.nextInt();


            if (valorA < valorB && valorA < valorC){

                System.out.println(" O valor " + valorA + " e o menor dos 3 valoreros digitados ");
                                                  
                    }else if (valorB < valorA && valorB < valorC){
                  
                        System.out.println(" O valor " + valorB + " e o menor dos 3 valoreros digitados ");
                                              
                            }else if (valorC < valorA && valorC < valorB){
                  
                                 System.out.println(" O valor " + valorC + " e o menor dos 3 valoreros digitados ");
                            }
                            
                            input.close();
    }
    
}
