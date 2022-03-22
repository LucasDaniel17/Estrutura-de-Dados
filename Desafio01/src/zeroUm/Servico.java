package zeroUm;

import java.util.Arrays;

public class Servico {
	
	int posicao[] = new int[3];
	int aux = 0;
	int jA, jB, jC;
	
	public void entrada (int valor1, int valor2, int valor3) {
		posicao[0] = valor1;
		posicao[1] = valor2;
		posicao[2] = valor3;
		
		this.jA = posicao[0];
		this.jB = posicao[1];
		this.jC = posicao[2];
	}
	
	public void game(String jogadorA, String jogadorB, String jogadorC) {
		
		if (jA == 0 && jB == 0 && jC == 0) {
			System.out.println("\nNão teve ganhador!");
		} else if (jA == 1 && jB == 1 && jC == 1) {
			System.out.println("\nNão teve ganhador!");			 
		
		} else if (jA == 1 && jB == 1 && jC == 0) {
			System.out.println("\n" + jogadorC + "(jC) ganhou!");
		} else if (jA == 1 && jB == 0 && jC == 1) {
			System.out.println("\n" + jogadorB + "(jB) ganhou!");
		} else if (jA == 0 && jB == 1 && jC == 1) {
			System.out.println("\n" + jogadorA + "(jA) ganhou!");
		
		} else if (jA == 0 && jB == 0 && jC == 1) {
			System.out.println("\n" + jogadorC + "(jC) ganhou!");
		} else if (jA == 0 && jB == 1 && jC == 0) {
			System.out.println("\n" + jogadorB + "(jB) ganhou!");
		} else if (jA == 1 && jB == 0 && jC == 0) {
			System.out.println("\n" + jogadorA + "(jA) ganhou!");
		}
	}
}