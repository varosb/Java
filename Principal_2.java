
public class Principal_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creando objetos de la clase moto.
		
		Moto moto1 = new Moto(matricula, marca, modelo, tipo, cilindrada, ano, rueda, plazas, capacidad, itv, proteccion, pata);
		Moto moto2 = new Moto(matricula, marca, modelo, tipo, cilindrada, ano, rueda, plazas, capacidad, itv, proteccion, pata);
		Moto moto3 = new Moto(matricula, marca, modelo, tipo, cilindrada, ano, rueda, plazas, capacidad, itv, proteccion, pata);
		// Año de la moto1
		System.out.println(moto1.getAno());
		
		//Cambiando modelo de la moto3
		moto3.setModelo("Senda");
		System.out.println(moto3.getModelo());
		
		//Mostrando info de la moto2
		System.out.println(moto2.toString());
		
	
	}
	
	
}
