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
		
		s.procurar();
		
		System.out.println("\n\nADICIONAR POSI��O:");
		System.out.println("\nVoc� deseja ADICIONAR uma conta em alguma posi��o espec�fica?");
		System.out.println("OBS: Digite sim ou n�o.");
		String confirmacaoADD = input.next();
		
		while (confirmacaoADD.equalsIgnoreCase("sim")) {
			Contato contatoAdd = new Contato();
			
			System.out.println("\nDigite a posi��o:");
			int posicaoAdd = input.nextInt();
			System.out.println("Digite o nome:");
			contatoAdd.setNome(input.next());
			System.out.println("Digite o n�mero:");
			contatoAdd.setNumero(input.next());
			
			s.adicionarPosicao(posicaoAdd, contatoAdd);
			
			System.out.println("\nDeseja realizar mais uma adi��o?");
			confirmacaoADD = input.next();	
		}
		s.listar();
		
		System.out.println("\n\nREMOVER POSI��O:");
		System.out.println("\nVoc� deseja REMOVER uma conta em alguma posi��o espec�fica?");
		System.out.println("OBS: Digite sim ou n�o.");
		String confirmacaoR = input.next();
		
		while (confirmacaoR.equalsIgnoreCase("sim")) {
			System.out.println("\nDigite a posi��o:");
			int posicaoRmv = input.nextInt();
		
			s.removerPosicao(posicaoRmv);
		
			System.out.println("\n\nDeseja realizar mais uma remo��o?");
			confirmacaoR = input.next();
		}
		s.procurar();
		
		input.close();
	}
}