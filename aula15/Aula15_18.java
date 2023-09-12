package aula15;

import java.util.Scanner;

public class Aula15_18 {

    public static void main (String []args){

        Scanner input = new Scanner (System.in);

        int num;


        System.out.println("Digite um numero :");
            num = input.nextInt();


            if(num % 2 == 0){

                System.out.println("Este numero e par ");

                   }else {

                        System.out.println("Este numero e impar ");
                   }

                    input.close();

    }
    
}
