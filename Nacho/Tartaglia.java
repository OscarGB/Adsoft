/**
* Esta aplicación muestra el Triángulo de Tartaglia correspondiente al número de filas pasado como argumento..
*
* @author Estudiante EPS estudiante.eps@uam.es
*
*/

public class Tartaglia {
 /**
* Punto de entrada a la aplicación.
 *
 * Este método imprime el Triángulo de Tartaglia del número de filas que se le pasa como entrada
 *
 * @param args Los argumentos de la línea de comando. Se espera un número como primer parámetro
 */
	public static void main(String[] args) {
		if (args.length<1) {
			System.out.println("Se espera un numero como parametro.");
			return;
		}
		
		String arg = args[0]; // una variable String que obtiene el primer parametro
		int filas = Integer.parseInt(arg); // una variable int, que convierte arg a numerico
		int i, j;		
		int [][] tartaglia = new int[filas][];



		for (i = 0; i < filas; i++) {
			tartaglia[i] = new int[i+1];

			for (j = 0; j <= i; j++){
				if (j == 0 || j == i){
					tartaglia[i][j] = 1; //Ponemos a uno los elementos de los extremos
				}
				else{
					tartaglia[i][j] = tartaglia[i-1][j] + tartaglia[i-1][j-1]; //Vamos rellenando los elementos internos
				}

				System.out.print(tartaglia[i][j] + " ");
			}

			System.out.print("\n");

		}


		//System.out.println("El logaritmo de " + arg + " es: " + Math.log(x));
	}
}