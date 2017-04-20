// Clase Coche realizada el 05/04/2017 por Karlosjp
public class Coche {
	
	// 1. Añadir los atributos de la clase.
	String 	matricula, 
			marca, 
			modelo, 
			color;
	double 	precio,
			peso;
	int 	cilindrada,
			plazas;
	char 	combustible;
	boolean	itv;
	
	// 2. Metodo/s constructor/es.
	
	public Coche(String matricula, String marca, String modelo, String color, double precio, double peso,
			int cilindrada, int plazas, char combustible, boolean itv) {
		//super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.cilindrada = cilindrada;
		this.plazas = plazas;
		this.combustible = combustible;
		this.itv = itv;
	}

	public Coche(String marca, String modelo, double precio, int plazas, char combustible, boolean itv) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.plazas = plazas;
		this.combustible = combustible;
		this.itv = itv;
	}
	
	// 3. Crear metodos GET y SET.
	// GET nos devuelve el valor de un atributo.
	// SET nos cambia el valor de un atributo.
	
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	

	public char getCombustible() {
		return combustible;
	}

	public void setCombustible(char combustible) {
		this.combustible = combustible;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {

		this.itv = itv;
	}

	//4. Crear método toString
	
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", color=" + color + ", precio="
				+ precio + ", peso=" + peso + ", cilindrada=" + cilindrada
				+ ", plazas=" + plazas + ", combustible=" + combustible
				+ ", itv=" + itv + "]";
	}

	
	
