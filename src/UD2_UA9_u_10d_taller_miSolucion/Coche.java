package UD2_UA9_u_10d_taller_miSolucion;

public class Coche extends VehiculoConRuedas {

	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Coche(String marca, String modelo, String color, String matricula) {
		super(marca, modelo, color);
		this.matricula = matricula;
	}

	@Override
	public int getNumeroDeRuedas() {
		return 4;
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("El vehiculo matrícula " + getMatricula() + " arrancado");
	}

}
