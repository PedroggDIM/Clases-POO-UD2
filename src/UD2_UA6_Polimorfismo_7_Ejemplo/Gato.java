package UD2_UA6_Polimorfismo_7_Ejemplo;

public class Gato extends Animal {

	private int edad;

	//constructores	
	public Gato(int edad) {
		super(4);     //llama al constructor suplerclase
		              // y establece 4 patas por defecto.
		setEdad(edad);
	}
	// constructor establece edad por defecto en 5 anios
	public Gato() {
		this(5);
	}
	// constructor con atributo de la clase padre y propio
	public Gato(int numPatas, int edad) {
		super(numPatas);
		setEdad(edad);
	}
//Sobreescribo el método de la superclase y añado mi funcionalidad
	@Override
	public void ruidoHago() {
		System.out.println("hago miau como gato");

	}
	
	// metodos accesores
	public int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}	
}
