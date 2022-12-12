package UD2_UA4_Ejer10_6_Pasword;

import java.util.Scanner;

public class PasswordApp {
	 /*Para el ejercicio del Password.
     * 
     *  Persona[] alumnosDIPersonas = {espineira, gil, cesar, new Persona( "Ana", 20, "", 'M', 85, 165)}
     *  Poniendo el toString():
     *  @Override
		  public String toString() {			
			return getNombre()+ " " +getSexo();    si solo quiero el nombre y sexo
     *  Puedo recorrer el array.
     *  System.out.println(Arrays.toString(alumnosDIMPersonas));
     *  
     */
	public static void main(String[] args) {
/*
 * crea una clase clase ejecutable:
Crea un array de Passwords con el tamaño que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posición del array.
La longitud de los Passwords será la que tú quieras.
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato: 
contraseña1 valor_booleano1
contraseña2 valor_bololeano2*/
	
		//Scanner sc = new Scanner(System.in);
		//int tamanio;
		//System.out.println("Introduzca el tamaño del array");
		//tamanio = sc.nextInt();
		
		Password[] passwords = new Password[10];
		boolean[] passwordsEsFuerte = new boolean[passwords.length];

		for (int i = 0; i < passwords.length; i++) {
			// http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
			//En general, para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula:
			//  int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos
			// yo pongo entre 3 y 12 ambos incluidos (que son 10)
			passwords[i] = new Password((int) Math.floor(Math.random() * (12 - 3 + 1) + 3));

			passwordsEsFuerte[i] = passwords[i].esFuerte();

			// para comprobar resultados

			System.out.println("Contraseña " + (i + 1) + " = " + passwords[i] + " y es     : "
					+ (passwordsEsFuerte[i] ? " fuerte" : " débil"));
		}

	}
}
