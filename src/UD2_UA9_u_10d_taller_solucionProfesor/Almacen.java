package UD2_UA9_u_10d_taller_solucionProfesor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import UD2_UA9_u_10c_Ejemplo_Comparator.NombreComparator;


public class Almacen {
	
	private List<Repuesto> repuestos;

	public List<Repuesto> getRepuestos() {
		return repuestos;
	}

	// si esta vacia la inicializo y añado los repuestos
	// si no esta vacia añado repuestos a los que ya hay.
	protected void setRepuestos(List<Repuesto> repuestos) {
		if (getRepuestos() == null) {
			this.repuestos = new ArrayList<>();
			this.repuestos.addAll(repuestos);
		} else {
			getRepuestos().addAll(repuestos);

		}
	}

	public Almacen() {
		setRepuestos(new ArrayList<Repuesto>());
	}

	public Almacen(List<Repuesto> repuestos) {
		setRepuestos(repuestos);
	}

	// compruebo si hay repuestos:
	// compruebo si hay cantidad de repuestos necesaria.
	public boolean isRepuesto(Repuesto repuesto, int cantidad) {
		int contadorRepuestos = 0;
		// comprueba que en la lista de respuestos existen los repuestos
		// los repuestos estan en la lista getRepuestos( ), la recorro y si son iguales
		// simplemente comprueba 
		for (Repuesto repuestoAlmacen : getRepuestos()) {
			// Como hacemos un equals en repuesto EN ESTE METODO SOBREESCRIBO equals: public
			// boolean equals(Object obj)
			if (repuestoAlmacen.equals(repuesto)) {
				contadorRepuestos++;
			}
		}
		// devuelve true si el contadorRepuestos es mayor o igual que cantidad,
		// ya que lo que hace es comprobar si hay repuesto.
		return contadorRepuestos >= cantidad;
	}

	// metodo para almacenar repuestos
	public void almacenarRespuesto(Repuesto repuesto) {
		getRepuestos().add(repuesto);// un mensaje por consola solo para que quede registrado:
		System.out.println("Se ha almacenado " + repuesto.getNombre() + " S/N");
	}

	private Repuesto asignarId(Repuesto repuesto) {
		Repuesto repuestoAlmacenar = new Repuesto(repuesto.getNombre(), repuesto.getPrecio());
		// Le das el tamaño que tiene el array en ese momento, que cada vez es uno más y
		// empieza en 0,1,2,3,4...
		repuestoAlmacenar.setId(getRepuestos().size());
		return null;
	}

	public void almacenarRespuesto(Repuesto... repuesto) {
		Arrays.stream(repuesto).forEach(r -> almacenarRespuesto(r));
	}

	public void almacenarRespuesto(Collection<Repuesto> colecionRepuestos) {
		colecionRepuestos.forEach(r -> almacenarRespuesto(r)); // solo lo imprime
	}
}