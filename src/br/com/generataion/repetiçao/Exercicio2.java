package br.com.generataion.repeti�ao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int i, num, par =0, impar=0;
		for(i=0; i <=9; i++) {
			System.out.println("Digite um n�mero: ");
			num = s.nextInt();
			
			if(num % 2 == 0) {
				par ++;
			}
			else {
				impar++;
			}
		} 
	
		System.out.println("Forasm inseridos:" + par + "n�mero(s) par(es) .");
		System.out.println("Forasm inseridos:" + impar + "n�mero(s) impar(es) .");
		
		s.close();
	}

}
