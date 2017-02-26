package eps.uam.ads.p4.autoescuela.tester;

import eps.uam.ads.p4.autoescuela.profesor.Profesor;
import eps.uam.ads.p4.autoescuela.autoescuela.Autoescuela;
import eps.uam.ads.p4.autoescuela.alumnos.Fecha;


/**
 * Tester del cuarto apartado de la P2
 * 
 * @author Jos� Ignacio G�mez Garc�a, �scar G�mez Borzdynski
 *
 */
public class TesterProfesor {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("Antonio", "P�rez Garc�a", new Autoescuela("Arenal"), new Fecha(2, 4, 2004), new Fecha(4, 10, 2009));
		System.out.println(p1);

	}

}
