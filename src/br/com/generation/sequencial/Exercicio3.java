package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int  horas, segundos, minutos,  sobraHoras, tempo;
		
		
		System.out.println("Informe o tempo em segundos: ");
		tempo = ler.nextInt();
		
		        horas = (tempo / 3600);

				 sobraHoras = (tempo % 3600);

				 minutos = (sobraHoras / 60);

				 segundos = (sobraHoras % 60 );
				 
				 System.out.println("Seu tempo em horas é: " + horas + "hora" + minutos + "minutos" + segundos + "segundos");
		
		ler.close();
	}

}
