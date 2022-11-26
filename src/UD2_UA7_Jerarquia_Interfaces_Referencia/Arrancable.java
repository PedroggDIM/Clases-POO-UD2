package UD2_UA7_Jerarquia_Interfaces_Referencia;

public interface Arrancable extends Reparable { //una interfaz extends de otra interfaz

	// metodo dafault en interface se implementa contenido y las clases lo pueden implemtentar o no
	public default void arrancar() {
		System.out.println("Soy un " + getClass().getSimpleName() + " estoy arrancando...");
	}

}
