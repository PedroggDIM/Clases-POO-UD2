package UD2_UA7_Jerarquia_Interfaces;

public class AppVehiculo {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		Moto moto1 = new Moto(2, 9999, true);

		// ver imagen de herencia en los apuntes.
		coche1.pagarImpuesto();
		coche1.arrancar();
		coche1.esReparable();
		coche1.cambiarColor("azul");
		
		moto1.pagarImpuesto();
		moto1.arrancar();
		moto1.esReparable();
		

	}

}
