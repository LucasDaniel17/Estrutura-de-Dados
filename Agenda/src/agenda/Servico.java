package agenda;

import java.util.Arrays;

public class Servico {
	
	private Contato vetor[] = new Contato[3];
	int aux = 0;
	
	public void adicionar (Contato contato) {	
		this.vetor[this.aux] = contato;
		aux++;
	}
	
	public void listar () {
		System.out.println("\n<LISTA DE CONTATOS:>" );
			System.out.println(Arrays.toString(vetor));
	}

	
	public void procurar (String nomeBusca) {
		aux = 0;
		for(int cont = 0; cont < vetor.length; cont++) {
			if(nomeBusca.equals(this.vetor[cont].getNome())) {
				System.out.println(this.vetor[cont]);
			aux = 1;
			}
		}
		if(aux == 0) {
			System.out.println("\nNome não encontrado.");
		}
	}
}