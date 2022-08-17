package pilha;

import java.util.LinkedList;
import java.util.Stack;

public class Linked {
	Stack<Contato> p = new Stack<Contato>();
	
	public void verificar() {
		System.out.println(p.size());		
	}
	
	public void inserirFim(Contato c) {
		p.push(c);
	}	
	
	public void removerUltimo() {
		p.pop();
	}
	
	public void mostrar() {
		System.out.println("\n" + p.toString());
	}
}