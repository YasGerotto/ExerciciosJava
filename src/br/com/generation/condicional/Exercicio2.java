package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 < n2) {
			if(n2 < n3) {
				System.out.println("A ordem crescente: " +  n1 + ""   +n2 + ""   + n3 + ".");
				
			}
				
			}
		}
		
	}