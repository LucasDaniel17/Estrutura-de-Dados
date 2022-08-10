package br.edu.ifba.principal;

import java.util.Scanner;
import br.edu.ifba.basica.Contato;
import br.edu.ifba.linked.Ligada;

public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Ligada lista = new Ligada();
		Contato c1 = new Contato("Fulano", "123");
		Contato c2 = new Contato("Pedro", "321");
		Contato c3 = new Contato("Lucas", "987");
		Contato c4 = new Contato("Daniel", "456");
		Contato c5 = new Contato("João", "876");
		Contato c6 = new Contato("Maria", "159");
		Contato c7 = new Contato("Mateus", "753");
		
		lista.adicionarNoInicio(c1);
		lista.adicionarNoInicio(c2);
		lista.adicionarNoInicio(c3);
		lista.imprimir();
		
		lista.adicionarNoFinal(c4);
		lista.adicionarNoFinal(c5);
		lista.adicionarNoInicio(c6);
		lista.imprimir();
		
		lista.adicionarPorPosicao(2, c7);
		lista.imprimir();
		
		lista.removerNoInicio();
		lista.imprimir();
		
		lista.removerNoFinal();
		lista.imprimir();
		
		lista.removerPorPosicao(3);
		lista.imprimir();
	}
}