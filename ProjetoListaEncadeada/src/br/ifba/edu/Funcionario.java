package br.ifba.edu;

public class Funcionario {
	String nome, rg, cpf, idade;

	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String rg, String cpf, String idade) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
}