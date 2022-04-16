package agenda;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Servico s = new Servico();
		
		System.out.println("<AGENDA DE CONTATOS>");
		
		System.out.println("\nADICIONAR CONTATOS:");
		for(int cont = 0; cont < 3; cont ++) {
			Contato contato = new Contato();
			
			System.out.println("\nDigite o nome: ");
			contato.setNome(input.next());
			
			System.out.println("Digite o n�mero: ");
			contato.setNumero(input.next());
			
			s.adicionar(contato);
		}
		s.listar();
		
		System.out.println("\n\nPROCURAR CONTATO:");
		System.out.println("Qual contato deseja buscar?");
		String nomeBusca = input.next();
		
		s.procurar(nomeBusca);
		
		System.out.println("\n\nADICIONAR EM UMA POSI��O ESPEC�FICA:");
		Contato contatoAdd = new Contato();
		
		System.out.println("\nDigite a posi��o:");
		int posicaoAdd = input.nextInt();
		System.out.println("\nDigite o nome:");
		contatoAdd.setNome(input.next());
		System.out.println("\nDigite o n�mero:");
		contatoAdd.setNumero(input.next());
		
		s.adicionarPosicao(posicaoAdd, contatoAdd);
		s.listar();
		
		input.close();
	}
}