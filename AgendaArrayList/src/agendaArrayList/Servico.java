package agendaArrayList;

import java.util.ArrayList;

public class Servico {
	
	ArrayList<Contato> lista = new ArrayList<Contato>();
	
	public void adicionar (Contato contato) {		
		lista.add(contato);
	}
	
	public void adicionarPosicao (int posicaoAdd, Contato contatoAdd) {
		lista.add(posicaoAdd, contatoAdd);
	}

	public void removerPosicao (int posicaoRmv) {
		lista.remove(posicaoRmv);
	}
	
	public void removerNome (String nomeRmv) {
		/* for(Contato c: lista) {
			if(c.getNome().equalsIgnoreCase(nomeRmv)) {
				lista.remove(c);
				break;
			}	
		} */
		
		for(int cont = 0; cont < lista.size(); cont++) {
			if (nomeRmv.equalsIgnoreCase(lista.get(cont).getNome()));{
				lista.remove(cont);	
				break;
			}
		}	
	}
	
	public void listar () {
		System.out.println("\nLISTA DE CONTATOS: " + lista);
	}
}