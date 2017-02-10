/**
* Esta aplicación calcula el triángulo de Tartaglia de tamañano igual al parametro introducido.
*
* @author Óscar Gómez Borzdynski, José Ignacio Gómez García
*
*/

public class Tartaglia {
	/**
	* Punto de entrada a la aplicación.
	*
	* Este método imprime el triángulo de Tartaglia de tamañano igual al parametro introducido.
	*
	* @param args Los argumentos de la línea de comando. Se espera un número positivo como primer parámetro
	*/
	public static void main(String[] args) {
		if (args.length<1) {
			System.out.println("Se espera un numero como parametro.");
			return;
		}
		String arg = args[0];  // una variable String que obtiene el primer parametro
		int x = Integer.parseInt(arg);  // una variable int, que convierte arg a numerico

		if(x < 0){
			System.out.println("El número debe ser mayor que 0");
		}

		x++; //Para poder empezar en el nivel correcto

		int[][] tartaglia = new int[x][]; // declarar el array bidimensional de enteros
		tartaglia[0] = new int[1];
		tartaglia[0][0] = 1; //Primer nivel de Tartaglia

		for (int i = 1; i < x; i++){
			tartaglia[i] = new int[i+1];
			for (int j = 0; j <= i; j++){
				if(j == 0 || j == i){
					tartaglia[i][j] = 1; //Bordes exteriores
				}else{
					tartaglia[i][j] = tartaglia[i-1][j] + tartaglia[i-1][j-1]; //Internos
				}
			}
		}

		for ( int[] a : tartaglia){
			for ( int b : a){
				System.out.print(b + " "); //Imprimir elementos
				
			}
			System.out.print("\n");
		}
	}
}