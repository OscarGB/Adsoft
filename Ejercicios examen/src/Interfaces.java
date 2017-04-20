import java.util.*;

import Clases.Coches;

public class Interfaces {

	public static void main(String[] args) {
		List<Coches> coches = new ArrayList<Coches>();
		Coches c1 = new Coches("Chevy", 1997, 13000);
		Coches c2 = new Coches("BMW", 2006, 20000);
		Coches c3 = new Coches("Opel", 1990, 5000);
		
		coches.add(c1);
		coches.add(c2);
		coches.add(c3);
		
		System.out.println(coches);
		
		Collections.sort(coches);
		
		System.out.println(coches);

	}

}
