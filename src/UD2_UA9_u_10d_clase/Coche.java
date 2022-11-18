package UD2_UA9_u_10d_clase;

public class Coche extends Vehiculo{
	
	private int numPasajeros;

	public int getNumPasajeros() {
		return numPasajeros;
	}

	protected void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public Coche(int ruedas, String matricula, String tipoCarnet, Modelo modelo, int numPasajeros) {
		super(ruedas, matricula, tipoCarnet, modelo);
		setNumPasajeros(numPasajeros);
	}
	
	public Coche() {
		this(4, "", "B", null, 5);
	}
	

	

	@Override
	public int getEdad() {
		return 18;
	}
	

}
