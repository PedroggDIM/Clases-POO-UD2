package UD2_UA5_9_Ejem_Abstrac;

public class Triangulo extends Poligono {
	
	private double base;
	private double altura;
//Constructor 	
	public Triangulo(String color, double base, double altura) {
		super(3, color);  //llama al constructor padre
		setBase(base);
		setAltura(altura);

	}
	
	public Triangulo(String color) {
		this(color, 0, 0); // llama al constructor padre
		                // base = 0   altura = 0
	}
    // establece el número de lados en 3
	public Triangulo() {
		setNumLados(3);
	}
//Método abstracto que se sobreescribe
	@Override
	public double calcularArea() {
		return getBase() * getAltura() / 2;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	protected void setBase(double base) {
		this.base = base;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}	

}
