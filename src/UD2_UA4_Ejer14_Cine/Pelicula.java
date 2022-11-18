package UD2_UA4_Ejer14_Cine;

import java.time.Duration;


public class Pelicula {
	
     private String titulo;  
     private int duracion;
     private int edadMinima;
     private String director;
     
		// Constructor
		public Pelicula(String titulo, int duracion, int edadMinima, String director) {
			setTitulo(titulo);
			setDuracion(duracion);
			setEdadMinima(edadMinima);
			setDirector(director);
		}
     
  //Métodos de acceso   
	public String getTitulo() {
		return titulo;
	}
	
	public int getDuracion() {
		return duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public String getDirector() {
		return director;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	protected void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	protected void setDirector(String director) {
		this.director = director;
	}
 //Método toString()

	@Override
	public String toString() {
		return "Título=" + titulo + ", duración=" + duracion + ", edadMinima=" + edadMinima + ", director="	+ director;
	}    
     
}
