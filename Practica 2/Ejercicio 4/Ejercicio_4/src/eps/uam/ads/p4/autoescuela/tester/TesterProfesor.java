package eps.uam.ads.p4.autoescuela.tester;

import eps.uam.ads.p4.autoescuela.profesor.Profesor;
import eps.uam.ads.p4.autoescuela.autoescuela.Autoescuela;
import eps.uam.ads.p4.autoescuela.alumnos.Fecha;


/**
 * Tester del cuarto apartado de la P2
 * 
 * @author José Ignacio Gómez García, Óscar Gómez Borzdynski
 *
 */
public class TesterProfesor {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("Antonio", "Pérez García", new Autoescuela("Arenal"), new Fecha(2, 4, 2004), new Fecha(4, 10, 2009));
		System.out.println(p1);

	}

}
