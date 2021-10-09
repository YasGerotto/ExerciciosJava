package br.com.generation.heran�a.polimorfismo;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cach = new Cachorro();
		Cavalo cav = new Cavalo ();
		Pregui�a Preg = new Pregui�a();
		
		cach.setNome("Corote");
		cach.setIdade(2);

		cav.setNome("Jhonis");
		cav.setIdade(5);
		
		Preg.setNome("Mileide");
		Preg.setIdade(6);
		
		System.out.println("O nome do cachorro �:" + cach.getNome());
		System.out.println("Sua idade � :" + cach.getIdade() + "anos");
		cach.emitirSom("Au-Au");
		
		System.out.println();
		
		System.out.println("O nome do cavalo �:" + cav.getNome());
		System.out.println("Sua idade � :" + cav.getIdade() + "anos");
		cav.emitirSom("Mirrririi");
		
		
		System.out.println();
		
		System.out.println("O nome da pregui�a �:" + Preg.getNome());
		System.out.println("Sua idade � :" + Preg.getIdade() + "anos");
		Preg.emitirSom("Xiiii");
		
		
		
		
	}

}
