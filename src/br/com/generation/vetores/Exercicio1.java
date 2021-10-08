package br.com.generation.vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		
		
		Scanner s = new Scanner(System.in);
		double [] pont = new double [5];
		int i;
		double highP = 0;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite o" + (i+1) + "º valor:");
			pont[i] = s.nextDouble();
			
			if(pont[i] > highP) {
				highP = pont[i];
			}
			
		}
		
			System.out.println("\nA Maior pontuação é:" + highP);
		}

	}


