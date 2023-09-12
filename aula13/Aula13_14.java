package aula13;

import java.util.Scanner;

public class Aula13_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
			double tamanhoArquivo, velocidadeInternet, tempoDownload;
			
		
		System.out.println(" Entre com o tamanho do arquivo ");
			tamanhoArquivo = input.nextDouble();
			
		System.out.println(" Entre com a velocidade da sua internet ");	
			velocidadeInternet = input.nextDouble();
			
			
			tempoDownload = tamanhoArquivo / velocidadeInternet ;
			
		
		System.out.println("O tempo para o download sera de " + tempoDownload + " minutos");	
			
					input.close();
	}

}
