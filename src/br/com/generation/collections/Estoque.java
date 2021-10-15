package br.com.generation.collections;

public class Estoque {
	
	
	private String produto;
	int codigo;
	
	
	public Estoque (String produto, int codigo) {
		super();
		this.produto = produto;
		this.codigo = codigo;
		
	}
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		return this.produto + "| Código do produto:" + this.codigo;
	}

}
