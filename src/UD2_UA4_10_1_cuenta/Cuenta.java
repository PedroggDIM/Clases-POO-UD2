package UD2_UA4_10_1_cuenta;
public class Cuenta {
	// Ejer 10.1
	private String titular;
	private double cantidad;
//Titular obligatorio y cantidad opcional
//Dos constructores que cumplan eso:	
	public Cuenta(String titular, double cantidad) {
		// Se puede usar el método o el this.
		settitular(titular); // this.titular = titular;
		setCantidad(cantidad);
	}
//Las cuentas por defecto como mínimo tienen un titular
	public Cuenta(String titular) {
		// con this puedo llamar a los parámetros o al otro constructor.
		// Probarlo poniendo this con punto y this sin nada
		// Con this llamo al primer constructor y le paso el titular que tengo
		// en este por parámetro y cero que lo pongo yo
		this(titular, 0);
	}
//Genero getter y setter; los setter protected.	
	public String gettitular() {
		return titular;
	}
	protected void settitular(String titular) {
		this.titular = titular;
	}
	protected void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getCantidad() {
		return cantidad;
	}
//Método ingresar	
	public void ingresar(double ingreso) {
		if (ingreso > 0) {
			this.cantidad = this.cantidad + ingreso;
		}
	}
//Método retirar
	public void retirar(double retiro) {
		// if(this.cantidad - retiro < 0) También se puede poner:
		if (getCantidad() - retiro < 0) {
			System.out.println("Solo puede retirar " + this.cantidad);
			setCantidad(0);
		} else {
			setCantidad(getCantidad() - retiro);
		}
	}
//Creo el toString()	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + " euros]";
	}
}
