package br.com.generation.vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int [] dado = new int [10];
		int i; 
		double soma = 0, media = 0;
		int highP = 0, cont = 0;
		
		for(i = 0; i< dado.length; i++){
			System.out.println("Digite O " + (i+1) + "º valor");
			dado [i] = s.nextInt();
			
			while(dado[i]<1 || dado[i] > 6) {
				System.out.println("Valor inválido. \n");
				System.out.println("Digite O " + (i+1) + "º valor");
				dado [i] = s.nextInt();
					}
			 soma += dado[i];
			 if(dado[i] > highP) {
				 highP = dado[i];
				 
			 }
				
		}
		media = soma/dado.length;
		System.out.println();
		
		for(i=0; i <dado.length; i++) {
			if(dado[i] == highP) {
				cont++;
			}
			System.out.println(" O " + (i+1) + "º valor é: " + dado[i]);
		}
	System.out.println("A média calculada é: " + media);
	System.out.println("A quantidadde de ocorrência da maior pontuação " + highP + "é de " + cont + "vez(es).");
	}
	

}
