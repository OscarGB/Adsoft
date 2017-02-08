import java.io.IOException;
import java.util.Scanner;

public class Inicio {
	private static Scanner terminalInput;

	public static void main(String[] args) throws IOException{
		terminalInput = new Scanner(System.in);

		/*System.out.println("Hola Mundo");
		
		//read input
		String s = terminalInput.nextLine();
		
		System.out.println(s);*/
		
		Empleado e1 = new Empleado();
		
		e1.mostrarDatos();
		
	}
}
