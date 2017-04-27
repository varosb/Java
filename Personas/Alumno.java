package Personas;

public class Alumno {
	
	char curso;
	int ano;
	char sexo;
	
	public Alumno(char curso, int ano, char sexo) {
		super();
		this.curso = curso;
		this.ano = ano;
		this.sexo = sexo;
	}

	public char getCurso() {
		return curso;
	}

	public void setCurso(char curso) {
		this.curso = curso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "Alumno [getCurso()=" + getCurso() + ", getAno()=" + getAno()
				+ ", getSexo()=" + getSexo() + ", curso=" + curso + ", ano="
				+ ano + ", sexo=" + sexo + "]";
	}
	
	

}
