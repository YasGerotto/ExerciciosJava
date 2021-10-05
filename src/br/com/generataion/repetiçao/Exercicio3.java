package br.com.generataion.repetiçao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idade = 0 , menor=0, maior = 0;
	
		
		while(idade != -99){
			System.out.println("Digite sua idade:");
			idade = s.nextInt();
			
			
			
			if(idade <=21) {
				menor++;
			}
			else if (idade >=50) {
				maior++;
			}
		}
		System.out.println("\nPessoas com menois de 21 anos:" + menor);
		System.out.println("\nPessoas com mais de 50 anos:" + maior);
		s.close();
	}
}
