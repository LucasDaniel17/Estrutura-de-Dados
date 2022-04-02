package questaoBanco;

public class Principal {

	public static void main(String[] args) {
		CadastrarConta cc = new CadastrarConta();
		
		System.out.println("BEM VINDO AO BANCO!");
		
		cc.adicionarConta();
		cc.listarConta();
		cc.procurarConta();
	}
}