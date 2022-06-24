package br.ifba.edu;

import javax.swing.JOptionPane;

import br.ifba.edu.Celula;

public class ListaSimples {
	private Celula cabeca;
	private Celula cauda;
	
	private int totalElementos = 0;
	
	//ADICIONAR NO COME�O
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
	
	//VERIFICAR POSI��O
	public boolean verificar(int posicao) {
		return posicao >= 0 && posicao< this.totalElementos;
	}
	
	//ADICIONAR POSI��O ESPECIFICA
	public void adicionarNaPosicao (int posicao, Object obj) {				
		if (posicao == 0) {
			this.adicionaNoComeco(obj);
		} 
		else if (posicao == this.totalElementos) {
			this.adicionaNoFim(obj);
		}
		else if (!this.verificar(posicao)) {
			JOptionPane.showMessageDialog(null, "Posi��o Inv�lida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posi��o digitada � inv�lida");
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
	
	//REMOVER NO COME�O
	public void RemoverPrimeira () {				
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		aux.setProxima(null);
		this.totalElementos--;
	}
	
	//REMOVER NO FIM
	public void RemoverUltima () {
		Celula aux = this.cauda;
		aux.setProxima(null);
		this.totalElementos--;
	}
	
	//REMOVER POSI��O ESPECIFICA
	public void RemoverNaPosicao (int posicao) {
		if (posicao == 0) {
			this.RemoverPrimeira();
		}
		else if (posicao == this.totalElementos) {
			this.RemoverUltima();
		}
		else if (!this.verificar(posicao)) {
				JOptionPane.showMessageDialog(null, "Posi��o Inv�lida", null, JOptionPane.ERROR_MESSAGE);
				throw new IllegalArgumentException("A posi��o digitada � inv�lida");
		}	
		else {
			Celula aux = this.cabeca;
			
			for (int i = 0; i < posicao - 1; i++) {						
				aux = aux.getProxima();			
			}		
			
			aux.setProxima(aux.getProxima().getProxima());
			aux.getProxima();
			this.totalElementos--;
		}
	}
	
	//IMPRIMIR
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