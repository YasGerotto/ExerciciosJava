package br.com.generation.interface1.poliformismo;

public class TestaAnimal {

	public static void infoAnimal (Animal animal) {
		
		animal.nome();
		animal.idade();
		animal.emitirSom();
		animal.correr();
		animal.SubiremArvore();
		animal.comer();
		
	}

public static void maisn(String[] args) {
	
	infoAnimal(new cachorro());
	infoAnimal(new Cavalo());
	infoAnimal(new Preguiça());
	
	
	}
}
