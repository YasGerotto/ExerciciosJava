package br.com.generation.orienta�aoeobjeto;

public class TesteFuncionario {

	public static void main(String[] args) {
	
		Funcion�rio f = new Funcion�rio();
		
	
		f.setNome ("Cristiano Almeida");
		f.setDatadeContrata�ao("10 Agosto de 2020");
		f.setFun�ao("Auxiliar administrativo");
	    f.setHorariodeTrabalho(" Das 07:00 �s 16:00h");
	    

	    System.out.println("Funcion�rio: " + f.getNome());
	    System.out.println("Contratado em :" + f.getDatadeContrata�ao());
	    System.out.println("\nFun��o:" + f.getFun�ao()+ "\nHor�rio de Trabalho:" + f.getHorariodeTrabalho() + "\n");
	    
	    
	    
	    
	    
	}
	
	

}
