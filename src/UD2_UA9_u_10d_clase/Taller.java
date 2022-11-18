package UD2_UA9_u_10d_clase;

import java.util.ArrayList;
import java.util.List;

public class Taller {

	private Almacen almacen;
	private String nombre;
	private List<HojaDeTrabajo> hojas;

	public Almacen getAlmacen() {
		return almacen;
	}

	public String getNombre() {
		return nombre;
	}

	public List<HojaDeTrabajo> getHojas() {
		return hojas;
	}

	protected void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setHojas(List<HojaDeTrabajo> hojas) {

		if (this.hojas == null) {
			this.hojas = new ArrayList<HojaDeTrabajo>();
			this.hojas.addAll(hojas);
		}
		else {
			this.hojas.addAll(hojas);
		}
	}

	public Taller() {
		this(null, "", null);
	}

	public Taller(Almacen almacen, String nombre, List<HojaDeTrabajo> hojas) {

		setAlmacen(almacen);
		setNombre(nombre);
		setHojas(hojas);
	}

}
