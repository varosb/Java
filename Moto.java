//0. Crear clase
//1. Atributos
//2. Constructores
//3.get de set
//4. to string
public class Moto {
//1. Crear atributos
	
	String  matricula,
			marca,
			modelo;
	
	char tipo;
			
	int cilindrada,
		ano,
		rueda,
		plazas;
	
	double capacidad,
			deposito;
	
	boolean itv,
			proteccion,
			pata;
	//2. Constructores

	public Moto(String matricula, String marca, String modelo, char tipo,
			int cilindrada, int ano, int rueda, int plazas, double capacidad,
			boolean itv, boolean proteccion, boolean pata) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cilindrada = cilindrada;
		this.ano = ano;
		this.rueda = rueda;
		this.plazas = plazas;
		this.capacidad = capacidad;
		this.itv = itv;
		this.proteccion = proteccion;
		this.pata = pata;
	}
	//3 get de set
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
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

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
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
	
	//4.to string
	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", tipo=" + tipo + ", cilindrada="
				+ cilindrada + ", ano=" + ano + ", rueda=" + rueda
				+ ", plazas=" + plazas + ", capacidad=" + capacidad + ", itv="
				+ itv + ", proteccion=" + proteccion + ", pata=" + pata + "]";
	}
	

	//5.Creacion manual de métodos
	
		// Método que añade un 21% de IVA al precio del coche
		
		public double precioMoto () {
			double precioMoto = 0;
					precioTotal = precio * 1.21;
					return precioTotal;
			
		}
	}
	
	

}
