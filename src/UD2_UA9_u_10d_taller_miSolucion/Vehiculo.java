package UD2_UA9_u_10d_taller_miSolucion;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getColor() {
		return color;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	public Vehiculo(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	public Vehiculo() {
		this("", "", "");
	}
	
	

}
