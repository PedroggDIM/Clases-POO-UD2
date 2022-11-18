package UD2_UA3_ClasesMain;

import UD2_UA3_Clases.Coche;

public class CocheMain {

	public static void main(String[] args) {

		Coche alfaRomeo = new Coche(4, "2644545", true, "observaciones: gti", "azul");

		System.out.println(alfaRomeo.getColor()); // Devuelve azul.
		alfaRomeo.setColor("negro"); // si el método set color fuera protected
										// no me dejaría acceder a él (probarlo)
		System.out.println(alfaRomeo.getColor()); // Devuelve  negro.

		Coche miniCoche = new Coche();
		System.out.println(miniCoche.getColor());

		// Cuando quiero comparar dos objetos llamo siempre
		// al método equals.
		// Llamo al método equals
		System.out.println("Comparo objetos con equals: ");
		System.out.println(alfaRomeo.equals(miniCoche));

		// Lo siguiente == no compara es que apunta al mismo espacio de memoria
		System.out.println(alfaRomeo == miniCoche);

	}

}
