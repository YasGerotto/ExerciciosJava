package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		 
		Scanner ler=new Scanner(System.in);
		int  ano, mes, dia, dias;
		 
		   System.out.println("Digite a idade em dias:");
		   dias = ler.nextInt();
		    
		    ano = (dias / 365);
		    mes =(dias % 365)/ 30;
		    dia =(dias % 365)% 30;
		  	
		  	  System.out.println("\nEu tenho " + ano + " anos " + mes +" meses " + dia +" dias");
		  	ler.close();
	}

}
