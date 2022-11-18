package UD2_UA9_u_10d_clase;

import java.util.Collection;

public interface Reparable {
	
	public Collection<Averia> getAverias();
	
	public default void addAveria(Averia averia) {
		getAverias().add(averia);
	}
	
	public default boolean isReparado() {
		return getAverias().isEmpty();
	}
	
	public default float getHorasReparacion() {
		float tiempoTotal = 0;
		for (Averia averia : getAverias()) {
			tiempoTotal += averia.getNumHorasManoObra();
		}

		return tiempoTotal;
	}
	
	public default float getCosteReparacion() {
		float tiempoTotal = 0;
		for (Averia averia : getAverias()) {
			tiempoTotal += averia.getPrecios();
		}

		return tiempoTotal;
	}
	
	
	

	
	
	
	

}
