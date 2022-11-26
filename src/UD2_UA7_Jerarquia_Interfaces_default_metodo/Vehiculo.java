package UD2_UA7_Jerarquia_Interfaces_default_metodo;

//public abstract class Vehiculo implements Arrancable, OtraInterfaz{  puede implementar varias interfaces.
public abstract class Vehiculo implements Arrancable{
	//La abstracta se diferencias de la Interfaz en que si extends de la Interfaz
	// NO está obligada a implementar sus métodos (de la interfaz).
// NO PUEDO INSTANCIAR OBJETOS
// POR SER ABSTRACTA PUEDE TENER MÉTODOS ABSTRACTOS.	
	private final static double FACTOR_IMPUESTO = 0.25;
	private int numRuedas;
	
	// constructores
	public Vehiculo() {

	}

	public Vehiculo(int numRuedas) {
		setNumRuedas(numRuedas);
	}

	public static double getFactorImpuesto() {
		return FACTOR_IMPUESTO;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	protected void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
    // metodo abstracto
	public abstract double pagarImpuesto();
}
