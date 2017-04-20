
public class ArrayNumerico {
	public static void main(String[] args) {

		//Array numerico entero Bi-dimensional
		int[][] numeros = {	{0,1,2,3},
							{4,5,6,7},
							{8,9,0,1},
							{2,3,4,5},
							{6,7,8,9}
		};
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		//Array caracteres entero Bi-dimensional
		char [][] letras = { {'a','b','c','d','e','f'},
							 {'g','h','i','j','k','l'},
							 {'a','b','c','d','e','f'},
							 {'g','h','i','j','k','l'}
		};
		
		for (int i = 0; i < letras.length; i++) {
			for (int j = 0; j < letras[i].length; j++) {
				System.out.print(letras[i][j] + "\t");
			}
			
			System.out.println();
		}
		
	}

}
