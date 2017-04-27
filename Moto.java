//0. Crear clase
//1. Atributos
//2. Constructores
//3.get de set
//4. to string
public class Moto extends Vehiculo {
//1. Crear atributos
	
	char tipo;
			
	int ano,
		rueda,
		plazas;
	
	double capacidad,
			deposito;
	
	boolean proteccion,
			pata;

	public Moto(String matricula, String marca, String modelo, int cilindrada,
			boolean itv, char tipo, int ano, int rueda, int plazas,
			double capacidad, double deposito, boolean proteccion, boolean pata) {
		super(matricula, marca, modelo, cilindrada, itv);
		this.tipo = tipo;
		this.ano = ano;
		this.rueda = rueda;
		this.plazas = plazas;
		this.capacidad = capacidad;
		this.deposito = deposito;
		this.proteccion = proteccion;
		this.pata = pata;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getRueda() {
		return rueda;
	}

	public void setRueda(int rueda) {
		this.rueda = rueda;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public boolean isProteccion() {
		return proteccion;
	}

	public void setProteccion(boolean proteccion) {
		this.proteccion = proteccion;
	}

	public boolean isPata() {
		return pata;
	}

	public void setPata(boolean pata) {
		this.pata = pata;
	}

	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", itv=" + itv + ", tipo=" + tipo + ", ano=" + ano
				+ ", rueda=" + rueda + ", plazas=" + plazas + ", capacidad="
				+ capacidad + ", deposito=" + deposito + ", proteccion="
				+ proteccion + ", pata=" + pata + "]";
	}
	
	
	
	
	

}
