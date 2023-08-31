package models;

public class Disciplina {
	private String materia;
	private String curso;
	private int cargaHoraria;
	
	public Disciplina() {} //construtor
	
	public Disciplina(String materia, String curso, int cargaHoraria) {
		super();
		this.materia = materia;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
