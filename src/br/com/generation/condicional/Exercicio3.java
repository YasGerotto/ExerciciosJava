package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int idade = 0;
		
		
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		if(idade >=10 && idade <=14) {
			System.out.println("Você esta na categoria Infantil!");
		}
		
		 if(idade >=15 && idade<=17) {
			System.out.println("Você esta na categoria Juvenil!");
		}
		
		 if(idade >=18 && idade<=25) {
			System.out.println("Você está na categoria adulto!");
		}
		 
           
	leia.close();

	}

}
