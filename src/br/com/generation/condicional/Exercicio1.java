package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite tr�s valores: ");
		numero1 = leia.nextInt();
		numero2 = leia.nextInt();
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3){
			System.out.println("O maior valor �: " + numero1);
		}
		else if(numero2 > numero3) {
			System.out.println("O maior valor �: " + numero2);
		}
		else {
			System.out.println("O maior valor �: " +numero3);
			
		}
leia.close();
	}

}
