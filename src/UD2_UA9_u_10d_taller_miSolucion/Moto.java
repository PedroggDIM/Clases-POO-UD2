package UD2_UA9_u_10d_taller_miSolucion;

public class Moto extends VehiculoConRuedas {

	private String matricula;

	public Moto(String marca, String modelo, String color) {
		super(marca, modelo, color);

	}

	public String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

}
