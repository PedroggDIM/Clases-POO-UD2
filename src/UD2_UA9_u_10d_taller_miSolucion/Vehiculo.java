package UD2_UA9_u_10d_taller_miSolucion;

public abstract class Vehiculo {
	
	
	private int ruedas;
	private String matricula;
	private String marca;
	private String modelo;
	private int kilometraje;
	
	// constructores
	 public Vehiculo(int ruedas, String matricula, String marca, String modelo, int kilometraje) {
		super();
		this.ruedas = ruedas;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
	}
	 
	public Vehiculo() {
		super();
	}

	// metodo abstracto
    public abstract int getEdad();   

	// metodos accesores
	public int getRuedas() {
		return ruedas;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public int getKilometraje() {
		return kilometraje;
	}

	protected void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

}
