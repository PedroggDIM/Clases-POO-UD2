package UD2_UA3_Clases;
import java.util.Objects;

public class Coche {
	int numRuedas = 4; // sin modificador de acceso se accede desde la clase y desde el paquete.
	private String bastidor;
	protected boolean necesitaCarne;
	public String observaciones;
	protected static String color;

//Método Constructor sin parámetros (por defecto)
	public Coche() {
	}

//Constructor con parámetros.
	public Coche(int numRuedas, String bastidor, boolean necesitaCarne, String observaciones, String color) {
		// dos formas.
		this.numRuedas = numRuedas; // setNumRuedas(numRuedas);
		this.bastidor = bastidor; // setBastidor(bastidor);
		this.necesitaCarne = necesitaCarne; // setnecesitaCarne(necesitaCarne);
		this.observaciones = observaciones; // setobservaciones(observaciones);
		this.color = color; // setcolor(color),
	}

//Constructor con 2 parámetros (sobrecarga de constructores).	
	public Coche(int numRuedas, String bastidor) {
		this(numRuedas, bastidor, false, "", "sin color");
	}

//Métodos getter para acceder a los atributos.	
	public int getNumRuedas() {
		return numRuedas;
	}

//Los setters son void no devuelven nada; inician por set 
//El profesor por defecto los pone protected
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public String getBastidor() {
		return bastidor;
	}

//this se refiere al bastidor de arriba, al de la clase.
//el otro es el que se pasa por parámetro.
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

//Los boolean por convenio es un getter con un return.	
	public boolean isNecesitaCarne() {
		return necesitaCarne;
	}

	public void setNecesitaCarne(boolean necesitaCarne) {
		this.necesitaCarne = necesitaCarne;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Coche.color = color;
	}

//Método toString()
	@Override
	public String toString() {
		return "Coche [getNumRuedas()=" + getNumRuedas() + ", getBastidor()=" + getBastidor() + ", isNecesitaCarne()="
				+ isNecesitaCarne() + ", getObservaciones()=" + getObservaciones() + "]";
	}

	// equals
	// Va comparando el objeto en el que estoy (this que es el que yo instancio) al
	// objeto que yo le paso por parámetro
	// los atributos que quiero comparar están en el return y hay comparo lo que me
	// interese.

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(bastidor, other.bastidor) && necesitaCarne == other.necesitaCarne
				&& numRuedas == other.numRuedas && Objects.equals(observaciones, other.observaciones);
	}

}


