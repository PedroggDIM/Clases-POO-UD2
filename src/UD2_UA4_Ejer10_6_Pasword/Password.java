package UD2_UA4_Ejer10_6_Pasword;

import java.security.SecureRandom;

public class Password {
	
	//atributos longitud y contraseña . Por defecto, la longitud sera de 8.
	private final static int LONG_DEF = 8;
	private int longitud;
	private String contraseña;
	
	//Un constructor por defecto.
	//Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
	public Password() {		
		this(LONG_DEF);
	}
    //Un constructor con la longitud que nosotros le pasemos. 
	//Generara una contraseña aleatoria con esa longitud.	
	public Password(int logitud) {		
		setLongitud(longitud);
		setContraseña(generaPassword());
	}
	
//esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte
//debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
   public boolean esFuerte() {
	   int cuentanumeros = 0;
		int cuentaminusculas = 0;
		int cuentamayusculas = 0;
		boolean esFuerte = false;
		// Vamos caracter a caracter y comprobamos que tipo de caracter es
		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
				cuentaminusculas += 1;
			} else {
				if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
					cuentamayusculas += 1;
				} else {
					cuentanumeros += 1;
				}
			}
		}
		// Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2
		// mayusculas
		if (cuentanumeros >= 5 && cuentaminusculas >= 1 && cuentamayusculas >= 2) {
			esFuerte = true;
		} else {
			esFuerte = false;
		}
		return esFuerte;	   
   }
			

	
//Método generarPassword() genera contraseña longitud 8
   public String generaPassword() {
		String password = "";
		for (int i = 0; i < getLongitud(); i++) {
			// Generamos un numero aleatorio, segun este elige si añadir una minuscula,
			// mayuscula o numero
			// Generamos un numero aleatorio, segun este elige si añadir una minuscula,
						// mayuscula o numero
			int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

			if (eleccion == 1) {
				char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
				password += minusculas;
			} else {
				if (eleccion == 2) {
					char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
					password += mayusculas;

				} else {
					char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
					password += numeros;

				}
			}
		}
		System.out.println(password);
		return password;
	}
	 
//Métodos accesores
	public static int getLongDef() {
		return LONG_DEF;
	}


	public int getLongitud() {
		return longitud;
	}


	public String getContraseña() {
		return contraseña;
	}


	protected void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	protected void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
 //Método toString
	@Override
	public String toString() {
		return "Password = Longitud " + getLongitud() + ", Contraseña:" + getContraseña();
	}
	
}
