package Fila;

import java.util.LinkedList;

public class Linked {
	
	LinkedList<Contato> lista = new LinkedList<Contato>();
	
	public boolean verificar() {
		return lista.isEmpty();		
	}
	
	public void inserir(Contato c) {
		if (verificar()) {
			lista.addFirst(c);
		} else  {
			lista.addLast(c);
		}		
	}
	
	public void remover() {
		lista.removeFirst();
	}
	
	public void mostrar() {
		System.out.println("\n" + lista.toString());
	}
}