package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		int diaAtual, mesAtual, anoAtual;
        int diaNascimento, mesNascimento, anoNascimento;
        int total;
        
        
        
        System.out.println("Informe seu dia de anivers�rio :");
        diaNascimento = ler.nextInt();
        System.out.println("\nInforme o n�mero do m�s do seu anivers�rio :");
        mesNascimento  = ler.nextInt();
        System.out.println("\nInforme o ano do seu anivers�rio :");
        anoNascimento= ler.nextInt();
        
        System.out.println("\nInforme o dia atual");
       diaAtual= ler.nextInt();
        System.out.println("\nInforme o m�s atual");
        mesAtual= ler.nextInt();
        System.out.println("\nInforme o ano atual");
        anoAtual= ler.nextInt();
		
		total = (anoAtual - anoNascimento) * 365 + (mesAtual * 30 + diaAtual) - (mesNascimento * 30 + diaNascimento);
		
		System.out.println("Sua idade em dias � :" + total);
		ler.close();
			

	}

}
