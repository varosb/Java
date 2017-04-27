public class ventanaJframe {

	public static void main(String[] args) {

		ventanaJframe ventana = new ventanaJframe("Ventana Creada");
	}

	public ventanaJframe(String titulo) {

		JFrame ventanaM = new JFrame(titulo);

		ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// finaliza el
																// programa
																// cuando se da
																// click en la X
		ventanaM.setSize(290, 150);// configurando tamaño de la ventana
		ventanaM.setVisible(true);// configurando visualización de la ventana
	}
}