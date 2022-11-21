package UD2_UA9_u_10d_taller_miSolucion;

import java.util.Objects;



public class Repuesto {

	private int id;
	private String nombre;
	private double precio;

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}

	public Repuesto(int id, String nombre, double precio) {
		setId(id);
		setNombre(nombre);
		setPrecio(precio);
	}
	public Repuesto( String nombre, float precio) {
		//pongo -1 al id porque el 0 puede ser un id existente en nuestro Almacen
		this(-1, nombre, precio);
	}

	public Repuesto() {

	}

	@Override
	public String toString() {
		return "Repuesto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repuesto other = (Repuesto) obj;
		return Objects.equals(getNombre(), other.getNombre()) && Objects.equals(getPrecio(), other.getPrecio());
	}
	

}
