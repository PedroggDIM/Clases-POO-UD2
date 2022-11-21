package UD2_UA9_u_10d_taller_miSolucion;

public abstract class VehiculoConRuedas extends Vehiculo implements Arrancable{
	
	public abstract int getNumeroDeRuedas();
	
	public VehiculoConRuedas(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}

	@Override
	public String toString() {
		return "VehiculoConRuedas [getNumeroDeRuedas()=" + getNumeroDeRuedas() + " ruedas";
	}	
	
}
