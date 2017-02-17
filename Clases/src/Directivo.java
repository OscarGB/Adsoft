
public class Directivo extends Empleado{
	
	private String categoria = "A";
	
	@Override
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println(categoria);
	}
}
