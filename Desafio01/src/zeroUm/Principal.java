//Implemente um jogo no qual tr�s jogadores jogam, defina os nomes como jogador A, jogador B e jogador C, 
//para isso utilize um array de inteiros com tr�s posi��es, onde a posi��o 0 corresponde ao jogador A e assim
//sucessivamente, os valores desse array ser�o preenchidos de forma rand�mica entre 0 e 1, utilize a fun��o 
//Random vista na quest�o 1. Encontrando um ganhador escreva o Jagador X ganhou, caso n�o tenha ganhador informa tamb�m.

package zeroUm;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random x = new Random();
		int valor1 = x.nextInt(2);
		int valor2 = x.nextInt(2);
		int valor3 = x.nextInt(2);
		
		Servico s = new Servico();
		
		s.entrada(valor1, valor2, valor3);
		
		String jogadorA, jogadorB, jogadorC;
		
		System.out.println("BEM VINDO AO ZERINHO OU UM!");
		System.out.println("\nDigite o nome do primeiro jogador: ");
		jogadorA = input.nextLine();
		System.out.println("\nDigite o nome do segundo jogador: ");
		jogadorB = input.nextLine();
		System.out.println("\nDigite o nome do terceiro jogador: ");
		jogadorC = input.nextLine();
		
		s.game(jogadorA, jogadorB, jogadorC);
	}
}