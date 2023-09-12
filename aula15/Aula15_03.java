package aula15;

import java.util.Scanner;

public class Aula15_03 {
    
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        String letra;

    System.out.println(" Digite o seu sexo utilizando F para feminino e M para masculino");
        letra = input.nextLine();


            if(letra.equalsIgnoreCase("f") ){

                System.out.println(" O seu sexo e feminino ");
              
                    }  else if ( letra.equalsIgnoreCase("m")){

                            System.out.println(" O seu sexo e masculino ");
                       
                        }
            
                     else {

                        System.out.println(" Sexo invalido ");

            }

            input.close();
    }
}
