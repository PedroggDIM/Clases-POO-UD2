package UD2_UA9_u_10d_taller_solucionProfesor;

public class Moto extends VehiculoConRuedas {

	public Moto(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}
	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}
	@Override
	public void arrancar() {
		System.out.println(getModelo() + "estoy arrancando");
	}

}