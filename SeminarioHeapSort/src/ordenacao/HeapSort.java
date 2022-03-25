package ordenacao;

import java.util.Random;

public class HeapSort {

	public static void main(String[] args) {
		Random r = new Random();
		int vetor[] = new int[7];
		
		System.out.println("TODO NA MAIN (Sem orientação a objetos)");
		
		System.out.print("\nNúmeros aleatórios(desordenados): ");
		for (int i = 0; i < vetor.length; i++) {
			int numero = r.nextInt(15);
			vetor[i] = numero;
			System.out.print(vetor[i] + " ");
		}
		//HeapSort
		int tamanho = vetor.length;
		
		for (int i = tamanho/2 - 1; i >= 0; i--) {
			heapSort (vetor, tamanho, i);
		}
		
		for (int d = tamanho-1; d > 0; d--) {
			int aux = vetor[0];
			vetor [0] = vetor [d];
			vetor [d] = aux; 
			
			heapSort(vetor, d, 0);
		}
		System.out.print("\n\nOrdenado: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	static void heapSort (int[] vetor, int tamanho, int i) {
		int raiz = i;
		int esquerda = 2*i + 1;
		int direita = 2*i + 2;
		
		if (esquerda < tamanho && vetor[esquerda] > vetor[raiz]) {
			raiz = esquerda;
		}
		if (direita < tamanho && vetor[direita] > vetor[raiz]) {
			raiz = direita;
		}
		if (raiz != i) {
			int aux = vetor[i];
			vetor [i] = vetor [raiz];
			vetor [raiz] = aux; 
			
			heapSort(vetor, tamanho, raiz);
		}
	}
}