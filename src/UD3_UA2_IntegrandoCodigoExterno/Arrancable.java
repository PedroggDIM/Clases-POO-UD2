package UD3_UA2_IntegrandoCodigoExterno;

public interface Arrancable {
	
	default void arrancar() {
		System.out.println("Arrancado S/N");
	}
}
