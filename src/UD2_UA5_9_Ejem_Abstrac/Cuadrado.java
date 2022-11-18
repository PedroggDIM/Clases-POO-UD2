package UD2_UA5_9_Ejem_Abstrac;

public class Cuadrado extends Poligono {

	private double lado;
	
//Constructores	
	public Cuadrado(String color, double lado) {
		super(4, color); // Llama al constructor de la clase padre
		                 // establece por defecto 4 lados.
		setLado(lado);
	}
	public Cuadrado(String color) {
		super(4, color); // llama al constructor de la clase padre

	}
	public Cuadrado() {
		setNumLados(4); //consturctor propio
	}
 //Al heredar de Polígono sobreescribo el método abstracto.
	@Override
	public double calcularArea() {
		return Math.pow(getLado(), 2);
		// return getLado()*getLado();
	}

	protected void setLado(double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}

}
