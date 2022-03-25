// COM ORIENTAÇÃO A OBJETOS!!!

package orientacaoObjetos;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random r = new Random();
		int vetor[] = new int[7];
		Servico s = new Servico();
		
		System.out.println("ORIENTADO A OBJETO");
		
		System.out.print("\nNúmeros aleatórios(desordenados): ");
		for (int i = 0; i < vetor.length; i++) {
			int numero = r.nextInt(15);
			vetor[i] = numero;
			System.out.print(vetor[i] + " ");
		}
		//HeapSort
		int tamanho = vetor.length;
		
		for (int i = tamanho/2 - 1; i >= 0; i--) {
			s.heapSort(vetor, tamanho, i);
		}
		
		for (int d = tamanho-1; d > 0; d--) {
			int aux = vetor[0];
			vetor [0] = vetor [d];
			vetor [d] = aux; 
			
			s.heapSort(vetor, d, 0);
		}
		System.out.print("\n\nOrdenado: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}