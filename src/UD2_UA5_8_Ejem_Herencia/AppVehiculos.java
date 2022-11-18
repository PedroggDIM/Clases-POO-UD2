package UD2_UA5_8_Ejem_Herencia;

public class AppVehiculos {

	public static void main(String[] args) {
		
		Vehiculo vehiculo1 = new Vehiculo(4, "Seat", "rojo");
		System.out.println(vehiculo1.toString());
		
		Coche coche1 = new Coche("XC-90", 6, 4, "Volvo", "azul");
		System.out.println(coche1.toString());
				
		Vehiculo coche2 = new Coche("Passat", 4, 4, "VW", "gris");
		System.out.println(coche2.toString());
		
		Vehiculo moto1 = new Moto(2, 999);			
		System.out.println(moto1.toString());
		
		Vehiculo[] vehiculos = { vehiculo1, coche1, coche2, moto1 };
		
		System.out.println("****************************");
		for (Vehiculo vehiculo : vehiculos) {

			System.out.println(vehiculo.toString());
		}
	}
}
