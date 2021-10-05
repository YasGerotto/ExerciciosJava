package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor;

		System.out.println("Qual é o valor de fábrica deste carro? ");
		custoFabrica = entrada.nextDouble();

		custoConsumidor = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);

		System.out.println("O custo deste carro ao consumidor é " + custoConsumidor);
		entrada.close();
  
	}

}
