package UD2_UA9_u_10d_taller_solucionProfesor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class HojaDeTrabajo {
	
	private VehiculoConRuedas vehiculoAReparar;
	private Collection<Averia> averiasReparacion;
	private LocalDate fechaEntrada;

	public VehiculoConRuedas getVehiculoAReparar() {
		return vehiculoAReparar;
	}
	
	protected Collection<Averia> getAveriasReparacion() {
		return averiasReparacion;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	protected void setVehiculoAReparar(VehiculoConRuedas vehiculoAReparar) {
		this.vehiculoAReparar = vehiculoAReparar;
	}
	 // si esta vacia la inicializo y añado las averiasReparar
	// si no esta vacia añado averiasReparar a las que ya hay.
	protected void setAveriasReparacion(Collection<Averia> averiasReparar) {
		if (getAveriasReparacion() == null) {
			this.averiasReparacion = new ArrayList<Averia>();
			this.averiasReparacion.addAll(averiasReparar);
		} else {
			getAveriasReparacion().addAll(averiasReparar);
		}
	}

	protected void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public HojaDeTrabajo(VehiculoConRuedas vehiculo, LocalDate fechaEntrada) {
		setVehiculoAReparar(vehiculo);
		setAveriasReparacion(new ArrayList<Averia>());
		setFechaEntrada(fechaEntrada);
	}

	public HojaDeTrabajo(VehiculoConRuedas vehiculo) {
		this(vehiculo, LocalDate.now());
	}

}