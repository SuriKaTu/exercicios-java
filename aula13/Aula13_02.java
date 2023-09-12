package aula13;

import java.util.Scanner;

public class Aula13_02 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        int num;

        System.out.println(" Digite um numero ");
            num = input.nextInt();

        System.out.println(" O numero que você digitou foi " + num );
        
                    input.close();

    }
    
}
