package aula15;

import java.util.Scanner;

public class Aula15_17 {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
      
        int numA;
        
      System.out.println(" digite um ano ");
          numA = input.nextInt();
          
          
          if(numA % 4 == 0 && numA % 100 != 0 || numA % 400 == 0){
            
            System.out.println(" Este ano e bixesto ");
          }else{
            
            System.out.println("Este ano nao e bixesto ");
          }
     
              input.close();
   
    }
    
}
