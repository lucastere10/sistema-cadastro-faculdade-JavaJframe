package models;

import java.util.ArrayList;

public class Turma {
	private String turma;
	private ArrayList<Aluno> listaDeAlunos;
	private Docente responsavel;
	private Disciplina disciplina;
	
	public void adicionarAluno(Aluno aluno) {
		boolean existeAluno = false;
		
		for (Aluno al : listaDeAlunos) {
			if (al.getCpf() == aluno.getCpf()) {
				existeAluno = true;
				System.out.println("Aluno já cadastrado");
				break;
			}
		}
		
		if (!existeAluno)
			listaDeAlunos.add(aluno);		
	}
	
	
	
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public ArrayList<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}
	public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}
	public Docente getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Docente responsavel) {
		this.responsavel = responsavel;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	

	
	
	
}
