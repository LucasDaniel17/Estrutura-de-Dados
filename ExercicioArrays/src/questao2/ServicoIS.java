package questao2;

import java.util.Scanner;

public class ServicoIS {
	Scanner input = new Scanner(System.in);
	int vetor[] = new int[10];
	
	public void inserir() {
		int numero;
		
		for (int c = 0; c < vetor.length; c++) {
			System.out.println("\nDigite um número: ");
			numero = input.nextInt();
			
			vetor[c] = numero;
		}
	}
	public void somar() {
		int result = 0;
		int aux = 0;
		for (int i = 0; i < vetor.length; i++) {
			result = vetor[i] + aux;
			aux = result;
		}
		System.out.println("Resultado da soma: " + result);
	}
}