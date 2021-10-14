package br.com.generation.interface1.poliformismo;

public class Preguiça implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da Pregça é Filó");

		
	}

	@Override
	public void idade() {
		System.out.println("Filó tem 65 anos !");

		
	}

	@Override
	public void emitirSom() {
		System.out.println("Filó adora se espreguiçar IIIUUUUUU");

		
	}

	@Override
	public void correr() {
		
		
	}

	@Override
	public void SubiremArvore() {
		System.out.println("Escala as árvores com calma");

		
	}

	@Override
	public void comer() {
		System.out.println("Filó adora os frutiferos da floresta !");
		
	}

}
