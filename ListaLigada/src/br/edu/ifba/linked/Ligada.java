package br.edu.ifba.linked;

import java.util.LinkedList;
import br.edu.ifba.basica.Contato;

public class Ligada {
	
	LinkedList<Contato> lista = new LinkedList<Contato>();
	
	public boolean verificaPosicao(int pos) {
		return pos >= 0 && pos < lista.size();
	}
	
	public void adicionarNoInicio(Contato c) {
		lista.addFirst(c);
	}
	
	public void adicionarNoFinal(Contato c) {
		if(lista.isEmpty()) {
			this.adicionarNoInicio(c);
		} else {
			lista.addLast(c);
		}
	}
	
	public void adicionarPorPosicao (int pos, Contato c) {
		if (!this.verificaPosicao(pos)) {
			System.out.println("Posição inválida!");
		} 
		else if(lista.isEmpty()) {
			this.adicionarNoInicio(c);
		}	
		else {
			lista.add(pos, c);
		}
	}
	
	public void removerNoInicio() {
		if(lista.isEmpty()) {
			System.out.println("A lista está vazia");
		}
		else {
			System.out.println("Elemento removido: " + lista.removeFirst());
		}
	}
	
	public void removerNoFinal () {
		System.out.println("Elemento removido: " + lista.removeLast());
	}
	
	public void removerPorPosicao (int pos) {
		if(lista.isEmpty()) {
			System.out.println("A lista está vazia");
		}
		else if (!this.verificaPosicao(pos)) {
			System.out.println("Posição inválida!");
		} 
		else { 
			lista.remove(pos);
		}	
	}
	
	public void imprimir() {
		System.out.println("\n" + lista.toString());
	}
}