package br.com.generation.orientaçaoeobjeto;

public class Cliente {

private String Nome, sobrenome, estadoCivil;
private int idade;


public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public String getEstadoCivil() {
	return estadoCivil;
}
public void setEstadoCivil(String estadoCivil) {
	this.estadoCivil = estadoCivil;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
	
}
