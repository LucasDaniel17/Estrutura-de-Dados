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
			
			System.out.println("Digite o número: ");
			contato.setNumero(input.next());
			
			s.adicionar(contato);
		}
		s.listar();
		
		s.procurar();
		
		System.out.println("\n\nADICIONAR POSIÇÃO:");
		System.out.println("\nVocê deseja ADICIONAR uma conta em alguma posição específica?");
		System.out.println("OBS: Digite sim ou não.");
		String confirmacaoADD = input.next();
		
		while (confirmacaoADD.equalsIgnoreCase("sim")) {
			Contato contatoAdd = new Contato();
			
			System.out.println("\nDigite a posição:");
			int posicaoAdd = input.nextInt();
			System.out.println("Digite o nome:");
			contatoAdd.setNome(input.next());
			System.out.println("Digite o número:");
			contatoAdd.setNumero(input.next());
			
			s.adicionarPosicao(posicaoAdd, contatoAdd);
			
			System.out.println("\nDeseja realizar mais uma adição?");
			confirmacaoADD = input.next();	
		}
		s.listar();
		
		System.out.println("\n\nREMOVER POSIÇÃO:");
		System.out.println("\nVocê deseja REMOVER uma conta em alguma posição específica?");
		System.out.println("OBS: Digite sim ou não.");
		String confirmacaoR = input.next();
		
		while (confirmacaoR.equalsIgnoreCase("sim")) {
			System.out.println("\nDigite a posição:");
			int posicaoRmv = input.nextInt();
		
			s.removerPosicao(posicaoRmv);
		
			System.out.println("\n\nDeseja realizar mais uma remoção?");
			confirmacaoR = input.next();
		}
		s.procurar();
		
		input.close();
	}
}