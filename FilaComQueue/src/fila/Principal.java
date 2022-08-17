package fila;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		Linked linked = new Linked();
	
		Contato c1 = new Contato("Fulano", "123");
		Contato c2 = new Contato("Pedro", "321");
		Contato c3 = new Contato("Lucas", "987");
		Contato c4 = new Contato("Daniel", "456");
		Contato c5 = new Contato("João", "876");
		Contato c6 = new Contato("Maria", "159");
		Contato c7 = new Contato("Mateus", "753");
	
		linked.inserir(c1);
		linked.inserir(c2);
		linked.inserir(c3);		
		linked.mostrar();
		
		linked.remover();		
		linked.inserir(c4);
		linked.mostrar();
		
		linked.remover();
		linked.inserir(c5);
		linked.mostrar();
		
		linked.inserir(c6);	
		linked.remover();
		linked.inserir(c7);
		linked.mostrar();
	}
}