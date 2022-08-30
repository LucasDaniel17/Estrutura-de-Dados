package palindromo;

import java.util.Stack;

public class Basica {	
	Stack <Character> p = new Stack<Character>();	
	StringBuilder verificar = new StringBuilder();			
	
	public void inverterPalavra (String palavra) {
		int t = palavra.length();
		
		for (int i = 0; i < t; i++) {
			p.push(palavra.charAt(i));
		}	
		
		while(!p.isEmpty()) {
			verificar.append(p.pop());
		}		
		this.verificar(palavra);
	}
			
	public void verificar(String palavra) {
		if(palavra.equals(verificar.toString())) {
			System.out.println("É palindromo!");
		} else {
			System.out.println("Não é palindromo!");
		}
	}	
}