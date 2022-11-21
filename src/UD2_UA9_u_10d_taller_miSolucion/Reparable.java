package UD2_UA9_u_10d_taller_miSolucion;

import java.util.Collection;

public interface Reparable {
	// Un metodo que nos devuelva todas las averias
	public Collection<Averia> getAveria();

	// Un metodo que nos diga si está reparado o no.
	public default boolean esReparado() {
		return getAveria().isEmpty();
	}
	
	//Un método que nos diga las horas de reparación
	// cada averia tiene un tiempo de reparacion y se tiene que sumar para 
	// calcular el tiempo total de la reparación.
	public default double getHorasReparacion() {
		double tiempoTotal = 0;
		for(Averia ave : getAveria()) {
			tiempoTotal += ave.getNumeroHorasReparacion();
		}
		return tiempoTotal;
	}
	public default double costeReparacion() {
		double coste = 0;
		for(Averia ave : getAveria()) {
			coste += ave.getPrecioAveria();
		}
		return coste;
	}

}
