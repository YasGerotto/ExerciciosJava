package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, d;

		System.out.println("Qual é o valor de x no ponto 1: ");
		x1 = ler.nextDouble();
		System.out.println("Qual é o valor de y no ponto 1: ");
		y1 = ler.nextDouble();
		System.out.println("Qual é o valor de x no ponto 2: ");
		x2 = ler.nextDouble();
		System.out.println("Qual é o valor de y no ponto 2: ");
		y2 = ler.nextDouble();
		d = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("A distância entre o ponto 1 e 2 é de " + d);
		ler.close();
	}

}
