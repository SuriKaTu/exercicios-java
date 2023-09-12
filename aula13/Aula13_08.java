package aula13;

import java.util.Scanner;

public class Aula13_08 {

    public static void main(String [] args ){

        Scanner input = new Scanner (System.in);
		
		double valorHr,horaTrab,valorSalario;
		
		System.out.println("Quantas horas vc trabalha por mês");
		    horaTrab = input.nextDouble();
		
		System.out.println("Qual o valor da sua hora trabalhada ");
		    valorHr = input.nextDouble();
		
		        valorSalario = valorHr * horaTrab;
		
		System.out.println((" O valor do seu salario e de ") + valorSalario +(" Reais "));
		
		        input.close();
    }
    
}

