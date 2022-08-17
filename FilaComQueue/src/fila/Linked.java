package fila;

import java.util.LinkedList;
import java.util.Queue;

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
}