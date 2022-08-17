package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Linked {
	Queue<Contato> lista = new LinkedList<Contato>();
	
	public boolean verificar() {
		return lista.isEmpty();		
	}
	
	public void inserir(Contato c) {		
		lista.add(c);
	}	
	
	public void remover() {
		lista.remove();
	}
	
	public void mostrar() {
		System.out.println("\n" + lista.toString());
	}
		
	public void inverter() {
		Stack<Contato> p = new Stack<Contato>();
		
		for(int i = 0; i <= lista.size(); i++) {			
			p.push(lista.remove()); 
		}
		
		for (int y = 0; y <= p.size(); y++) {
			lista.add(p.pop());
		}		
	}
}