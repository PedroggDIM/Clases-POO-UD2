package UD2_UA7_Interfaces_7_ejemplo;

public class Coche extends Vehiculo{
	final static int RUEDAS_DEF = 4;

	String color;
	int numPuertas;
	int motor;
	
	// constructores
	public Coche() {
		this(RUEDAS_DEF);
	}

	public Coche(int numRuedaS) {
		this(numRuedaS, "", 0, 0);
	}
	public Coche(int numRuedaS, String color, int numPuertas, int motor) {
		super(numRuedaS);
		setColor(color);
		setNumPuertas(numPuertas);
		setMotor(motor);
	}	

	//Implemento obligatoriamente el método arancar() con el asistente (me obliga).
		@Override
		public void arrancar() {
			System.out.println("Soy un " + Coche.class.getSimpleName() + " estoy arrancando...");
			
		}
	//Implemento obligatoriamente pagarImpuesto()
		@Override
		public double pagarImpuesto() {
			return Vehiculo.getFactorImpuesto() * motor;
		}
	
    // metodos accesores
	public String getColor() {
		return color;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public int getMotor() {
		return motor;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	protected void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	protected void setMotor(int motor) {
		this.motor = motor;
	}    
}
