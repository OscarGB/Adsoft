/**
* Esta aplicación muestra el Triángulo de Tartaglia correspondiente al número de filas pasado como argumento..
*
* @author Estudiante EPS estudiante.eps@uam.es
*
*/

public class Primos {
 /**
* Punto de entrada a la aplicación.
 *
 * Este método imprime el Triángulo de Tartaglia del número de filas que se le pasa como entrada
 *
 * @param args Los argumentos de la línea de comando. Se espera un número como primer parámetro
 */
	public static void main(String[] args) {
		if (args.length<1) {
			System.out.println("Introduce los numeros que quieras estudiar.");
			return;
		}

		for (String x : args) {
			int numero = Integer.parseInt(x);
			if (primo(numero) == true){
				System.out.println("El numero " + numero + " es primo.");
			}
			else {
				System.out.println("El numero " + numero + " no es primo.");
			}
		}
	}

	public static boolean primo(int p) {
		if (p < 2) return false;

		if(factorial(p-1) % p == (p-1)){
			return true;
		}

		else{
			return false;
		}
	}

	public static long factorial(int x){
		int i;
		long res = 1;

		if(x == 1) return 1;

		for (i = x; i > 1; i--){
			res *= i;
		}

		return res;
	}
}