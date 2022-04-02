package questao2;

public class MainInserirSoma {

	public static void main(String[] args) {
		ServicoIS s = new ServicoIS();	
		
		System.out.println("Seja bem vindo a calculadora de somas!");
		s.inserir();
		s.somar();
	}
}