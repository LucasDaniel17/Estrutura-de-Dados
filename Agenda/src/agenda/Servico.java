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
		System.out.println("\n\nLISTA DE CONTATOS:" );
			System.out.println(Arrays.toString(vetor));
	}

	public void procurar (String nomeBusca) {
		aux = 0;
		for(int cont = 0; cont < vetor.length; cont++) {
			if(nomeBusca.equals(this.vetor[cont].getNome())) {
				System.out.println("\n" + this.vetor[cont]);
			aux = 1;
			}
		}
		if(aux == 0) {
			System.out.println("\nNome não encontrado.");
		}
	}
	
	public void adicionarPosicao (int posicaoAdd, Contato contatoAdd) {
		aumentarVetor();
		for (int cont = vetor.length; cont >= posicaoAdd; cont--) {
			this.vetor[cont+1] = this.vetor[cont];
		}
		this.vetor[posicaoAdd] = contatoAdd;
		this.aux++;
	}
	
	public void aumentarVetor() {
		if (this.aux == this.vetor.length) {
			Contato aumentar[] = new Contato[this.vetor.length+5];
			System.arraycopy(this.vetor, 0, aumentar, 0, this.vetor.length);
			this.vetor = aumentar;
		}
	}
}