import java.time.temporal.Temporal;
import java.util.Set;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creando objetos de la clase coche.
		// NombreClase nombreObjeto. = new NombreClase(...);
		
		Coche cocheAlin = new Coche("1234BC","AUDI","A4",2200,
				true,"negro",25634.89, 2.4,'d',5);
		
		Moto motoAlvaro = new Moto("3456CDB", "Honda", "CVN", 2400, 
				false, 'c', 2015, 2, 2, 22.7, 'g', true, true);
		
		System.out.println(motoAlvaro.toString());
		
	}
	
}