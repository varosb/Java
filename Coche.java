// Clase Coche realizada el 05/04/2017 por Karlosjp
public class Coche extends Vehiculo {
	
	// 1. Añadir los atributos de la clase.
	String  color;
	double 	precio;
	double  peso;
	char 	combustible;
	int 	plazas;
	
	public Coche(String matricula, String marca, String modelo, int cilindrada,
			boolean itv, String color, double precio, double peso,
			char combustible, int plazas) {
		super(matricula, marca, modelo, cilindrada, itv);
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.combustible = combustible;
		this.plazas = plazas;
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

	public char getCombustible() {
		return combustible;
	}

	public void setCombustible(char combustible) {
		this.combustible = combustible;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", itv=" + itv + ", color=" + color + ", precio=" + precio
				+ ", peso=" + peso + ", combustible=" + combustible
				+ ", plazas=" + plazas + "]";
	}
	
	
	


}

	
	
