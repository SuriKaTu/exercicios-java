package aula13;

import java.util.Scanner;

public class Aula13_13 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double valorHr, horaTrab, valorSalario, impostoRenda, sindicato, inss, salarioLiquido, descontos;


		System.out.println("Quantas horas vc trabalha por mês");
		        horaTrab = input.nextDouble();

		System.out.println("Qual o valor da sua hora trabalhada ");
		        valorHr = input.nextDouble();

		valorSalario = valorHr * horaTrab;

		impostoRenda = 11 * valorSalario / 100 ;

		inss = 8 * valorSalario  /  100 ;

		sindicato = 5 * valorSalario / 100 ;

		descontos = inss + impostoRenda + sindicato;

		salarioLiquido = valorSalario - descontos;

		    System.out.println(" O valor do seu salario e de " + valorSalario + " Reais ");

		    System.out.println(" Você pagou de imposto de renda um total de " + impostoRenda + " reais ");

		    System.out.println(" Você pagou de inss um total de " + inss + " reais ");

		    System.out.println(" Você pagou ao sindicato um total de " +   sindicato + " reais ");

		    System.out.println(" O total dos seus descontos e de " + descontos + " reais ");

		    System.out.println(" O seu salario liquido e de " + salarioLiquido + " reais ");


		                    input.close();
	}
}
