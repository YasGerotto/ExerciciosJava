package br.com.generataion.repeti�ao;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int num, soma=0, cont = 0;
		double media = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
			if(num!= 0) {
				if(num % 3 == 0) {
					cont++;
					soma += num;
					media = soma / cont;
			}
			}
		}while(num!=0);

		JOptionPane.showConfirmDialog(null, "A m�dia dos n�meros m�ltiplos de 3 �: " 
		+ media, "Resultado - Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

}
