package br.ifba.edu.principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
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
		
		lista.adicionarNaPosicao(4, "teste");				
		System.out.println("\n" + lista.toString());
		
		lista.RemoverPrimeira();
		System.out.println("\n" + lista.toString());
		JOptionPane.showMessageDialog(null, lista.toString());
		
		lista.RemoverUltima();
		System.out.println("\n" + lista.toString());
		
		lista.RemoverNaPosicao(1);
		System.out.println("\n" + lista.toString());				
	}	
}