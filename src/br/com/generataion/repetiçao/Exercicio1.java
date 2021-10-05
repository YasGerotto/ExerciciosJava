package br.com.generataion.repetiçao;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		int i , cont =0;
		for( i = 1000; i <=1999; i++) {
			if(i % 11 == 5) {
				System.out.println(i +"\n");
				cont++;
				
			}
		}
		System.out.println("Existem: " + cont + "números.");
	}

}
