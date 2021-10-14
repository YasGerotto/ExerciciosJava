package br.com.generation.interface1.poliformismo;

public class Cavalo implements Animal {

	@Override
	public void nome() {
		System.out.println("O nome do Cavalo é Sansão");

		
	}

	@Override
	public void idade() {
		System.out.println("Sansão te, 5 anos !");

		
	}

	@Override
	public void emitirSom() {
		System.out.println("Sansão relincha - MIRI RI RI RI .. ");

		
	}

	@Override
	public void correr() {
		System.out.println("Sansão galopa por toda Chacára - POCOTÓ POCOTÓ POCOTÓ");
		
	}

	@Override
	public void SubiremArvore() {
		System.out.println();
		
	}

	@Override
	public void comer() {
		System.out.println("Sansão come capin e sua ração favorita !");
		
	}



}


