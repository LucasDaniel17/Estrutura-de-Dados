package palindromo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Basica b = new Basica();
		
		String palavra;			
		
		System.out.print("Digite a palavra que será testada: ");
		palavra = input.next();
		
		b.inverterPalavra(palavra);
	
	}
}