package aula15;

import java.util.Scanner;

public class Aula15_07 {

    public static void main (String [] Args){


        Scanner input = new Scanner (System.in);

        int numA, numB, numC;

        System.out.println(" Digite um numero ");
            numA = input.nextInt();

        System.out.println(" Digite um numero ");
            numB = input.nextInt();

        System.out.println(" Digite um numero ");
            numC = input.nextInt();

// define o maior dos 3 numeros 

            if (numA > numB && numA > numC){

                System.out.println(" O numero " + numA + " e o maior dos 3 numeros digitados ");
                                
                    }else if (numB > numA && numB > numC){

                        System.out.println(" O numero " + numB + " e o maior dos 3 numeros digitados ");
                            
                            }else if (numC > numA && numC > numB){

                                System.out.println(" O numero " + numC + " e o maior dos 3 numeros digitados ");
                                    
                                   }

// define o menor dos tres numeros 

             if (numA < numB && numA < numC){

                  System.out.println(" O numero " + numA + " e o menor dos 3 numeros digitados ");
                                                    
                      }else if (numB < numA && numB < numC){
                    
                          System.out.println(" O numero " + numB + " e o menor dos 3 numeros digitados ");
                                                
                              }else if (numC < numA && numC < numB){
                    
                                   System.out.println(" O numero " + numC + " e o menor dos 3 numeros digitados ");
                                                        
                                                       }    
                        input.close();           
    }
    
}
