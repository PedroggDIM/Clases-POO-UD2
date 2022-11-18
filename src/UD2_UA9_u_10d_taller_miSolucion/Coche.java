package UD2_UA9_u_10d_taller_miSolucion;

public class Coche extends Vehiculo{

	private int numPasajeros;
	
	
	// constructores
	public Coche(int ruedas, String matricula, String marca, String modelo, int kilometraje, int numPasajeros) {
		super(ruedas, matricula, marca, modelo, kilometraje);
		this.numPasajeros = numPasajeros;
	}	

	public Coche(int ruedas, String matricula, String marca, String modelo, int kilometraje) {
		super(ruedas, matricula, marca, modelo, kilometraje);
	}

	@Override
	public int getEdad() {		
		return 18;
	}	

	
	public int getNumPasajeros() {
		return numPasajeros;
	}

	protected void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

}
