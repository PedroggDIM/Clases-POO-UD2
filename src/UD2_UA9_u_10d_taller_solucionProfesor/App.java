package UD2_UA9_u_10d_taller_solucionProfesor;

import java.util.ArrayList;
import java.util.List;



public class App {

	static ConstantesTaller constantesTaller = new ConstantesTaller();

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

		almacen.getRepuestos().forEach(r -> System.out.println(r));

		CocheReparable coche = new CocheReparable("Mazda", "Rojo", 5, "BDW2876");

		Taller taller = new Taller("Pepe", almacen, new ArrayList<HojaDeTrabajo>());

		System.out.println(coche.getAverias());
		taller.diagnosticar(coche);

		Averia averia = new Averia("Cambio luna", 1.5f, listaRepuestos);
		Averia averia2 = new Averia("Cambio luna", 1, listaRepuestos);
		System.out.println(coche.getAverias());
		taller.diagnosticar(coche, averia);
		System.out.println(coche.getAverias());
		taller.diagnosticar(coche, averia2);
		System.out.println(coche.getAverias());

		HojaDeTrabajo hojaDeTrabajo = new HojaDeTrabajo(coche);

		System.out.println(taller.getPresupuesto(hojaDeTrabajo));

		List<Repuesto> listaRepuestosDos = new ArrayList<>();

		listaRepuestosDos.add(repuesto3);

		coche.addAveria(new Averia("freno", 5.2f, listaRepuestosDos));
		System.out.println(taller.isGarantia(coche));

	}

}
