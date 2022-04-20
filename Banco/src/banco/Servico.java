//erro: passar parametro com a quantidade de posições que o usuário escolheu para criar o lenght do vetor.

package banco;

import java.util.Arrays;
import java.util.Scanner;

public class Servico {
	Scanner input = new Scanner(System.in);
	Conta vetor[] = new Conta[1];
	int aux = 0;
	
	public void adicionar (Conta conta, int x) {
		aumentarVetor();
		this.vetor[aux] = conta;
		aux++;
		
	}
	
	public void listar () {
		System.out.println("\nLISTA DE CONTATOS: ");
		System.out.println(Arrays.toString(vetor));
	}
	
	public void procurarConta () {
		System.out.println("\n\nPROCURAR CONTA: ");
		System.out.print("\nDigite o nome da conta que deseja: ");
		String nomeBusca = input.next();
		
		for (int cont = 0; cont < aux; cont++) {
			if (nomeBusca.equalsIgnoreCase(this.vetor[cont].getNome())) {
				System.out.println("RESULTADO DA BUSCA: " + this.vetor[cont]);
			}
		}
	}
	
	public void posicaoADD (int posicaoAdc, Conta conta2) {
		aumentarVetor();
		
		for(int cont = aux-1; cont >= posicaoAdc; cont--) {
			this.vetor[cont+1] = this.vetor[cont];
		}
		this.vetor[posicaoAdc] = conta2;
		aux++;
	}
	
	public void posicaoRMV (int posicaoR) {
		aumentarVetor();
		for (int cont = posicaoR; cont < aux; cont++) {
			this.vetor[cont] = this.vetor[cont+1];	
		}
		aux--;
		for (int cont2 = 0; cont2 <= aux-1; cont2++) {
			System.out.print(this.vetor[cont2] + "; ");
		}
	}
	
	public void aumentarVetor () {
		if (this.aux == this.vetor.length) {
			Conta novoVetor[] = new Conta[this.vetor.length+1];
			System.arraycopy(this.vetor, 0, novoVetor, 0, this.vetor.length);
			this.vetor = novoVetor;
		}
	input.close();
	}
}