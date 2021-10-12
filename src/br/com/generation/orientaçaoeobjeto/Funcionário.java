package br.com.generation.orientaçaoeobjeto;

public class Funcionário {

	private String Nome;
	private String funçao;
	private String DatadeContrataçao;
	private String HorariodeTrabalho;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getFunçao() {
		return funçao;
	}
	public void setFunçao(String funçao) {
		this.funçao = funçao;
	}
	public String getDatadeContrataçao() {
		return DatadeContrataçao;
	}
	public void setDatadeContrataçao(String datadeContrataçao) {
		DatadeContrataçao = datadeContrataçao;
	}
	public String getHorariodeTrabalho() {
		return HorariodeTrabalho;
	}
	public void setHorariodeTrabalho(String horariodeTrabalho) {
		HorariodeTrabalho = horariodeTrabalho;
	}

	
}
