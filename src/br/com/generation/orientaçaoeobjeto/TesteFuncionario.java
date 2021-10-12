package br.com.generation.orientaçaoeobjeto;

public class TesteFuncionario {

	public static void main(String[] args) {
	
		Funcionário f = new Funcionário();
		
	
		f.setNome ("Cristiano Almeida");
		f.setDatadeContrataçao("10 Agosto de 2020");
		f.setFunçao("Auxiliar administrativo");
	    f.setHorariodeTrabalho(" Das 07:00 Às 16:00h");
	    

	    System.out.println("Funcionário: " + f.getNome());
	    System.out.println("Contratado em :" + f.getDatadeContrataçao());
	    System.out.println("\nFunção:" + f.getFunçao()+ "\nHorário de Trabalho:" + f.getHorariodeTrabalho() + "\n");
	    
	    
	    
	    
	    
	}
	
	

}
