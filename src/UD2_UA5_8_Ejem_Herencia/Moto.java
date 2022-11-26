package UD2_UA5_8_Ejem_Herencia;

public class Moto extends Vehiculo {

	//Atributos
	int numTiempos;
	int cubicaje;
	
	//Constructores	
	public Moto() {
		super();
	}
    //Con super llamamos al constructor de la clase padre.
	public Moto(String marca, String color) {
		super(2, marca, color);
	}
    
	public Moto(int numTiempos, int cubicaje) {
		super();  //llama al constructor de la clase padre.
		setNumTiempos(numTiempos);
		setNumeroRuedas(cubicaje);
		setNumeroRuedas(2);
	}
	//Apartado 8 (sobreescribo el método getColor()
	//Los métodos de la clase padre se pueden adaptar en la que hereda.
	// Moto sobreescribe el método getColor() de Vehiculo y le da su funcionalidad
	 @Override
	  public String getColor() {
	    return "LAS MOTOS NO TIENEN COLOR";
	  }
	
	
	//Métodos de acceso
	public int getNumTiempos() {
		return numTiempos;
	}

	public int getCubicaje() {
		return cubicaje;
	}

	protected void setNumTiempos(int numTiempos) {
		this.numTiempos = numTiempos;
	}

	protected void setCubicaje(int cubicaje) {
		this.cubicaje = cubicaje;
	}
	@Override
	public String toString() {
		return "Moto " + getColor() + " de " + getNumTiempos() + " tiempos  y " + getCubicaje() + " cc"
				+ " //Ruedas: " + getNumeroRuedas();
	}

	
}
