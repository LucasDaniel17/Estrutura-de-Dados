package pilha;

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
		
		linked.inserirFim(c1);
		linked.inserirFim(c2);
		linked.inserirFim(c3);
		linked.mostrar();
		
		linked.removerUltimo();
		linked.inserirFim(c4);
		linked.mostrar();
		
		linked.inserirFim(c5);
		linked.inserirFim(c6);
		linked.mostrar();
		
		linked.removerUltimo();
		linked.inserirFim(c7);
		linked.mostrar();
		
		linked.verificar();
	}
}