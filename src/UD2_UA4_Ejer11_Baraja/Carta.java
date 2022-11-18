package UD2_UA4_Ejer11_Baraja;

/*
 * baraja de cartas.
Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas)
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 Va a hacer una baraja de cartas españolas orientado a objetos.
Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas)
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
***De aquí ya deduzco que necesito una clase Carta y otra Baraja (que será un array de Cartas)****. 
 */
public class Carta {
	public static final String[] PALOS = { "ESPADAS", "OROS", "COPAS", "BASTOS" };
    //Una carta puede tener número y palo.
	private int numero;
    private String palo;
    
    //Constructor
	public Carta(int numero, String palo) {		
		this.numero = numero;
		this.palo = palo;
	}

	public Carta() {
		
	}
	//Métodos de acceso

	public static String[] getPalos() {
		return PALOS;
	}

	public int getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected void setPalo(String palo) {
		this.palo = palo;
	}
	//Método toString( )

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	   
    
}
