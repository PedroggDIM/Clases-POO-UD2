package UD2_UA9_u_10d_clase;

import java.util.ArrayList;
import java.util.List;

public class AppTaller {

	public static void main(String[] args) {
		Repuesto repuesto1 = new Repuesto("aceite", 12.6);
		Repuesto repuesto2 = new Repuesto("aceite", 12.6);
		Repuesto repuesto3 = new Repuesto("pastillas de freno", 22.6);
		Repuesto repuesto4 = new Repuesto("anticongelante", 9.6);

		List<Repuesto> listaRepuestos = new ArrayList<>();
		listaRepuestos.add(repuesto1);
		// listaRepuestos.add(repuesto2);
		listaRepuestos.add(repuesto3);
		listaRepuestos.add(repuesto4);
		

		Averia cambioAceite = new Averia("cambio de aceite", 2, listaRepuestos);

		System.out.println(cambioAceite.getPrecios());

		CocheAveriado cocheAveriado = new CocheAveriado("2569-BBB", 4);

		cocheAveriado.getAverias().add(cambioAceite);
		cocheAveriado.getAverias().add(null);

		System.out.println(cocheAveriado.toString());
		
		
		Almacen almacen = new Almacen();
		
		almacen.getRepuestos().add(repuesto1);
		almacen.almacenarRepuesto(repuesto1);
		almacen.almacenarRepuesto(repuesto1);
		almacen.almacenarRepuesto(repuesto1);
		almacen.almacenarRepuesto(repuesto1);
		
		Repuesto otroRepuesto = new Repuesto(33, repuesto1.getNombre(), repuesto1.getPrecio());
		
		
		System.out.println(otroRepuesto);
		almacen.getRepuestos().forEach(r-> System.out.println(r));
		
		System.out.println(almacen.getRepuestos()
				.contains(otroRepuesto));
		

	}

}
