package UD2_UA5_8_Ejem_Herencia;

public class Vehiculo {

	int numeroRuedas;
	private String marca;
	protected String color;
	
   //Métodos constructores	
	public Vehiculo() {
	}

	public Vehiculo(int numeroRuedas, String marca, String color) {
		setMarca(marca);    //this.numeroRuedas = numeroRuedas;
		setColor(color);
		setNumeroRuedas(numeroRuedas);
	}
	
   //Métodos accesores getter y setter
	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}
    // los setter declararlos protected
	protected void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected void setColor(String color) {
		this.color = color;
	}	

	@Override
	public String toString() {
		return "Vehiculo de " + getNumeroRuedas() + " ruedas, modelo: " + getMarca() + " y color " + getColor();
	}

}
