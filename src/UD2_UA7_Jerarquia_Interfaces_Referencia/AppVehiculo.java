package UD2_UA7_Jerarquia_Interfaces_Referencia;

public class AppVehiculo {

	public static void main(String[] args) {

		Coche coche1 = new Coche();
		Moto moto1 = new Moto(2, 9999, true);
		Barco barco1 = new Barco(5, 0);

// Interfaz como tipo de referencia		
		   // SE GARANTIZA LA SUSTITUIBILIDAD POR CUALQUIER INSTANCIA DE UNA CLASE QUE LA IMPLEMENTE
		
		Arrancable barco2 = new Barco(10, 150);            // Barco implementa Arrancable.
		Arrancable coche2 = new Coche(4, "ROJO", 5, 1100); // Coche extends de Vehiculo que implements Arrancable
		Arrancable moto2 = new Moto(2);                    // Moto  extends de Vehiculo que implements Arrancable

		coche1.arrancar();
		moto1.arrancar();
		barco1.arrancar();
		System.out.println(barco2.esReparable());

		Arrancable[] listaArrancables = { barco2, coche2, moto2, coche1, moto1, barco1 };

		for (int i = 0; i < listaArrancables.length; i++) {
			System.out.println(listaArrancables[i].getClass().getSimpleName());
		}

	}

}