package UD2_UA6_Polimorfismo_7_Ejemplo;

public class Animal {
	
	private int numPatas;

	//constructor.
	public Animal(int numPatas) {
		setNumPatas(numPatas);
	}
	// por defecto sin patas.
	public Animal() {
		this(0); //llama al otro constructor
		        // y establece cero patas por defecto.
	}
	
	// metodo ruidoHago()
	public void ruidoHago() {
		System.out.println("Hago algún ruido");
	}	
    // metodos accesores	
	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}	
}
