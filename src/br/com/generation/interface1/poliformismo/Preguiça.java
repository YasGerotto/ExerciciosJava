package br.com.generation.interface1.poliformismo;

public class Pregui�a implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da Preg�a � Fil�");

		
	}

	@Override
	public void idade() {
		System.out.println("Fil� tem 65 anos !");

		
	}

	@Override
	public void emitirSom() {
		System.out.println("Fil� adora se espregui�ar IIIUUUUUU");

		
	}

	@Override
	public void correr() {
		
		
	}

	@Override
	public void SubiremArvore() {
		System.out.println("Escala as �rvores com calma");

		
	}

	@Override
	public void comer() {
		System.out.println("Fil� adora os frutiferos da floresta !");
		
	}

}
