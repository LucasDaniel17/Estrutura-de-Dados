package questao1;

import java.util.Arrays;
import java.util.Scanner;

public class ServicoOA {
	Scanner input = new Scanner(System.in);
	String vetor[] = new String [10];
	
	public void entrada () {
		String nome;
		
		System.out.println("BEM VINDO! Vamos ordenar.");
		for (int c = 0; c < vetor.length; c++) {
			System.out.println("\nDigite o nome: ");
			nome = input.next();	
			vetor[c] = nome;
		}
	}
	public void imprimir() {
		Arrays.sort(vetor);
		System.out.println(Arrays.toString(vetor));
	}
}