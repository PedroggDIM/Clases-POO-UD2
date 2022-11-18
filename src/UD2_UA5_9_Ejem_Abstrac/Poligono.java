package UD2_UA5_9_Ejem_Abstrac;

// Enunciado: se pretende con abstract un programa que permita calcular 
// el área de cualquier polígono.

public abstract class Poligono {
	
//Pensadas para ser heredadas de ellas y que encapsulan código dirigido.
//Tienen métodos abstactos, que son aquellos que se implentan en los subtipos.
//No se pueden crear instancias de ese tipo (NO SE PUEDEN CREAR OBJETOS DE ESA CLASE)
	
	private int numLados;
	private String color;
	
//Métodos constructores
	public Poligono(int numLados, String color) {
		setNumLados(numLados);
		setColor(color);
	}
    //Este método con el this llama al primer constructor y le pasa valores
	public Poligono() {
		this(0, null);
	}
	
	//Método abstracto (las clases que hereden de Poligono lo deben implementar)
	public abstract double calcularArea();
	
	
	public int getNumLados() {
		return numLados;
	}

	public String getColor() {
		return color;
	}

	protected void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	protected void setColor(String color) {
		this.color = color;
	}	

}
