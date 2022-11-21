package UD2_UA9_u_10d_taller_miSolucion;

import java.util.ArrayList;
import java.util.List;

public class Taller {

	private String nombre;
	private Almacen almacen;
	private List<HojaDeTrabajo> hojasDeTrabajo;

	public String getNombre() {
		return nombre;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public List<HojaDeTrabajo> getHojasDeTrabajo() {
		return hojasDeTrabajo;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	protected void setHojasDeTrabajo(List<HojaDeTrabajo> hojasDeTrabajo) {
		if(getHojasDeTrabajo() == null) {
			this.hojasDeTrabajo = new ArrayList<HojaDeTrabajo>();
			this.hojasDeTrabajo.addAll(hojasDeTrabajo);
		}else {
			getHojasDeTrabajo().addAll(hojasDeTrabajo);
		}
	}
    
	public Taller(String nombre, Almacen almacen, List<HojaDeTrabajo> hojasDeTrabajo) {
		setNombre(nombre);
		setAlmacen(almacen);
		setHojasDeTrabajo(hojasDeTrabajo);
	}

	public Taller() {
		
	}

}
