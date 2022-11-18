package UD2_UA9_u_10d_clase;

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
	
	public Repuesto() {
	}
	
	public Repuesto(String nombre,double precio) {
		setNombre(nombre);
		setPrecio(precio);
		
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(nombre, precio);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Repuesto other = (Repuesto) obj;
//		return Objects.equals(nombre, other.nombre)
//				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
//	}

	@Override
	public String toString() {
		return "Repuesto [getId()=" + getId() + ", getNombre()=" + getNombre() + "]";
	}
	
	

	

}
