package aula15;

import java.util.Scanner;

public class Aula15_20 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        String resposta1, resposta2, resposta3, resposta4, resposta5;

        System.out.println("Telefonou para a vitima ? ");
            resposta1 = input.nextLine();

        System.out.println("Mora perto da vitima ? ");
            resposta2 = input.nextLine();
            
        System.out.println("Esteve no local do crime ? ");
            resposta3 = input.nextLine();
            
        System.out.println("Devia para a vitima ? ");
            resposta4 = input.nextLine();

        System.out.println("Ja trabalhou com a vitima ?");
            resposta5 = input.nextLine();


            if (resposta1.equalsIgnoreCase("sim") || resposta2.equalsIgnoreCase("sim") || 
                resposta3.equalsIgnoreCase("sim") || resposta4.equalsIgnoreCase("sim")  ||
                                     resposta5.equalsIgnoreCase("sim") )  {

                    System.out.println(" INOCENTE ");

                        } if else ()
            



    }

}