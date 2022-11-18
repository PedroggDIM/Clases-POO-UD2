package UD2_UA6_Polimorfismo_7_Ejemplo;
public class AppPolimorfismo {

	public static void main(String[] args) {
		
// llama al constructor y en él se establecen 4 patas y la edad 5
		Animal gatoPepe = new Gato(5);
// llama al constructor de la clase perro y le establece 4 patas y que es de caza true
		Animal perroFirulais = new Perro(true);
//llama al constructor de la clase Animal y establece 8 patas
		Animal bicho = new Animal(8);

/* - gatoPepe es un Animal y llama al método ruidoHago() de Animal, pero 
 * usa ruidoHago() de la clase Gato (esto es el POLIMORFISMO)
 * - perroFirulais es un Animal y llama al método ruidoHago() de Animal, pero 
 * usa ruidoHago() de la clase Gato (esto es el POLIMORFISMO)
 * 
 */			 
		gatoPepe.ruidoHago();   
		perroFirulais.ruidoHago();
		bicho.ruidoHago();		
		
	}
}
