
public class Empleado extends Persona {
	private String correo = "Prueba@gmail.com";
	
	@Override
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println(correo);
	}
	
}
