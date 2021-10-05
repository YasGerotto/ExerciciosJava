package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c, d, f, g, x, y;

		System.out.println("Qual é o valor de a? ");
		a = entrada.nextDouble();
		
		System.out.println("Qual é o valor de b? ");
		b = entrada.nextDouble();
		System.out.println("Qual é o valor de c? ");
		c = entrada.nextDouble();
		System.out.println("Qual é o valor de d? ");
		d = entrada.nextDouble();
		System.out.println("Qual é o valor de e? ");
		g = entrada.nextDouble();
		System.out.println("Qual é o valor de f? ");
		f = entrada.nextDouble();

		x = ((c*g) - (b*f))/((a*g) - (b*d));
		y = ((a*f) - (c*d))/((a*g) - (b*d));

				System.out.println("O valor de X é " + x);
		System.out.println("\nO valor de Y é " + y);
		entrada.close();
	}

}
