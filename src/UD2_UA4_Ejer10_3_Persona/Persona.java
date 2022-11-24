package UD2_UA4_Ejer10_3_Persona;

import java.security.PublicKey;

public class Persona {
	// Dice el enunciado: Sexo será hombre por defecto, usa una constante para ello.
	// Es static porque quiero que cuando se inicie la clase sea una variable 
	//de clase, no de instancia // se marca final porque luego tengo otro sexo que 
	// puede cambiar	
		private final static char SEXO_DEF = 'H';

	//Declaro variables final necesarias para calcular en el método calcularIMC()
		static final int INFRAPESO = -1;
		
	//El peso de la persona esta en su peso ideal	 
		static final int PESO_IDEAL = 0;
		
	//El peso de la persona esta por encima del peso ideal	 
		static final int SOBREPESO = 1;	
		
		private String nombre;
		private int edad;
		private String dni;
		private char sexo;
		private double peso;
		private double altura;
		
		// Constructores

			//Por defecto, todos los atributos menos el DNI serán valores por defecto
		//según su tipo (0 números, cadena vacía para String, etc.). Sexo será hombre por defecto, usa una constante para ello.
		    //Primero construimos el constructor con todos los parametros y 
		    // en este con el this le llamamos y construimos por defecto.
			public Persona() {  
				  // ESTE CONSTRUCTOR LLAMA AL DE ABAJO (VERLO HACIENDO CLIC EN EL THIS)
				  // y establece los valores por defecto menos el DNI.
				this("", 0, "", SEXO_DEF, 0, 0);
			}

			public Persona(String nombre, int edad, char sexo) {
				this(nombre, edad, "", sexo, 0, 0);  //El "" es del DNI.
			}

			public Persona(String nombre, int edad, String dNi, char sexo, double peso, double altura) {
				setNombre(nombre);
				setEdad(edad);
				//setDni(dNi);
				//generarDni();
				if (dNi.equalsIgnoreCase("")) {
					generarDni();
				} else {
					setDni(dNi);
				}
				//setSexo(sexo);				
				comprobarSexo(sexo);
				setPeso(peso);
				setAltura(altura);
			}
			
	// apartado 10.4		
			public int calcularIMC() {
			int imc;
			// Calculamos el peso de la persona
			//double pesoActual = peso / (Math.pow(altura, 2));
			double pesoActual = getPeso() / (Math.pow(altura, 2));
			// Segun el peso, devuelve un codigo
			if (pesoActual >= 20 && pesoActual <= 25) {
				imc = PESO_IDEAL;
			} else if (pesoActual < 20) {
				imc = INFRAPESO;
			} else {
				imc = SOBREPESO;
			}
			return imc;
		}
//Compruebo si es mayor de edad.			
		public boolean esMayorEdad() {	
		// getEdad() >= 18 ya es de por sí una expresión booleana (boolean)	
			return getEdad() >= 18;			
		}
//comprobarSexo(char sexo) // le pongo privado dice el enunciado NO SERÁ VISIBLE
		private void comprobarSexo(char sexo) {
			if(sexo != 'H' && sexo !='M') {
				//this.sexo = SEXO_DEF;
				setSexo(SEXO_DEF);
			}else {
			    setSexo(sexo);
			}
			
		}
//Genera DNI
		private void generarDni() {
			char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
					'L', 'C', 'K', 'E' };
			// Generamos un número de 8 digitos
			int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
			int letra = numDNI % letras.length;

			// lo seteo a mi Persona  valueOf le paso un número y lo convierte a String
			setDni(Integer.toString(numDNI) + "-" + letras[letra]);
		}


// metodos accesores LOS SETTER PONERLES PROTECTED.
		public static char getSexoDef() {
			return SEXO_DEF;
		}

		public String getNombre() {
			return nombre;
		}

		public int getEdad() {
			return edad;
		}

		public String getDni() {
			return dni;
		}

		public char getSexo() {
			return sexo;
		}

		public double getPeso() {
			return peso;
		}

		public double getAltura() {
			return altura;
		}

		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}

		protected void setEdad(int edad) {
			this.edad = edad;
		}

		protected void setDni(String dni) {
			this.dni = dni;
		}

		protected void setSexo(char sexo) {
			this.sexo = sexo;
		}

		protected void setPeso(double peso) {
			this.peso = peso;
		}

		protected void setAltura(double altura) {
			this.altura = altura;
		}
// Genero método toString().
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
					+ ", altura=" + altura + ", calcularIMC()=" + calcularIMC() + ", getNombre()=" + getNombre()
					+ ", getEdad()=" + getEdad() + ", getDni()=" + getDni() + ", getSexo()=" + getSexo()
					+ ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			//return getNombre()+ " " +getSexo();    si solo quiero el nombre y sexo
		}
		

		
	}