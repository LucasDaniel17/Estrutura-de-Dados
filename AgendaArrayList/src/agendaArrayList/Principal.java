package agendaArrayList;

import java.util.Scanner;

import agendaArrayList.Contato;
import agendaArrayList.Servico;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Servico s = new Servico();
		
		System.out.println("<AGENDA DE CONTATOS>");
		
		System.out.println("\nADICIONAR CONTATOS:");
		for(int cont = 0; cont < 3; cont ++) {
			Contato contato = new Contato();
			
			System.out.print("\nDigite o nome: ");
			contato.setNome(input.next());
			
			System.out.print("Digite o n�mero: ");
			contato.setNumero(input.next());
			
			s.adicionar(contato);
		}
		s.listar();
		
		System.out.println("\n\nADICIONAR POSI��O:");
		System.out.println("\nVoc� deseja ADICIONAR uma conta em alguma posi��o espec�fica?");
		System.out.print("Digite sim ou n�o -> ");
		String confirmacaoADD = input.next();
		
		while (confirmacaoADD.equalsIgnoreCase("sim")) {
			Contato contatoAdd = new Contato();
			
			System.out.print("\nDigite a posi��o: ");
			int posicaoAdd = input.nextInt();
			System.out.print("Digite o nome: ");
			contatoAdd.setNome(input.next());
			System.out.print("Digite o n�mero: ");
			contatoAdd.setNumero(input.next());
			
			s.adicionarPosicao(posicaoAdd, contatoAdd);
			
			System.out.print("\nDeseja realizar mais uma adi��o? ");
			confirmacaoADD = input.next();	
		}
		s.listar();
		
		System.out.println("\n\nREMOVER POSI��O:");
		System.out.println("\nVoc� deseja REMOVER uma conta em alguma posi��o espec�fica?");
		System.out.print("Digite sim ou n�o -> ");
		String confirmacaoR = input.next();
		
		while (confirmacaoR.equalsIgnoreCase("sim")) {
			System.out.print("\nDigite a posi��o: ");
			int posicaoRmv = input.nextInt();
		
			s.removerPosicao(posicaoRmv);
		
			System.out.print("\nDeseja realizar mais uma remo��o? ");
			confirmacaoR = input.next();
		}
		s.listar();
		
		System.out.println("\n\nREMOVER POR NOME:");
		System.out.print("Digite o nome que deseja remover: ");
		String nomeRmv = input.next();
		s.removerNome(nomeRmv);
		
		s.listar();
		
		input.close();
	}
}