package banco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Servico s = new Servico();
		
		System.out.println("<SISTEMA DE CONTAS BANCÁRIAS>");
		
		System.out.println("\nSERVIÇOS DISPONÍVEIS: [1] - Adicionar; [2] - Add em posição específica; [3] - Remover posição; [4] - Listar contas;");
		System.out.println("[5] - Procurar conta; [Tecla aleatória] - Finalizar.");
		System.out.println("\nQual desses serviços você deseja utilizar?");
		System.out.print("Digite o número: ");
		String servico = input.next();
		
		while (servico.equals("1") || servico.equals("2") || servico.equals("3") || servico.equals("4") || servico.equals("5")) {
			if (servico.equals("1")) {
				System.out.println("\nADICIONAR CONTAS: ");
				System.out.print("Quantas contas deseja adicionar? ");
				int x = input.nextInt();
				
				for (int cont = 0; cont <= x; cont++) {
					Conta conta = new Conta();
					
					System.out.print("\nDigite o nome: ");
					conta.setNome(input.next());
					System.out.print("Digite o valor: ");
					conta.setValor(input.next());
					
					s.adicionar(conta, x);
				}
			}
			if (servico.equals("2")) {
				System.out.println("\n\nADICIONAR POSIÇÃO:");
				
				System.out.println("\nVocê deseja ADICIONAR uma conta em um posição específica?");
				System.out.print("Digite SIM ou NÃO -> ");
				String teste = input.next();
				
				while(teste.equalsIgnoreCase("sim")) {
					Conta conta2 = new Conta();
					System.out.print("\nDigite a posição: ");
					int posicaoAdc = input.nextInt();
					
					System.out.print("Digite o nome: ");
					conta2.setNome(input.next());
					System.out.print("Digite o valor: ");
					conta2.setValor(input.next());
					
					s.posicaoADD(posicaoAdc, conta2);
					
					System.out.println("\n\nDeseja adicionar outra conta?");
					System.out.print("Digite SIM ou NÃO -> ");
					teste = input.next();
				}
			}
			if (servico.equals("3")) {
				System.out.println("\nVocê deseja REMOVER uma conta em um posição específica?");
				System.out.print("Digite SIM ou NÃO -> ");
				String teste2 = input.next();
				
				while(teste2.equalsIgnoreCase("sim")) {
					System.out.print("\nDigite a posição: ");
					int posicaoR = input.nextInt();
					
					s.posicaoRMV(posicaoR);
					
					System.out.println("\n\nDeseja remover outra posição? ");
					System.out.print("Digite SIM ou NÃO -> ");
					teste2 = input.next();
				}
			}
			if (servico.equals("4")) {
				s.listar();
			}
			if (servico.equals("5")) {
				s.procurarConta();
			}
			System.out.println("\n\nQuer continuar usando os serviços?");
			System.out.print("Digite SIM ou NÃO -> ");
			String repetir = input.next();
			
			if (repetir.equalsIgnoreCase("sim")) {
				System.out.println("\nSERVIÇOS DISPONÍVEIS: [1] - Adicionar; [2] - Add em posição específica; [3] - Remover posição; [4] - Listar contas;");
				System.out.println("[5] - Procurar conta; [Tecla aleatória] - Finalizar.");
				System.out.print("Digite o número: ");
				servico = input.next();
			}
		}	
		input.close();
	}
}