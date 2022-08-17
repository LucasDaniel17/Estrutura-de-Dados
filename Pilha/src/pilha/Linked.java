package pilha;

import java.util.LinkedList;

public class Linked {
	LinkedList<Contato> lista = new LinkedList<Contato>();
	
	public boolean verificar() {
		return lista.isEmpty();		
	}
	
	public void inserirFim(Contato c) {
		if (verificar()) {
			lista.add(c);
		} else  {
			lista.addLast(c);
		}	
	}	
	
	public void removerUltimo() {
		lista.removeLast();
	}
	
	public void mostrar() {
		System.out.println("\n" + lista.toString());
	}
}