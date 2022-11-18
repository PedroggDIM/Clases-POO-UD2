package UD2_UA9_u_10d_clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Averia {

	private static final float PRECIO_MANO_OBRA = 40;
	private String nombre;
	private float numHorasManoObra;
	private Collection<Repuesto> repuestosNecesarios;

	public String getNombre() {
		return nombre;
	}

	public float getNumHorasManoObra() {
		return numHorasManoObra;
	}

	public Collection<Repuesto> getRepuestosNecesarios() {
		return repuestosNecesarios;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setNumeroHorasManoObra(float numHorasManoObra) {
		this.numHorasManoObra = numHorasManoObra;
	}

	protected void setRepuestosNecesarios(Collection<Repuesto> repuestosNecesarios) {
		if (getRepuestosNecesarios() == null) {
			this.repuestosNecesarios = new ArrayList<Repuesto>();
			this.repuestosNecesarios.addAll(repuestosNecesarios);
		} else {
			getRepuestosNecesarios().addAll(repuestosNecesarios);
		}
	}

	private Averia(String nombre, float numeroHorasManoObra) {
		setNombre(nombre);
		setNumeroHorasManoObra(numeroHorasManoObra);
	}

	public Averia(String nombre, float numeroHorasManoObra, Collection<Repuesto> repuestos) {
		this(nombre, numeroHorasManoObra);
		setRepuestosNecesarios(repuestos);
	}

	public Averia(String nombre, float numeroHorasManoObra, Repuesto... repuestos) {
		this(nombre, numeroHorasManoObra);
		setRepuestosNecesarios(Arrays.asList(repuestos));
	}

	public float getPrecios() {
		float precio = 0;

		for (Repuesto repuesto : getRepuestosNecesarios()) {
			precio += repuesto.getPrecio();
		}
		precio += getNumHorasManoObra() * PRECIO_MANO_OBRA;

		return precio;
	}

	@Override
	public String toString() {
		return "Averia [getNombre()=" + getNombre() + ", getPrecios()=" + getPrecios() + "]";
	}
	
	

}
