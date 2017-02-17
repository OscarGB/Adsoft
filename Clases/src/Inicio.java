import java.io.IOException;
import java.util.Scanner;

public class Inicio {
	private static Scanner terminalInput;
	private static Persona[] p = new Persona[3];
	
	public static void main(String[] args) throws IOException{
		terminalInput = new Scanner(System.in);

		/*System.out.println("Hola Mundo");
		
		//read input
		String s = terminalInput.nextLine();
		
		System.out.println(s);*/
		
<<<<<<< HEAD
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado();
		Empleado e3 = new Empleado();
		
		for (Persona p : personas):
			p.mostrarDatos();			
		
=======
		p[0] = new Empleado();
		p[1] = new Directivo();
		p[2] = new Persona();
		for( Persona i : p){
			i.mostrarDatos();
		}
		//e1.mostrarDatos();
>>>>>>> 42565c6b73a0694a1b6733b78c942b99bdad4efe
		
	}
}
