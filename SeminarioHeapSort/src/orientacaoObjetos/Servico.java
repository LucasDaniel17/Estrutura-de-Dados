package orientacaoObjetos;

public class Servico {
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
