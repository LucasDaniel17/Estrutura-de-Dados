package questaoBanco;

import java.util.Scanner;

public class CadastrarConta {
	
	Scanner input = new Scanner(System.in);
	Conta vetor[] = new Conta[3];
	String nome;
	double valor;
	
	public void adicionarConta() {
		for (int c = 0; c < vetor.length; c++) {
			Conta conta = new Conta();
			
			System.out.println("\nDigite seu nome: ");
			nome = input.next();
			conta.setNome(nome);
			
			System.out.println("\nDigite o valor: ");
			valor = input.nextInt();
			conta.setValor(valor);
			
			vetor[c] = conta;	
		}	
	}
	
	public void listarConta() {
		for (int c = 0; c < vetor.length; c++) {
			System.out.println("\nNome da conta: " + vetor[c].getNome());
			System.out.println("Valor na conta: " + vetor[c].getValor());
		}
	}
	
	public void procurarConta() {
		String busca;
		System.out.println("\nDigite o nome da conta que deseja encontrar: ");
		busca = input.next();
		
		for (int c = 0; c < vetor.length; c++) {
			if (vetor[c].getNome().equals(busca)) {
				System.out.println("\nRESULTADO DA BUSCA:");
				System.out.println("Nome da conta: " + vetor[c].getNome());
				System.out.println("Valor na conta: " + vetor[c].getValor());
			}
		}
	}
}