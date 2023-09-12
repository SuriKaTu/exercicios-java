package aula15;

import java.util.Scanner;

public class Aula15_15 {

    public static void main (String[]args){

        Scanner input = new Scanner (System.in);

        double ladoA, ladoB, ladoC;
        boolean eTriangulo;

        System.out.println(" Digite o valor de  um dos lados do triangulo :");
            ladoA = input.nextDouble();

        System.out.println(" Digite o valor de  outro dos lados do triangulo :");
            ladoB = input.nextDouble();

        System.out.println(" Digite  o valor de outro dos lados do triangulo :");
            ladoC = input.nextDouble();

           eTriangulo = ladoA + ladoB > ladoC ;

   if(eTriangulo == true){

             if(ladoA == ladoB && ladoB == ladoC){

                 System.out.println(" Este objeto e um triangulo equilatero");
            
                 } else if ( ladoA != ladoB && ladoB != ladoC){

                     System.out.println(" Este objeto e um triangulo escaleno");
                        
                        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){

                            System.out.println(" Este objeto e um triangulo isósceles");

                                 }

                                }else{

                                    System.out.println(" Este objeto nao e um triangulo");
                                }

                      input.close();

    }
    
}
