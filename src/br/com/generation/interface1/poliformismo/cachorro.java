package br.com.generation.interface1.poliformismo;

public class cachorro implements Animal {

	@Override
	public void nome() {
		System.out.println("O nome do cachorro � Corote");
		
	}

	@Override
	public void idade() {
		System.out.println("Corote tem 1 ano");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Corote sempre late: AU -AU - AU ");
		
	}

	@Override
	public void correr() {
		System.out.println("Corote est� correndo atr�s dos vizinhos !");
		
		
	}

	@Override
	public void SubiremArvore() {
		System.out.println();
		
	}

	@Override
	public void comer() {
		System.out.println("Corote est� comendo ra��o e legumes !");

		
	}

}
