package UD2_UA9_u_10d_taller_miSolucion;

public class Moto extends Vehiculo {
	
	private int numPasajeros;
	private int cilindrada;
	
	// constructor
	public Moto(int ruedas, String matricula, String marca, String modelo, int kilometraje, int numPasajeros,
			int cilindrada) {
		super(ruedas, matricula, marca, modelo, kilometraje);
		this.numPasajeros = numPasajeros;
		this.cilindrada = cilindrada;
	}
	
	
	
	public Moto() {
		super();
		
	}

	public Moto(int ruedas, String matricula, String marca, String modelo, int kilometraje) {
		super(ruedas, matricula, marca, modelo, kilometraje);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int getEdad() {		
		return 18;
	}

	

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	protected void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
