package recursividade;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Recursao r = new Recursao();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número que deseja: ");
		r.contar(input.nextInt());
	}
}
