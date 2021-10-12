package br.com.generation.orientaçaoeobjeto;

public class TesteAviao {

	public static void main(String[] args) {
	
		Aviao a1 = new Aviao();
		
	     a1.setModelo("  Douglas DC");
	     a1.setAno(2004);
	     a1.setFabricante("Douglas Aircraft Company");
	     a1.setCapacidade(48);
	     
	     System.out.println("Modelo: " + a1.getModelo());
	        System.out.println("Fabricante: " + a1.getFabricante());
	        System.out.println("Ano: " + a1.getAno());
	        System.out.println("Capacidade: " + a1.getCapacidade()+" passageiros");
	        
	        a1.decolar(400);
	        System.out.println("Velocidade para Decolar: " + a1.getVelocidade());
	        
	        a1.voar(200);
	        System.out.println("Velocidade de cruzeiro: " + a1.getVelocidade());
	        
	        a1.pousar();
	        System.out.println("Velocidade de pouso: " + a1.getVelocidade());
	        
	}

}
