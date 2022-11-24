package UD3_UA2_IntegrandoCodigoExterno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kzurro.electrodomesticos.Electrodomestico;
import com.kzurro.electrodomesticos.Financiable;



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
		
	///// Siguiente tema de integrar código externo 	//
		Taller tallerElectrodomesticos = new Taller();

		Reparable electrodomestico = new ElectrodomesticoReparable();

		tallerElectrodomesticos.diagnosticar(electrodomestico);
		
        System.out.println("***Obtengo las averías del electrodomestico***");
		electrodomestico.getAverias().forEach(a -> System.out.println(a));
        System.out.println("/////Integrando código externo/////////");
		System.out.println(((Financiable) electrodomestico).getCuantiaCuota());

		
		Averia averiaElectroAveria = new Averia("Puerta", 0.5f, Arrays.asList(new Repuesto("puerta", 96325.5f)));
		tallerElectrodomesticos.diagnosticar(electrodomestico, averiaElectroAveria);
    
		electrodomestico.getAverias().forEach(System.out::println);
       
		for (Averia averia_2 : electrodomestico.getAverias()) {
			if (averia.getClass().getSimpleName().equals("AveriaFinaciable")) {
				System.out.println(averia_2 + " cuesta " + averia_2.getPrecio());
				System.out.println(" Si la financias cuesta cada cuota" + ((Financiable) averia).getCuantiaCuota());
			}
		}
	////////////////////////////////////////////////////////////////////////////////////////////	
		Financiable electrodomesticoFinanciable = new Electrodomestico(12.5, 25);
		System.out.println("*******************************");
		System.out.println(electrodomesticoFinanciable);
	/////////////////////////////////////////////////////////////////////////////////////////
		Electrodomestico lavadora = new Electrodomestico();
		
	}

}
