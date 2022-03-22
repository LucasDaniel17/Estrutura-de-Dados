//Classe servi�o de PrincipalRandom.

package acertarNumero;

import java.util.Arrays;

public class RandomMet {
	PrincipalRandom p = new PrincipalRandom();
	
	int array[] = new int [100];
	int aux = 0;
	
	public void entrada (int dgt) {	
			array[aux] = dgt;
			aux++;	
	}
	
	public void validacao (int dgt, int aleatorio) {
			if (dgt < aleatorio) {
				System.out.println("Voc� digitou um n�mero menor");
			} else if (dgt > aleatorio) {
				System.out.println("Voc� digitou um n�mero maior");			
			} else if (dgt == aleatorio) {
				System.out.println("Parab�ns, voc� acertou!");			
			}
	}
	public void tentativas () {
		System.out.println("\n");
		System.out.println("Tentativas: ");
		for (int c = 0; c != aux; c++) {
			System.out.print(array[c] + " - ");
		}
	}
}