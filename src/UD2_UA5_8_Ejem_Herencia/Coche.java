package UD2_UA5_8_Ejem_Herencia;

public class Coche extends Vehiculo {

	private String modelo;
	private int numeroPlazas;

	//Constructores
	//Constructor propio de la clase sin parámetrosl
	public Coche() {
		// super();
	}
    //Constructor que llama al constructor de la clase padre
	public Coche(int numeroRuedas, String marca, String color) {
		super(numeroRuedas, marca, color);
	}
    //Constructor propio de la clase
	public Coche(String modelo, int numeroPlazas) {
		super(); //Llama al constructor clase padre
		setModelo(modelo);
		setNumeroPlazas(numeroPlazas);
	}
    //Constructor con sus parámetros y los de la clase padre.
	public Coche(String modelo, int numeroPlazas, int numeroRuedas, String marca, String color) {
		super(numeroRuedas, marca, color);
		setModelo(modelo);
		setNumeroPlazas(numeroPlazas);
	}
	
// Métodos de acceso
	public String getModelo() {
		return modelo;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}	

	@Override
	public String toString() {
		return "Coche " + getColor() + " modelo " + getModelo() + ", con " + getNumeroPlazas() + " plazas";
	}


}
