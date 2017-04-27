package Personas;

public class Profesor extends Persona {
	
	double sueldo;
	int ano;
	boolean esFijo;
	
	public Profesor(String dni, String nombre, String apellido1,
			String apellido2, double sueldo, int ano, boolean esFijo) {
		super(dni, nombre, apellido1, apellido2);
		this.sueldo = sueldo;
		this.ano = ano;
		this.esFijo = esFijo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isEsFijo() {
		return esFijo;
	}

	public void setEsFijo(boolean esFijo) {
		this.esFijo = esFijo;
	}

	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellido1="
				+ apellido1 + ", apellido2=" + apellido2 + ", sueldo=" + sueldo
				+ ", ano=" + ano + ", esFijo=" + esFijo + "]";
	}
	
	
	

}
