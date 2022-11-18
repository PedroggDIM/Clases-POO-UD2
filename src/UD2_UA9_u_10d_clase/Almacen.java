package UD2_UA9_u_10d_clase;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

	private String nombre;
	private List<Repuesto> repuestos;

	public String getNombre() {
		return nombre;
	}

	public List<Repuesto> getRepuestos() {
		return repuestos;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setRepuestos(List<Repuesto> repuestos) {
		if (getRepuestos() == null) {
			this.repuestos = new ArrayList<Repuesto>();
			this.repuestos.addAll(repuestos);
		} else {
			getRepuestos().addAll(repuestos);

		}

	}

	public Almacen() {
		setRepuestos(new ArrayList<>());
	}

	public Almacen(List<Repuesto> repuestos) {
		setRepuestos(repuestos);
	}

	public boolean isRepuesto(Repuesto repuesto, int cantidad) {
		int contadorRepuestos = 0;
		for (Repuesto repuestoAlmacen : getRepuestos()) {
			if (repuesto.equals(repuestoAlmacen)) {
				contadorRepuestos++;
			}

		}

		return contadorRepuestos >= cantidad;
	}

	public boolean isRepuesto(Repuesto repuesto) {
		return isRepuesto(repuesto, 1);
	}

	public void almacenarRepuesto(Repuesto repuesto) {
		getRepuestos().add(asignarId(repuesto));
		System.out.println("Se ha almacenado " + repuesto.getNombre() + " S/N\")");

	}

	private Repuesto asignarId(Repuesto repuesto) {
		Repuesto repuestoAlmacenar = null;
		if (getRepuestos().contains(repuesto)) {
			repuestoAlmacenar = new Repuesto(repuesto.getNombre(), repuesto.getPrecio());
			repuestoAlmacenar.setId(getRepuestos().size());
			;
		} else {
			repuesto.setId(getRepuestos().size());
			repuestoAlmacenar = repuesto;
		}

		return repuestoAlmacenar;
	}

}
