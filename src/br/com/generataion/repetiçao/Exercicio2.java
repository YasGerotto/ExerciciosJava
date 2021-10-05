package br.com.generataion.repetiçao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int i, num, par =0, impar=0;
		for(i=0; i <=9; i++) {
			System.out.println("Digite um número: ");
			num = s.nextInt();
			
			if(num % 2 == 0) {
				par ++;
			}
			else {
				impar++;
			}
		} 
	
		System.out.println("Forasm inseridos:" + par + "número(s) par(es) .");
		System.out.println("Forasm inseridos:" + impar + "número(s) impar(es) .");
		
		s.close();
	}

}
