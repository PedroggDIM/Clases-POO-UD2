package UD2_UA6_Polimorfismo_7_Ejemplo;

public class Perro extends Animal {

	private boolean soyDeCaza;
	
	// constructor establece por defecto soyDeCaza false.
	public Perro() {
		this(false);
	}
    // constructor
	public Perro(boolean soyDeCaza) {
		super(4);                   // llama al constructor de Animal 
		                            // y establece 4 patas por defecto.
		setSoyDeCaza(soyDeCaza);   // establece soyDeCaza true por defecto.
	}
	
	// sobreescribo el método de la superclase y añado mi funcionalidad.
	@Override
	public void ruidoHago() {
		System.out.println("hago guauu como perro");
	}
    
	// metodos accesores
	public boolean isSoyDeCaza() {
		return soyDeCaza;
	}
	public void setSoyDeCaza(boolean soyDeCaza) {
		this.soyDeCaza = soyDeCaza;
	}	
}
