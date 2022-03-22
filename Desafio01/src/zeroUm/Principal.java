//Implemente um jogo no qual três jogadores jogam, defina os nomes como jogador A, jogador B e jogador C, 
//para isso utilize um array de inteiros com três posições, onde a posição 0 corresponde ao jogador A e assim
//sucessivamente, os valores desse array serão preenchidos de forma randômica entre 0 e 1, utilize a função 
//Random vista na questão 1. Encontrando um ganhador escreva o Jagador X ganhou, caso não tenha ganhador informa também.

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