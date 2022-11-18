package UD2_UA7_Interfaces_7_ejemplo;

public class Moto extends Vehiculo {

	private final static int RUEDAS_DEF = 2;

	private double cilindrada;
	private boolean carenado;
	
	// constructores
	public Moto() {
		this(RUEDAS_DEF);
	}
	public Moto(int numRuedas) {
		this(numRuedas, 0, false);
	}	
	public Moto(int numRuedas, double cilindrada, boolean carenado) {
		super(numRuedas);
		setCilindrada(cilindrada);
		setCarenado(carenado);
	}
	
	//Implemento obligatoriamente pagarImpuesto()
	@Override
	public double pagarImpuesto() {
		return carenado ? cilindrada * Vehiculo.getFactorImpuesto() + 12.33 : cilindrada * Vehiculo.getFactorImpuesto();
	}
    //Implemento obligatoriamente el método arancar() con el asistente (me obliga).
	@Override
	public void arrancar() {
		System.out.println("Soy una " + Moto.class.getSimpleName() + " estoy arrancando...");
	}
	public static int getRuedasDef() {
		return RUEDAS_DEF;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public boolean isCarenado() {
		return carenado;
	}
	protected void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	protected void setCarenado(boolean carenado) {
		this.carenado = carenado;
	}
}