package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		System.out.println("Digite o Valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();

		

		r = (a+b) * (a+b);
				System.out.println("O valor de R �: " + r);
		s = (b+c) * (b+c);
				System.out.println("\nO valor de S �: " + s);
		d = (r + s)/2;
				System.out.println("\nValor de D �: " + d);
				
				leia.close();

	}

}
