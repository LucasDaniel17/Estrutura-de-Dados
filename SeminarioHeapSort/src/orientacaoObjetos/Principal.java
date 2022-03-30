// COM ORIENTAÇÃO A OBJETOS!!!

package orientacaoObjetos;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random r = new Random();
		int vetor[] = new int[7];
		Servico s = new Servico();
		
		//Números sendo gerados e posicionados no vetor:
		System.out.print("Números aleatórios(desordenados): ");
		for (int i = 0; i < vetor.length; i++) {
			int numero = r.nextInt(15);
			vetor[i] = numero;
			System.out.print(vetor[i] + " ");
		}
		//HeapSort
		int tamanho = vetor.length;
		
		//Criar heap a partir do dados:
		for (int i = (tamanho-1)/2; i >= 0; i--) {
			s.heapSort(vetor, tamanho, i);
		}
		
		for (int d = tamanho-1; d > 0; d--) {
			//Pegar o maior elemento do heap e colocar 
			//na posição correspondente no array:
			int aux = vetor[0];
			vetor [0] = vetor [d];
			vetor [d] = aux; 
			//Reconstruir o heap:
			s.heapSort(vetor, d, 0);
		}
		System.out.print("\n\nOrdenado: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}