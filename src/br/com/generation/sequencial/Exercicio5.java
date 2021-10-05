package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double nota1, nota2, nota3;
		double media;

		System.out.println("Digite a nota 1: ");
		nota1 = ler.nextDouble();

		System.out.println("Digite a nota 2: ");
		nota2 = ler.nextDouble();

		System.out.println("Digita a nota 3: ");
		nota3 = ler.nextDouble();

		media = ((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5) / (0.2 + 0.3 + 0.5));
	
		System.out.println("\nMedia é:" + media);
		
		ler.close();
	}

}
