//Utilizando a classe random, desenvolva um jogo, no qual um n�mero aleat�rio � gerado no
//intervalo de 0 a 99, depois solicite que o usu�rio adivinhe esse n�mero, e d� dicas ao usu�rio,
//quando o usu�rio digitar um n�mero menor que o n�mero gerado informe que � menor, quando
//usu�rio digitar um n�mero maior informe que o n�mero � maior, quando o usu�rio acertar
//exiba a mensagem �Parab�ns voc� acertou�. Armazene as tentativas em um Array e depois apresente.

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
				System.out.println("\nAdvinhe o n�mero: ");
				dgt = input.nextInt();
				x.entrada(dgt);
				x.validacao(dgt, aleatorio);
			} 
		}
		x.tentativas();
	}
}