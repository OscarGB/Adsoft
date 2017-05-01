package console;

import java.util.*;

import interfaces.Function;

/**
 * Clase TextConsole
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class TextConsole {
	
	/**
	 * Map con los comandos que se podrán ejecutar
	 */
	HashMap<String, Function> commands = new HashMap<String, Function>();
	
	/**
	 * Método principal, ejecuta la consola
	 */
	public void run(){
		 Scanner scanner = new Scanner(System.in);
		 while(true){
			 String input = scanner.nextLine();
			 if(input.equals("")){
				 scanner.close();
				 return;
			 }
			 String parsed[] = input.split(" ");
			 Function f = commands.get(parsed[0]);
			 if(f == null){
				 System.out.println("El comando " + parsed[0] + " no existe. Los comandos disponibles son:");
				 System.out.println(commands.keySet());
			 }
			 else{
				 try{
					 f.execute(parsed);
				 }catch(IllegalArgumentException e){
					 System.out.println(e.getMessage());
				 }
			 }
		 }
	}
	
	/**
	 * Método que añade una función a la consola
	 * @param name
	 * @param op
	 */
	public void addComands(String name, Function op){
		commands.put(name, op);
	}
}
