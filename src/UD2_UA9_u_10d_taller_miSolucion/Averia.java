package UD2_UA9_u_10d_taller_miSolucion;

import java.util.ArrayList;
import java.util.List;

public class Averia {
    
	private double PRECIO_MANO_HOBRA = 40;
	
	private String nombre;
	List<Repuesto> listaRepuestos;
	private double numeroHorasReparacion;

	public String getNombre() {
		return nombre;
	}

	public List<Repuesto> getListaRepuestos() {
		return listaRepuestos;
	}

	public double getNumeroHorasReparacion() {
		return numeroHorasReparacion;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setListaRepuestos(List<Repuesto> listaRepuestos) {
		if(this.listaRepuestos == null) {
			this.listaRepuestos = new ArrayList<Repuesto>();
			this.listaRepuestos.addAll(listaRepuestos);
		}else {
			getListaRepuestos().addAll(listaRepuestos);
		}
	}

	protected void setNumeroHorasReparacion(double numeroHorasReparacion) {
		this.numeroHorasReparacion = numeroHorasReparacion;
	}

	public Averia(String nombre, List<Repuesto> listaRepuestos, double numeroHorasReparacion) {
		setNombre(nombre);
		setListaRepuestos(listaRepuestos);
		setNumeroHorasReparacion(numeroHorasReparacion);
	}

	public Averia() {

	}
	// Al tener la Averia el precio de la Mano de obra, y el repuesto, y las horas de reparación
	// realizo un método para calcular el precio de la Averia
	// (precio repuesto más mano de obra)
	public double getPrecioAveria() {
		double precio = 0;
		for(Repuesto repuesto : getListaRepuestos()) {
			precio += repuesto.getPrecio();
		}
		precio += getNumeroHorasReparacion() * PRECIO_MANO_HOBRA;		
		return precio;
	}
	
	
}
