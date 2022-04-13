package agenda;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Servico s = new Servico();
		
		System.out.println("<AGENDA DE CONTATOS>");
		
		for(int cont = 0; cont < 3; cont ++) {
			Contato contato = new Contato();
			
			System.out.println("\nDigite o nome: ");
			contato.setNome(input.next());
			
			System.out.println("Digite o número: ");
			contato.setNumero(input.next());
			
			s.adicionar(contato);
		}
		s.listar();
		
		System.out.println("\n\n<PROCURAR CONTATO:>");
		System.out.println("\nQual conta deseja buscar?");
		String nomeBusca = input.next();
		
		s.procurar(nomeBusca);
	}
}
