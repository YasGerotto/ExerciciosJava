package br.com.generataion.repetiçao;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
		int num, soma =0;
		do {
			
			System.out.println("Digite um número: ");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			soma+= num;
			
		}while(num!=0);
		
		JOptionPane.showConfirmDialog(null," O resultado da soma é de: " 
		+ soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
