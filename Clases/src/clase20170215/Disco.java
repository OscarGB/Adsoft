package clase20170215;

public class Disco extends Abstracta {
	private String group;
	private int numCanciones;
	private Cancion[] songs;
	private int actual = 0;
	
	public Disco(String name, String group, int year, int numCanciones){
		this.title = name;
		this.group = group;
		this.year = year;
		this.numCanciones = numCanciones;
		this.songs = new Cancion[this.numCanciones];
	}
	
	public void addCancion(String title, double duration){
		//Deberiamos poner un if actual == numCanciones
		this.songs[this.actual++] = new Cancion(title, duration, this.year);
	}
	
	public void addCancion(String title, double duration, int year){
		//Deberiamos poner un if actual == numCanciones
		this.songs[this.actual++] = new Cancion(title, duration, year);
	}
	
	@Override
	public String toString (){
		return this.title + " [" + this.group + "] " + this.year + " " + this.songs.toString(); 
	}
}
