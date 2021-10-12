package br.com.generation.orientaçaoeobjeto;

public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Yasmim");
		c1.setSobrenome(" Gerotto ");
		c1.setIdade(25);
		c1.setEstadoCivil("Solteira");
		
		
		System.out.println("***** Dados cadastrais do cliente *****");
		System.out.println("\nNome e sobrenome: " + c1.getNome() + c1.getSobrenome());
		System.out.println("Idade: " + c1.getIdade() + " anos ");
		System.out.println("Estado civil : " + c1.getEstadoCivil());
		
	}

}
