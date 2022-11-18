package UD2_UA5_9_Ejem_Abstrac;

public class PoligonoApp {

	public static void main(String[] args) {
		
		Poligono cuadrado = new Cuadrado("ROJO", 2);
		System.out.println(cuadrado.calcularArea());

		Cuadrado cuadrado2 = new Cuadrado("AZUL", 4);
		System.out.println(cuadrado2.calcularArea());

		Triangulo triangulo = new Triangulo("VERDE", 12, 10);
		System.out.println(triangulo.calcularArea());

//CLASE ANÓNIMA
/*Permite declarar una clase e instanciarla en la pequeña parte de código
 * donde nos haga falta haciendo nuestro código más legible
 * Es una clase SIN NOMBRE
 * Solucionan situaciones en als que necesitaremos un objeto que podría usar
 * un tipo prácticamente igual a otro ya creado, salvo por un pequeñísimo cambio
 * que ademas solo vamos a utilizar en ese objeto en un punto concreto de
 * nuestro codigo y nunca mas nos interesara 		
 */
	
		System.out.println("**CLASE ANONIMA***");
// pentagono es la clase anonima	
 Poligono pentagono = new Poligono() {

	@Override
	public double calcularArea() {		
		return 5;
	}
		
 };		
// fin clase anonima		

	}

}
