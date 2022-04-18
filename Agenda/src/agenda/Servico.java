package agenda;

import java.util.Arrays;

public class Servico {
	
	private Contato vetor[] = new Contato[3];
	int aux = 0;
	
	public void adicionar (Contato contato) {	
		aumentarVetor();
		
		this.vetor[this.aux] = contato;
		this.aux++;
	}
	
	public void listar () {
		System.out.println("\nLISTA DE CONTATOS:" );
			System.out.println(Arrays.toString(vetor));
	}

	public void procurar (String nomeBusca) {
		int aux2 = 0;
		for(int cont = 0; cont < this.aux; cont++) {
			if(nomeBusca.equalsIgnoreCase(this.vetor[cont].getNome())) {
				System.out.println("\n" + this.vetor[cont]);
			aux2 = 1;
			}
		}
		if(aux2 == 0) {
			System.out.println("\nNome não encontrado.");
		}
	}
	
	public void adicionarPosicao (int posicaoAdd, Contato contatoAdd) {
		aumentarVetor();
		for (int cont = aux-1; cont >= posicaoAdd; cont--) {
			this.vetor[cont+1] = this.vetor[cont];
		}
		this.vetor[posicaoAdd] = contatoAdd;
		this.aux++;
	}
	
	public void removerPosicao (int posicaoRmv) {
		aumentarVetor();
		for (int cont = posicaoRmv; cont < this.aux; cont++) {
			this.vetor[cont] = this.vetor[cont+1];
		}
		this.aux--;
		for (int cont2 = 0; cont2 <= this.aux; cont2++) {
			System.out.print(this.vetor[cont2] + "; ");
		}
	}
	
	public void aumentarVetor() {
		if (this.aux == this.vetor.length) {
			Contato aumentar[] = new Contato[this.vetor.length+1];
			System.arraycopy(this.vetor, 0, aumentar, 0, this.vetor.length);
			this.vetor = aumentar;
		}
	}
}