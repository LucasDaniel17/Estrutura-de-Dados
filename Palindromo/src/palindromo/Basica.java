package palindromo;

import java.util.Stack;

public class Basica {	
	Stack <Character> p = new Stack<Character>();
	
	public void verificar() {
		System.out.println(p.size());		
	}
	
	public void inserirFim(Character letra) {
		p.push(letra);
	}	
	
	public void removerUltimo() {
		p.pop();
	}
	
	public void mostrar() {
		System.out.println("\n" + p.toString());
	}
	
	public void inverterPalavra (String palavra) {
		int t = palavra.length();
		
		for (int i = t; t > 0; i--) {
			p.push(palavra.charAt(i));
			
			StringBuilder invertida = new StringBuilder();			
			invertida.append(palavra.charAt(i));
		}
	}
}
