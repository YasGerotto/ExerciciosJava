package br.com.generataion.repetiçao;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
	
		int idade, sexo, caract, cont = 0;
	    int pCalma = 0, mNervosa = 0, hAgressivo =0, oCalmo =0;
	    int pNervosa40 = 0, pCalma18 = 0;
	    
		while(cont<=3) {
			
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
			sexo = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre: \n" +
			"1 - Feminino \n2 - Masculino \n3 - outros:"));
			caract = Integer.parseInt(JOptionPane.showInputDialog("Que ripo de pessoa você é? \n" +
			"1 - calma \n2 - nervosa \n3 - agressiva"));
			
			if(caract == 1) {
				pCalma++;
				}
			if(sexo == 1 && caract ==2) {
				mNervosa++;
			}
			if(sexo == 2&& caract ==3) {
				hAgressivo++;
			}
			if(sexo ==3 && caract ==1) {
				oCalmo++;
			}
			if(caract == 2 && idade >=40) {
				pNervosa40++;
			}
			
			if(caract == 1 && idade <=18) {
				pCalma18++;
		
			}
		
		 cont++;
		}
		JOptionPane.showMessageDialog(null, "Relatório: \n"+
				 "\nNº de pessoas calma é:" + pCalma+
				 "\nNº de mulheres nervosas é:" + mNervosa+
				 "\nNº de homens agressivos é:" + hAgressivo+
				 "\nNº de outros calmos é:" + oCalmo+
				 "\nNº de pessoas nervosas com mais de 40 anos è:" + pNervosa40+
				 "\nNº de pessoas com menos de 18 anos é:" + pCalma18);
	
	}
	
	

}
