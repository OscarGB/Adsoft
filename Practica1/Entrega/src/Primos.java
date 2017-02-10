/**
* Esta aplicación comprueba si los primos pasados como argumento son primos
*
* @author Óscar Gómez Borzdynski, José Ignacio Gómez García 
*
*/

public class Primos {

	/**
	* Punto de entrada a la aplicación.
	*
	* Este método imprime si los números pasados como argumento son primos
	*
	* @param args Los argumentos de la línea de comando. Se esperan varios números
	*/
	public static void main(String[] args) {
		if (args.length<1) {
			System.out.println("Se espera al menos un numero como parametro.");
			return;
		}
		for(String s : args){
			int x = Integer.parseInt(s);  // una variable int, que convierte arg a numerico
			if(esPrimo(x)){
				System.out.println("El número " + x + " es primo");
			}
			else{
				System.out.println("El número " + x + " no es primo");
			}
		}
	}

	/**
	* Este método comprueba si un número es primo
	*
	* @param x, un entero a comprobar
	*
	* @return boolean, true si es primo, false si no lo es
	*/
	public static boolean esPrimo(int x){

		for(int i = 2; i < x; i++) {
        	if(x%i == 0)
            	return false;
    	}
    	return true;
	}
}