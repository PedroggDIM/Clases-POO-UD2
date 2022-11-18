package UD2_UA4_Ejer11_Baraja;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Baraja {
		//Voy comprobando métodos.
	/*public static void main(String[] args) {	
		Baraja b1 = new Baraja();
		b1.crearBarajaEspanola();
		System.out.println(b1.toString());
		b1.barajar();
		//Después de barajar
		System.out.println(b1.toString());
		b1.siguienteCarta();
		System.out.println();
		
	}
     */
	// Atributos de la baraja
	// Tendrá un array de cartas
	private Carta cartas[];
	private String tipoBaraja;
	/*No elimino cartas, la echo fuera
	 Después de barajear pongo la posición en la cero.
	 */
	private int posSiguienteCarta;

	// Método Constructor
	public Baraja() {		
		
	}
// Crear una baraja nueva española
	void crearBarajaEspanola() {
			//Creo la baraja de 40 cartas	
			//Uso el método set de esta clase que establece 
			//Un array de cartas le pongo 40.
			setCartas(new Carta[40]);
			/*Para crear las cartas uso un doble for, el primero son
			 * los 4 palos y el segundo los 10 números
			 * En el segundo for llamo al constructor de Carta
			  con continue quito el 8 y el 9
			   */
			int contador = 0;
			//El for each era así: 
			/* for (int elemento : mi_matriz) {
			    System.out.println(elemento);
		        }
			 */
			//Carta.getPalos( ) obtiene los palos, sería el primer for
			/* ESPADAS (aquí se mete en el segundo for)
			 * OROS
			 * COPAS
			 * BASTOS
			 */
			for (String palo : Carta.getPalos()) {
				for (int i = 1; i <= 12; i++) {
					if (i == 8 || i == 9) {
						continue;
					} else {
						getCartas()[contador] = new Carta(i, palo);
					}
					contador++;
				}
			}
		}

//Creo los métodos accesores
	//public Carta getCartas()[] {	
	public Carta[] getCartas() {
		return cartas;
	}

	public String getTipoBaraja() {
		return tipoBaraja;
	}

	public int getPosSiguienteCarta() {
		return posSiguienteCarta;
	}

	protected void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	protected void setTipoBaraja(String tipoBaraja) {
		this.tipoBaraja = tipoBaraja;
	}

	protected void setPosSiguienteCarta(int posSiguienteCarta) {
		this.posSiguienteCarta = posSiguienteCarta;
	}
	
	

//Método barajar(): cambia de posición todas las cartas aleatoriamente	
	public void barajar() {
		int posAleatoria = 0;
		Carta carta;
		/*
		 * Devuelve un valor int pseudoaleatorio, uniformemente distribuido entre 0
		 * (inclusive) y el valor especificado (exclusivo), extraído de la secuencia de
		 * este generador de números aleatorios. NUNCA REPITE EL MISMO NUMERO
		 */
		Random random = new Random();

		for (int i = 0; i < getCartas().length; i++) {
			posAleatoria = random.nextInt(getCartas().length);
			// OtraForma
			// posAleatoria =(int) (Math.random() * (0 - (getCartas().length + 1)) +
			// (getCartas().length + 1));

			// Intercambiar
			carta = getCartas()[i]; //En la variable carta meto la posición actual
			                       //Enpiezo con la primera carta que la primera vuelta vale cero           
			getCartas()[i] = getCartas()[posAleatoria]; // Lo que hago es darle el valor de aleaoria (1-40)
			 // Una vez que a la primera carta la he asignado el valor de aleatoria que es 
			// lo que quería, a aleatoria le doy el valor de cero (el que tenía carta).
			getCartas()[posAleatoria] = carta;
			/* De esta forma getCartas()[0] getCartas[1] getCartas()[2]...
			 * va cogiendo valores aleatorios 
			 */
		}
		// despues de barajar volvemos a poner la carta al inicio
		setPosSiguienteCarta(0);
	}

//Método siguienteCarta(): devuelve la siguiente carta que está en la baraja,
//cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.	
	public Carta siguienteCarta() {
		Carta carta = null;
          //Si la posición llega al final
		if (posSiguienteCarta == getCartas().length) {
			System.out.println("No hay más cartas");
		} else {
			carta = getCartas()[getPosSiguienteCarta()];
		}
		// setPosSiguienteCarta(posSiguienteCarta++);
		posSiguienteCarta++;
		return carta;	
	}

//cartasDisponibles: indica el número de cartas que aún puede repartir
	public int cartasDisponibles() {
		return getCartas().length - getPosSiguienteCarta();
     }
	/*
	 * darCartas: dado un número de cartas que nos pidan, le devolveremos ese número
	 * de cartas (piensa que puedes devolver). En caso de que haya menos cartas que
	 * las pedidas, no devolveremos nada pero debemos indicárselo al usuario.
	 * 
	 */
     public Carta[] darCartas(int numeroCartas) {
    	 Carta[] cartasDar = null;
           
 		if (numeroCartas > getCartas().length) {
 			System.out.println("No se pueden dar más cartas de las que hay");
 		} else if (cartasDisponibles() < numeroCartas) {
 			System.out.println("No hay suficientes cartas que dar");
 		} else {
 			cartasDar = new Carta[numeroCartas];
 			// recorrer el array para ir llenandolo con las cartas disponibles
 			for (int i = 0; i < cartasDar.length; i++) {
 				cartasDar[i] = siguienteCarta();
 			}
 		}
 		return cartasDar;
	}
//cartasMonton: mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario	
     public void cartasMonton() {
 		if (cartasDisponibles() == getCartas().length) {
 			System.out.println("No se ha sacado ninguna carta");
 		} else {
 			// recorrer el array de las cartas que han salido( hasta siguientePosición)
 			for (int i = 0; i < getPosSiguienteCarta(); i++) {
 				System.out.print(getCartas()[i] + ", ");
 			}
 			/*
 			 * de otra forma =>
 			 * System.out.println(Arrays.toString(Arrays.copyOf(getCartas(),
 			 * getPosSiguienteCarta())));
 			 */
 		}
 		System.out.println("");
 	}

//mostrarBaraja: muestra todas las cartas hasta el final.
//Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.	
     public void mostrarBaraja() {
 		if (getPosSiguienteCarta() == getCartas().length) {
 			System.out.println("No hay cartas que mostrar");
 		} else {
 			for (int i = getPosSiguienteCarta(); i < cartas.length; i++) {
 				System.out.print(getCartas()[i] + " ");
 			}
 		}

 	}
	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + ", tipoBaraja=" + tipoBaraja + ", posSiguienteCarta="
				+ posSiguienteCarta + "]";
	}
	

}
