package models;

public class Docente extends Pessoa {

	private int registro;
	private Disciplina disciplina = new Disciplina();
	
	

	public Docente(String nome, String cpf, String senha, String endereco, int registro) {
		super(nome, cpf, senha, endereco);
		this.registro = registro;
		// TODO Auto-generated constructor stub
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	

	
}
