package br.com.generation.herança.polimorfismo;

public class Animais {

	private String nome;
	private int idade;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void emitirSom(String som) {
		System.out.println("Som emitido" + som);
	}
	
	
}
