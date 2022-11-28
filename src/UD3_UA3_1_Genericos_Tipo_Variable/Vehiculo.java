package UD3_UA3_1_Genericos_Tipo_Variable;

public class Vehiculo implements Identificable<String> {

	String matricula;

	public String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Vehiculo(String matricula) {
		setMatricula(matricula);
	}

	@Override
	public String getId() {
		return getMatricula();
	}

}