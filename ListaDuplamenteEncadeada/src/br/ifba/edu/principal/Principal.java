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
		lista.adicionaNoComeco("Jos�");
		lista.adicionaNoComeco("Camila");
		lista.adicionaNoComeco("Helena");		
		System.out.println("Add no come�o: " + lista.toString()); 
		
		lista.adicionaNoFim("Lucas");
		lista.adicionaNoFim("Jac�");
		lista.adicionaNoFim("Levi");
		lista.adicionaNoFim("Miguel");
		lista.adicionaNoFim("Mario");
		lista.adicionaNoFim("Cirilo");
		lista.adicionaNoFim("Gabriel");		
		System.out.println("\nAdd no final: " + lista.toString());				
		
		lista.adicionarNaPosicao(3, "teste");				
		System.out.println("\nAdd na posi��o: " + lista.toString());
		
		lista.RemoverPrimeira();
		System.out.println("\nRemovendo na primeira: " + lista.toString());
		// JOptionPane.showMessageDialog(null, lista.toString());
		
		lista.RemoverUltima();
		System.out.println("\nRemovendo na ultima: " + lista.toString());
		
		lista.RemoverNaPosicao(2);
		System.out.println("\nRemovendo na posi��o: " + lista.toString());
	}	
}