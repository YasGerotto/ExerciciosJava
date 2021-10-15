package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;



public class TestaEstoque {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Estoque> estoque = new ArrayList<Estoque>();
	
	int press = -1;
	
	estoque.add(new Estoque("Arroz Camil", 1232));
	estoque.add(new Estoque("Feijão Carioca", 1234));
	estoque.add(new Estoque("Macarrão Adria" , 1235));
	estoque.add(new Estoque("Açucar União", 1236));

	while(press !=0) {
		
		System.out.println("[1]Adicione um produto:\n[2]Remover produto\n[3]Atualiza Estoque\n[0]Sair");
		press = sc.nextInt();
		
		if (press==1) {
			System.out.println("Insira o nome do produto");
			String produto = sc.next();
			
			System.out.println("Insira o código do produto:");
			int codigo = sc.nextInt();
			
			System.out.println();
			estoque.add(new Estoque(produto, codigo));
		}
		
		else if(press ==2) {
			System.out.println("Digite o código do item que deseja remover");
			int i = sc.nextInt();
			estoque.remove(i);
			
		}
		
		else if(press ==3) {
		System.out.println("Digite o código do produto que deseja atualizar:");
		int i = sc.nextInt();
		
		System.out.println("Insira o nome do novo produto:");
		String produto = sc.next();
		
		System.out.println("Insira código do produto:");
		int numSerie = sc.nextInt();
	
		estoque.set(i, new Estoque(produto, numSerie));	
		}
		
		
		
			for (int i = 0; i < estoque.size(); i++ ) {
			System.out.println(i + "|" + estoque.get(i));	
			System.out.println();
			}
		
	}
	sc.close();
	
	
	
	
	
	
	}

}
