package UD2_UA9_u_10d_clase;

public class Modelo {

	private String nombre;
	private String marca;
	private String tipoCombustible;

	public String getNombre() {
		return nombre;
	}

	public String getMarca() {
		return marca;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public Modelo(String nombre, String marca, String tipoCombustible) {
		this.nombre = nombre;
		this.marca = marca;
		this.tipoCombustible = tipoCombustible;
	}

	public Modelo() {
	}

}
