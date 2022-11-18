package UD2_UA4_10_1_cuenta;

public class CuentaApp {

	public static void main(String[] args) {

		Cuenta cuentaBanco = new Cuenta("pepe", 800);

		System.out.println(cuentaBanco.toString());
		cuentaBanco.ingresar(200);
		System.out.println(cuentaBanco.toString());
		cuentaBanco.retirar(8000);
		System.out.println(cuentaBanco.toString());

	}
}
