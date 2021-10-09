package br.com.generation.herança.polimorfismo;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cach = new Cachorro();
		Cavalo cav = new Cavalo ();
		Preguiça Preg = new Preguiça();
		
		cach.setNome("Corote");
		cach.setIdade(2);

		cav.setNome("Jhonis");
		cav.setIdade(5);
		
		Preg.setNome("Mileide");
		Preg.setIdade(6);
		
		System.out.println("O nome do cachorro é:" + cach.getNome());
		System.out.println("Sua idade é :" + cach.getIdade() + "anos");
		cach.emitirSom("Au-Au");
		
		System.out.println();
		
		System.out.println("O nome do cavalo é:" + cav.getNome());
		System.out.println("Sua idade é :" + cav.getIdade() + "anos");
		cav.emitirSom("Mirrririi");
		
		
		System.out.println();
		
		System.out.println("O nome da preguiça é:" + Preg.getNome());
		System.out.println("Sua idade é :" + Preg.getIdade() + "anos");
		Preg.emitirSom("Xiiii");
		
		
		
		
	}

}
