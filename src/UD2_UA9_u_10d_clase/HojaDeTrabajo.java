package UD2_UA9_u_10d_clase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HojaDeTrabajo {

	private Reparable vehiculoAveriado;
	private List<Averia> averiasReparadas;
	private LocalDate fechaEntrada;

	// métodos constructores
	public HojaDeTrabajo(CocheAveriado vehiculoAveriado, List<Averia> averiasReparar, LocalDate fechaEntrada) {
		setVehiculoAveriado(vehiculoAveriado); 
		setAveriasReparar(averiasReparar); 
		setFechaEntrada(fechaEntrada);
	}
    // constructor por defecto
	// vehiculo averiado a null, inicializa las averias y fecha actual.
	public HojaDeTrabajo() {
		this(null, new ArrayList<Averia>(), LocalDate.now());	
		
	}

	// métodos accesores
	public Reparable getVehiculoAveriado() {
		return vehiculoAveriado;
	}

	public List<Averia> getAveriasReparar() {
		return averiasReparadas;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	protected void setVehiculoAveriado(CocheAveriado vehiculoAveriado) {
		this.vehiculoAveriado = vehiculoAveriado;
	}

	protected void setAveriasReparar(List<Averia> averiasReparar) {
		// si tengo algo
		if(this.averiasReparadas != null) {
		// me aniades	
			this.averiasReparadas.addAll(averiasReparar);
		}else {
		// en caso contrario (vacío) // me inicicas y aniades.	
			this.averiasReparadas = new ArrayList<>();
			this.averiasReparadas.addAll(averiasReparar);
		}
	}

	protected void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	
	public void addReparacionFinalizada(Averia averia) {
		if(getVehiculoAveriado().getAverias().contains(averia)) {
			getVehiculoAveriado().getAverias().remove(averia);
			getAveriasReparar().add(averia);
		}else {
			System.err.println("No se puede reparar una averia que no tienes");
		}
	}

}
