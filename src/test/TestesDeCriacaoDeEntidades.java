package test;

import models.*;

public class TestesDeCriacaoDeEntidades {

	public static void main(String[] args) {
		System.out.println("Criar Pessoa:");
		criarPessoaTeste();
		System.out.println("\nCriar Aluno:");
		criarAlunoTeste();
		System.out.println("\nCriar Professor:");
		criarProfessorTeste();
		System.out.println("\nCriar Disciplina:");
		criarDisciplinaTeste();
		
	}
	
	public static void criarPessoaTeste() {
		Pessoa novaPessoa = new Pessoa("Nome Teste",
				"123.456.789-01",
				"teste123",
				"Rua das Flores, 123");	
		System.out.println(novaPessoa.getNome());
		System.out.println(novaPessoa.getCpf());
		System.out.println(novaPessoa.getSenha());
		System.out.println(novaPessoa.getEndereco());
	}
	
	public static void criarAlunoTeste() {
		Aluno novoAluno= new Aluno("AL Nome Aluno Teste",
				"AL 123.456.789-01",
				"AL teste123",
				"AL Rua das Flores, 123",
				123456874);	
		System.out.println(novoAluno.getNome());
		System.out.println(novoAluno.getCpf());
		System.out.println(novoAluno.getSenha());
		System.out.println(novoAluno.getEndereco());	
		System.out.println(novoAluno.getMatricula());	
		
	}
	
	public static void criarProfessorTeste() {
		Docente novoDocente= new Docente("Nome Professor",
				"987654321-98",
				"teste123",
				"Rua Professor, 321",
				23432132);
		System.out.println(novoDocente.getNome());
		System.out.println(novoDocente.getCpf());
		System.out.println(novoDocente.getSenha());
		System.out.println(novoDocente.getEndereco());	
		System.out.println(novoDocente.getRegistro());	
		
	}
	
	public static void criarDisciplinaTeste() {
		Disciplina novaDisciplina = new Disciplina("Programação Orientada a Objeto",
				"Programação",
				60);
		System.out.println(novaDisciplina.getMateria());
		System.out.println(novaDisciplina.getCurso());
		System.out.println(novaDisciplina.getCargaHoraria());
	}
	
	
}
