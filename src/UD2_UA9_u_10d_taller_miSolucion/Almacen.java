package UD2_UA9_u_10d_taller_miSolucion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import UD2_UA9_u_10d_taller_solucionProfesor.Repuesto;

public class Almacen {
	
	private List<Repuesto> coleccionRepuestos;

	public List<Repuesto> getColeccionRepuestos() {
		return coleccionRepuestos;
	}

	protected void setColeccionRepuestos(List<Repuesto> repuestos) {
		if(getColeccionRepuestos() == null) {
			this.coleccionRepuestos = new ArrayList<Repuesto>();
			this.coleccionRepuestos.addAll(repuestos);
		}else {
			getColeccionRepuestos().addAll(repuestos);
		}
	}

	public Almacen(List<Repuesto> coleccionRepuestos) {
		setColeccionRepuestos(coleccionRepuestos);
		
	}

	public Almacen() {
		setColeccionRepuestos(new ArrayList<Repuesto>() );
	}
	
	//Un método que nos diga si tenemos la cantidad de repuestos necesarios
	//para abordar una Averia. Esto nos obligara a sobrescribir 
	//el equals en Repuesto lo que nos facilitará saber si dos repuestos son iguales.
	public boolean isRepuesto(Repuesto repuesto, int cantidad) {
		int contadorRepuestos = 0;
		for(Repuesto repuesto_Almacen : getColeccionRepuestos()) {
			if(repuesto_Almacen.equals(repuesto)) {
				contadorRepuestos++;
			}			
		}
		if(contadorRepuestos >= cantidad){
			return true;  // tenemos la cantidad de repuestos necesarios para abordar la averia
		}else {
		return false;	// no tenemos la cantidad de repuestos necesarios para abordar la averia
		}		
	}
	
	//sobrecargas de tal forma que admita si tenemos un repuesto y si tenemos una cantidad de un Repuesto
	public boolean isRepuesto(Repuesto repuesto) {
		return isRepuesto(repuesto, 1);
	}
	
	//Un método que nos sirva para almacenar repuestos en el Almacen, 
	//bien sea uno, varios (colección o array)
	public void almacenaRepuesto(Repuesto repuesto) {
		// getColeccionRepuestos().add(repuesto);
		 getColeccionRepuestos().add(asignarId(repuesto));
		System.out.println("Se ha almacenado el repuesto " + repuesto.getNombre() + " sin novedad.");
	}

	public void almacenaRepuesto(Collection<Repuesto> colecionRepuestos) {
		getColeccionRepuestos().addAll(coleccionRepuestos);
	}
	
	public Repuesto asignarId(Repuesto repuesto) {
		Repuesto repuesto2 = null;
		if (getColeccionRepuestos().contains(repuesto)) {
			repuesto2 = new Repuesto(repuesto.getNombre(), repuesto.getPrecio());
			repuesto2.setId(getColeccionRepuestos().size());
		} else {
			repuesto.setId(getColeccionRepuestos().size());
			repuesto2 = repuesto;
		}

		return repuesto2;
	}
	
	
}
