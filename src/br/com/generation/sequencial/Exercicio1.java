package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		int diaAtual, mesAtual, anoAtual;
        int diaNascimento, mesNascimento, anoNascimento;
        int total;
        
        
        
        System.out.println("Informe seu dia de aniversário :");
        diaNascimento = ler.nextInt();
        System.out.println("\nInforme o número do mês do seu aniversário :");
        mesNascimento  = ler.nextInt();
        System.out.println("\nInforme o ano do seu aniversário :");
        anoNascimento= ler.nextInt();
        
        System.out.println("\nInforme o dia atual");
       diaAtual= ler.nextInt();
        System.out.println("\nInforme o mês atual");
        mesAtual= ler.nextInt();
        System.out.println("\nInforme o ano atual");
        anoAtual= ler.nextInt();
		
		total = (anoAtual - anoNascimento) * 365 + (mesAtual * 30 + diaAtual) - (mesNascimento * 30 + diaNascimento);
		
		System.out.println("Sua idade em dias é :" + total);
		ler.close();
			

	}

}
