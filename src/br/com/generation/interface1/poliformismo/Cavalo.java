package br.com.generation.interface1.poliformismo;

public class Cavalo implements Animal {

	@Override
	public void nome() {
		System.out.println("O nome do Cavalo � Sans�o");

		
	}

	@Override
	public void idade() {
		System.out.println("Sans�o te, 5 anos !");

		
	}

	@Override
	public void emitirSom() {
		System.out.println("Sans�o relincha - MIRI RI RI RI .. ");

		
	}

	@Override
	public void correr() {
		System.out.println("Sans�o galopa por toda Chac�ra - POCOT� POCOT� POCOT�");
		
	}

	@Override
	public void SubiremArvore() {
		System.out.println();
		
	}

	@Override
	public void comer() {
		System.out.println("Sans�o come capin e sua ra��o favorita !");
		
	}



}


