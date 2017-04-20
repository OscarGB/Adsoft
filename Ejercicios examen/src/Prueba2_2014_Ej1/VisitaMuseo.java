package Prueba2_2014_Ej1;

public class VisitaMuseo extends Actividad{
	public static final double COSTE_FIJO = 5;
	private TipoVisitaMuseo tipo;
	
	public VisitaMuseo(String descripcion, TipoVisitaMuseo tipo){
		super(descripcion, VisitaMuseo.COSTE_FIJO);
		this.tipo = tipo;
	}
	
	public double extras(){
		if(this.tipo == TipoVisitaMuseo.GUIADA) return 4;
		else if(this.tipo == TipoVisitaMuseo.BILINGUE) return 8;
		else if(this.tipo == TipoVisitaMuseo.ESCOLAR) return -1;
		else return 0;
	}
}
