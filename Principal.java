import java.time.temporal.Temporal;
import java.util.Set;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creando objetos de la clase coche.
		// NombreClase nombreObjeto. = new NombreClase(...);
		
		Coche a1 = new Coche("4279dhd", "Audi", 4000, 5, 'd', true);
		Coche a2 = new Coche("4279DHD", "Audi", "A3", "Negro", 4000, 1200.50, 1900, 5, 'd', true);
		Coche a3 = new Coche("1234DJL", "Volvo", "S60", "Rosita", 2500.24, 1.6, 2500, 5, 'g', false);
		Coche a4 = new Coche("1534DJL", "Audi", "S60", "Rosita", 2500.24, 1.21, 2300, 5, 'g', false);
		Coche a5 = new Coche("1634JDK", "Opel", "Saxo", "Verde", 432.62, 1200, 1100, 5, 'd', true);
		
		System.out.println(a1.precioConIVA());
		
		System.out.println(a2.getColor());
		a2.setColor("azul marino");
		System.out.println(a2.getColor());
		
		a3.setCombustible('d');
		System.out.println("El combustible de a3 es : "+a3.getCombustible());
		
		System.out.println(a3.toString());
		
				
	}

}
