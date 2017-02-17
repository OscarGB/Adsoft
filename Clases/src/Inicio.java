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
		Empleado e2 = new Empleado();
		Empleado e3 = new Empleado();
		
		for (Persona p : personas):
			p.mostrarDatos();			
		
		
	}
}
