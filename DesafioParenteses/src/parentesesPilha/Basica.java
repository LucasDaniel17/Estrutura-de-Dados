package parentesesPilha;

import java.util.LinkedList;

public class Basica {

	LinkedList<Character> pilha = new LinkedList<Character>();
	int cont = 0;
	String p;
	int cont1, cont2 = 0;

	public void conferir(String exp) {

		if (cont < exp.length()) {
			pilha.add(exp.charAt(cont));
			cont++;

			conferir(exp);
		} else {
			while (!pilha.isEmpty()) {
				p = Character.toString(pilha.removeLast());

				if (p.equals("(")) {
					cont1++;
				}
				if (p.equals(")")) {
					cont2++;
				}
			}
		}

		if (cont1 == cont2) {
			System.out.println("Quantidade igual");
		} else {
			System.out.println("Quantidade diferente");
		}
	}
}