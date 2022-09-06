package recursividadeBinDec;

import java.util.LinkedList;

public class Basica {
		
	double p = 0;	
	double dec;
	int e, exp = 0;
	int num = 0;
	
	LinkedList<Character> pilha = new LinkedList<Character>();
	
	public double converter(String n) {
		
		if (e < n.length()) {
			pilha.add(n.charAt(e));
			e++;
			converter(n);		
		} 
		else {
			while (!pilha.isEmpty()) {
				num = Character.getNumericValue(pilha.removeLast());	
				if (num == 1) {
					p = Math.pow(2, exp) * num;
					dec = dec + p;
				}	
				exp++;
			}	
			System.out.println("Número convertido: " + dec);
		}				
		return dec;
	}
}
