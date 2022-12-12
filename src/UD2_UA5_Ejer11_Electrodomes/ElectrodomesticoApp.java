package UD2_UA5_Ejer11_Electrodomes;

public class ElectrodomesticoApp {
	/*
	 * Crea un array de Electrodomesticos de 10 posiciones. Asigna a cada posición
	 * un objeto de las clases anteriores con los valores que desees. Por ejemplo,
	 * si tenemos un Electrodomestico con un precio final de 300, una lavadora de
	 * 200 y una televisión de 500, el resultado final sera de 1000 (300+200+500)
	 * para electrodomésticos, 200 para lavadora y 500 para televisión. Ahora,
	 * recorre este array y ejecuta el método precioFinal(). Deberá mostrar el
	 * precio de cada clase, es decir, el precio de todas las televisiones por un
	 * lado, el de las lavadoras por otro y la suma de los Electrodomésticos (puedes
	 * crear objetos Electrodomestico, pero recuerda que Televisión y Lavadora
	 * también son electrodomésticos).
	 */

	// Array de Electrodomesticos
	public static void main(String[] args) {
		// Array de Electrodomesticos
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

		// Asignamos cada una de las posiciones como queramos
		listaElectrodomesticos[0] = new Electrodomestico(200, 60, 'C', "Verde");
		listaElectrodomesticos[1] = new Lavadora(150, 30);
		listaElectrodomesticos[2] = new Television(500, 80, 'E', "negro", 42, false);
		listaElectrodomesticos[3] = new Electrodomestico();
		listaElectrodomesticos[4] = new Electrodomestico(600, 20, 'D', "gris");
		listaElectrodomesticos[5] = new Lavadora(300, 40, 'Z', "blanco", 40);
		listaElectrodomesticos[6] = new Television(250, 70);
		listaElectrodomesticos[7] = new Lavadora(400, 100, 'A', "verde", 15);
		listaElectrodomesticos[8] = new Television(200, 60, 'C', "naranja", 30, true);
		listaElectrodomesticos[9] = new Electrodomestico(50, 10);

		// Creamos las variables que usaremos para almacenar la suma de los precios
		double sumaElectrodomesticos = 0;
		double sumaTelevisiones = 0;
		double sumaLavadoras = 0;
		// Deberá mostrar el precio de cada clase, es decir, el precio de todas las
		// televisiones por un lado, el de las lavadoras por otro y la suma de los
		// Electrodomésticos (puedes crear objetos Electrodomestico, pero recuerda que
		// Televisión y Lavadora también son electrodomésticos).
		// Recorremos el array invocando el metodo precioFinal
		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			/*
			 * Cuando una Television o una Lavadora este en la posicion del array actual,
			 * pasara por su clase y por la de electrodomestico, ya que una television es un
			 * electrodomestico. Ejecutamos en cada uno su propia version del metodo
			 * precioFinal
			 */

//			if (listaElectrodomesticos[i] instanceof Electrodomestico) {
//				sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
//			}
//			if (listaElectrodomesticos[i] instanceof Lavadora) {
//				sumaLavadoras += listaElectrodomesticos[i].precioFinal();
//			}
//			if (listaElectrodomesticos[i] instanceof Television) {
//				sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
//			}

			if (listaElectrodomesticos[i].getClass() == Electrodomestico.class) {
				sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i].getClass() == Lavadora.class) {
				sumaLavadoras += listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i].getClass() == Television.class) {
				sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
			}
		}

		// Mostramos los resultados
		System.out.println("La suma del precio de los electrodomésticos es de " + sumaElectrodomesticos + " €");
		System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras + " €");
		System.out.println("La suma del precio de las televisiones es de " + sumaTelevisiones + " €");
	}

}