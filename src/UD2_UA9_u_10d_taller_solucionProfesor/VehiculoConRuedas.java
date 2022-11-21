package UD2_UA9_u_10d_taller_solucionProfesor;

public abstract class VehiculoConRuedas extends Vehiculo implements Arrancable{
	
	public abstract int getNumeroDeRuedas();

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}

}
