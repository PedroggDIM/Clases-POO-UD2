package UD2_UA9_u_10d_taller_miSolucion;

import java.util.ArrayList;
import java.util.Collection;

public class CocheReparable extends Coche implements Reparable{
	
	//CocheReparable es un coche con averías
		private Collection<Averia> averias;
	
	public Collection<Averia> getAverias() {
			return averias;
		}

	protected void setAverias(Collection<Averia> averias) {
		if(getAverias() == null) {
			this.averias = new ArrayList<Averia>();
			this.averias.addAll(averias);
			}
		else {
			getAverias().addAll(averias);
		}
	}

	public CocheReparable(String marca, String modelo, String color, String matricula) {
		super(marca, modelo, color, matricula);
		
	}

	@Override
	public Collection<Averia> getAveria() {
		return this.averias;
	}	

}
