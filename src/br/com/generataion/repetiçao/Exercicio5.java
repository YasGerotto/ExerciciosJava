package br.com.generataion.repeti�ao;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
		int num, soma =0;
		do {
			
			System.out.println("Digite um n�mero: ");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
			soma+= num;
			
		}while(num!=0);
		
		JOptionPane.showConfirmDialog(null," O resultado da soma � de: " 
		+ soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
