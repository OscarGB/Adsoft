package testers;

import console.TextConsole;

/**
 * Clase Tester3
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class Tester3 {

	public static void main(String[] args) {
		TextConsole console = new TextConsole();
		console.addComands("Suma", (a)->{
			if(a.length != 3){
				throw new IllegalArgumentException("Se necesitan dos argumentos para sumar");
			}
			System.out.println(Integer.parseInt(a[1]) + Integer.parseInt(a[2]));
		});
		console.run();
	}

}
