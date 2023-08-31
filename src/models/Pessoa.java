package models;

//import java.util.Date;

public class Pessoa {
	protected String nome;
	protected String cpf;
	// protected String id;
	// protected Date dataNascimento;
	protected String senha;
	protected String endereco;

	public Pessoa() {}
	
	public Pessoa(String cpf) {
		super();
		this.cpf = cpf;
	}

	public Pessoa(String nome, String cpf, String senha, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
