package UD2_UA9_u_10d_clase;

import javax.management.modelmbean.ModelMBeanOperationInfo;

// vehiculo no voy a sacar entidades, esa es una pista para hacerla abstract
public abstract class Vehiculo {

	private int ruedas;
	private String matricula;
	private String tipoCarnet;
	private Modelo modelo;

	// GETTERS
	public int getRueda() {
		return ruedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTipoCarnet() {
		return tipoCarnet;
	}

	public Modelo getModelo() {
		return modelo;
	}

	// SETTERS
	protected void setRueda(int ruedas) {
		this.ruedas = ruedas;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}

	protected void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	// CONSTRUCTORES
	public Vehiculo(int ruedas, String matricula, String tipoCarnet, Modelo modelo) {
		this.ruedas = ruedas;
		this.matricula = matricula;
		this.tipoCarnet = tipoCarnet;
		this.modelo = modelo;
	}

	public Vehiculo() {
	}
	
	

	public abstract int getEdad();

}
