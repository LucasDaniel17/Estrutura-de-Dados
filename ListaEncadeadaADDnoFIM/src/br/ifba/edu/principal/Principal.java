package br.ifba.edu.principal;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		
		Lista lista = new Lista();

		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Maria");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("Beltrano");
		lista.adicionaNoComeco("José");
		lista.adicionaNoComeco("Camila");
		lista.adicionaNoComeco("Helena");
		
		System.out.println(lista.toString());
		
		lista.adicionaNoFim("Lucas");
		lista.adicionaNoFim("Jacó");
		lista.adicionaNoFim("Levi");
		lista.adicionaNoFim("Miguel");
		lista.adicionaNoFim("Mario");
		lista.adicionaNoFim("Cirilo");
		lista.adicionaNoFim("Gabriel");
		
		System.out.println("\n" + lista.toString());
	}	
}