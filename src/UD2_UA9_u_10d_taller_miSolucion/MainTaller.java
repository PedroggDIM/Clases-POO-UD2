package UD2_UA9_u_10d_taller_miSolucion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import UD2_UA9_u_10d_taller_solucionProfesor.Almacen;
import UD2_UA9_u_10d_taller_solucionProfesor.CocheReparable;
import UD2_UA9_u_10d_taller_solucionProfesor.HojaDeTrabajo;
import UD2_UA9_u_10d_taller_solucionProfesor.Repuesto;
import UD2_UA9_u_10d_taller_solucionProfesor.Taller;

public class MainTaller {

	public static void main(String[] args) {
		
		Repuesto repuesto1 = new Repuesto("aceite", 12.6f);
		Repuesto repuesto2 = new Repuesto("aceite", 12.6f);
		Repuesto repuesto3 = new Repuesto("pastillas de freno", 22.6f);
		Repuesto repuesto4 = new Repuesto("anticongelante", 9.6f);

		List<Repuesto> listaRepuestos = new ArrayList<>();
		listaRepuestos.add(repuesto1);
		listaRepuestos.add(repuesto2);
		listaRepuestos.add(repuesto3);
		listaRepuestos.add(repuesto4);

		Almacen almacen = new Almacen();

		almacen.almacenarRespuesto(repuesto1);
		almacen.almacenarRespuesto(listaRepuestos.toArray(new Repuesto[listaRepuestos.size()]));
		almacen.almacenarRespuesto(listaRepuestos);

	//	almacen.getRepuestos().forEach(r -> System.out.println(r));

		CocheReparable coche = new CocheReparable("Mazda", "Rojo", 5, "BDW2876");

		Taller taller = new Taller("Pepe", almacen, new ArrayList<HojaDeTrabajo>());


	}
}
