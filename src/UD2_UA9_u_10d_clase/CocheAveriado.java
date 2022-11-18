package UD2_UA9_u_10d_clase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CocheAveriado extends Coche implements Reparable{
	String pepeString = "pepe";
	private List<Averia> supuestasAverias;

	public List<Averia> getSupuestasAverias() {
		return supuestasAverias;
	}

	protected void setSupuestasAverias(List<Averia> supuestasAverias) {
		if (getAverias() == null) {
			this.supuestasAverias = new ArrayList<Averia>();
			this.supuestasAverias.addAll(supuestasAverias);
		} else {
			this.supuestasAverias.addAll(supuestasAverias);
		}
	}
	
	

	public CocheAveriado(int ruedas, String matricula, String tipoCarnet, Modelo modelo, int numPasajeros) {
		super(ruedas, matricula, tipoCarnet, modelo, numPasajeros);
		setSupuestasAverias(new ArrayList<Averia>());
	}
	
	public CocheAveriado(String matricula, int numPasajeros) {
		super(4, matricula, "B", null, numPasajeros);
		setSupuestasAverias(new ArrayList<Averia>());
	}
	
	public CocheAveriado() {
		setSupuestasAverias(new ArrayList<>());
		
	}
	
	
	

	@Override
	public String toString() {
		return "CocheAveriado [getAverias()=" + getAverias() + ", getNumPasajeros()=" + getNumPasajeros()
				+ ", getMatricula()=" + getMatricula() + "]";
	}

	@Override
	public Collection<Averia> getAverias() {
		// TODO Auto-generated method stub
		return getSupuestasAverias();
	}
	
	
	
	

	
	
	



}
