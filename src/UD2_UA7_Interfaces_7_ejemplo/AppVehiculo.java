package UD2_UA7_Interfaces_7_ejemplo;

public class AppVehiculo {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		Moto moto1 = new Moto(2, 9999, true);

		coche1.arrancar();
		moto1.arrancar();

	}

}
