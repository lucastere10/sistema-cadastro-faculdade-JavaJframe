package models;

public class Docente extends Pessoa {

	private int matricula;
	private Disciplina disciplina = new Disciplina();
	
	public Docente(String cpf) {
		super(cpf);
		// TODO Auto-generated constructor stub
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	
}
