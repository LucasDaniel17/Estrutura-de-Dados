package br.ifba.edu.lista;

import javax.swing.JOptionPane;

import br.ifba.edu.basica.Celula;

public class Lista {
	private Celula cabeca;
	private Celula cauda;
	
	private int totalElementos = 0;
	
	//ADICIONAR NO COMEÇO
	public void adicionaNoComeco (Object obj) {
		
		Celula nova = new Celula(this.cabeca, obj);
		this.cabeca = nova;
		
		if (totalElementos == 0) {
			this.cauda = nova;
		}
		
		this.totalElementos++;		
	}	
	
	//ADICIONAR NO FIM
	public void adicionaNoFim (Object obj) {
		
		if (this.totalElementos == 0) {
			this.adicionaNoComeco(obj);
		}		
		else {
			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;		
		}
	}
	
	//VERIFICAR POSIÇÃO:
	public boolean verificar(int posicao) {
		return posicao >= 0 && posicao< this.totalElementos;
	}
	
	//ADICIONAR NA POSIÇÃO
	public void adicionarNaPosicao (int posicao, Object obj) {				
		if (posicao == 0) {
			this.adicionaNoComeco(obj);
		} 
		else if (posicao == this.totalElementos) {
			this.adicionaNoFim(obj);
		}
		else if (!this.verificar(posicao)) {
			JOptionPane.showMessageDialog(null, "Posição Inválida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posição digitada é inválida");
		}		
		else {		
			Celula aux = this.cabeca;
				
			for (int i = 0; i < posicao - 1; i++) {						
				aux = aux.getProxima();			
			}		
			Celula nova = new Celula(aux.getProxima(), obj);
			aux.setProxima(nova);
			this.totalElementos++;
		}				
	}
	
	public void RemoverPrimeira () {				
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		aux.setProxima(null);
		this.totalElementos--;
	}
	
	public void RemoverUltima () {
		Celula aux = this.cauda;
		
		//Outra forma que funcionou:
		/* Celula aux = this.cabeca;
		
		for (int i = 0; i < this.totalElementos - 1; i++) {						
			aux = aux.getProxima();			
		}
		this.cauda = aux; */
		
		aux.setProxima(null);
		this.totalElementos--;
	}
	
	public void RemoverNaPosicao (int posicao) {
		if (posicao == 0) {
			this.RemoverPrimeira();
		}
		else if (posicao == this.totalElementos) {
			this.RemoverUltima();
		}
		else if (!this.verificar(posicao)) {
			JOptionPane.showMessageDialog(null, "Posição Inválida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posição digitada é inválida");
		}	
		else {
			Celula aux = this.cabeca;
			
			for (int i = 0; i < posicao - 1; i++) {						
				aux = aux.getProxima();			
			}		
			
			aux.setProxima(null);
			this.totalElementos--;
		}
	}
	
	public String toString() {		
		if (this.totalElementos==0) {
			return"[]";
		}
		
		StringBuilder listaencadeada = new StringBuilder("[");
		Celula atual = this.cabeca;
		
		for (int i = 0; i < this.totalElementos -1; i++) {
			listaencadeada.append(atual.getObjeto() );
			listaencadeada.append(",");
			atual = atual.getProxima();
		}
		
		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");
		
		return listaencadeada.toString();
	}
}