
<<<<<<< HEAD
public class Directivo {

=======
public class Directivo extends Empleado{
	
	private String categoria = "A";
	
	@Override
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println(categoria);
	}
>>>>>>> 42565c6b73a0694a1b6733b78c942b99bdad4efe
}
