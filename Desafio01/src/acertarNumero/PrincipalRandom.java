//Utilizando a classe random, desenvolva um jogo, no qual um número aleatório é gerado no
//intervalo de 0 a 99, depois solicite que o usuário adivinhe esse número, e dê dicas ao usuário,
//quando o usuário digitar um número menor que o número gerado informe que é menor, quando
//usuário digitar um número maior informe que o número é maior, quando o usuário acertar
//exiba a mensagem “Parabéns você acertou”. Armazene as tentativas em um Array e depois apresente.

package acertarNumero;

import java.util.Random;
import java.util.Scanner;

public class PrincipalRandom {

	public static void main(String[] args) {
		int dgt = 0;
		RandomServ x = new RandomServ();
		Scanner input = new Scanner(System.in);	
		
		Random r = new Random();
		int aleatorio = r.nextInt(99);
		
		System.out.println("BEM VINDO AO JOGO!");		
		
		for (int c = 0; c <= 100; c++) {
			if (dgt != aleatorio) {
				System.out.println("\nAdvinhe o número: ");
				dgt = input.nextInt();
				x.entrada(dgt);
				x.validacao(dgt, aleatorio);
			} 
		}
		x.tentativas();
	}
}