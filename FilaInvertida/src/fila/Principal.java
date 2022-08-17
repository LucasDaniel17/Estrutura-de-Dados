package fila;

public class Principal {
	public static void main(String[] args) {
		Linked linked = new Linked();
	
		Contato c1 = new Contato("Fulano", "123");
		Contato c2 = new Contato("Pedro", "321");
		Contato c3 = new Contato("Lucas", "987");
	
		linked.inserir(c1);
		linked.inserir(c2);
		linked.inserir(c3);
		
		linked.mostrar();
		
		linked.inverter();
		
		linked.mostrar();
	}
}
