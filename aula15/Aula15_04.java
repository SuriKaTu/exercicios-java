package aula15;

import java.util.Scanner;

public class Aula15_04 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);


        String letra;


        System.out.println(" Digite uma letra do alfabeto ");
            letra = input.nextLine();


            if ( letra.equalsIgnoreCase("a"  ) || (letra.equalsIgnoreCase("e"))
                 || letra.equalsIgnoreCase("i") || (letra.equalsIgnoreCase("o"))
                                   || (letra.equalsIgnoreCase("u"))){

                    System.out.println(" A letra digitada e uma vogal ");                

                                   }

                            else{

                    System.out.println(" A letra digitada e uma consoante ");

                            }

            input.close();
                            
    }
    
}
