package aula15;

import java.util.Scanner;

public class Aula15_12 {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        double descontoIR, salarioBruto, sindicato, fgts, salarioLiquido, valorHr, horaTrab, inss, descontos;

        System.out.println("Quantas horas voce trabalha por mes ?");
            horaTrab = input.nextDouble();

        System.out.println("Qual o valor da sua hora de trabalho ?");
            valorHr = input.nextDouble();


            salarioBruto = horaTrab * valorHr;
            fgts = salarioBruto * 11 / 100;
            inss = salarioBruto * 10 / 100;
            sindicato = salarioBruto * 3 / 100;


            if (salarioBruto <= 900.00){

                descontos =  inss + sindicato ;
                salarioLiquido = salarioBruto - descontos;

                System.out.println(" Salario bruto : (" + valorHr + " x " + horaTrab + ") R$ : " + salarioBruto);
                System.out.println("( - ) IR (insento)");
                System.out.println(" ( - ) INSS (10%) R$ : " + inss );
                System.out.println("FGTS (11%)  R$ : " + fgts);
                System.out.println(" Total de descontos R$ : " + descontos);
                System.out.println(" Salario liquido R$ : " + salarioLiquido);

                  } else if (salarioBruto > 900.00 && salarioBruto <= 1500.00 ){

                    descontoIR = salarioBruto * 5 / 100;
                    descontos =  inss + sindicato + descontoIR;
                    salarioLiquido = salarioBruto - descontos;
    
                    System.out.println(" Salario bruto : (" + valorHr + " x " + horaTrab + ") R$ : " + salarioBruto);
                    System.out.println("( - ) IR (5%) " + descontoIR);
                    System.out.println(" ( - ) INSS (10%) R$ : " + inss );
                    System.out.println("FGTS (11%)  R$ : " + fgts);
                    System.out.println(" Total de descontos R$ : " + descontos);
                    System.out.println(" Salario liquido R$ : " + salarioLiquido);
    
                      }else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00 ){

                        descontoIR = salarioBruto * 10 / 100;
                        descontos =  inss + sindicato + descontoIR;
                        salarioLiquido = salarioBruto - descontos;
        
                        System.out.println(" Salario bruto : (" + valorHr + " x " + horaTrab + ") R$ : " + salarioBruto);
                        System.out.println("( - ) IR (10%) " + descontoIR);
                        System.out.println(" ( - ) INSS (10%) R$ : " + inss );
                        System.out.println("FGTS (11%)  R$ : " + fgts);
                        System.out.println(" Total de descontos R$ : " + descontos);
                        System.out.println(" Salario liquido R$ : " + salarioLiquido);
        
                          }else if (salarioBruto > 2500.00 ){

                            descontoIR = salarioBruto * 20 / 100;
                            descontos =  inss + sindicato + descontoIR;
                            salarioLiquido = salarioBruto - descontos;
            
                            System.out.println(" Salario bruto : (" + valorHr + " x " + horaTrab + ") R$ : " + salarioBruto);
                            System.out.println("( - ) IR (20%) " + descontoIR);
                            System.out.println(" ( - ) INSS (10%) R$ : " + inss );
                            System.out.println("FGTS (11%)  R$ : " + fgts);
                            System.out.println(" Total de descontos R$ : " + descontos);
                            System.out.println(" Salario liquido R$ : " + salarioLiquido);
            
                              }

                              input.close();

    }
    
}
