package UD2_UA5_Ejer11_Electrodomes;

import java.security.PublicKey;
import java.security.KeyStore.PrivateKeyEntry;

import javax.swing.JOptionPane;

public class Electrodomestico {
	// por defecto, el color será blanco, el consumo energético sera F, 
	// el precioBase es de 100 € y el peso de 5 kg
	private final static String COLOR_DEF = "blanco";
	private final static char CONSUMO_ENERGETICO_DEF = 'F';
	private final static double PRECIO_BASE_DEF = 100;
	protected final static double PESO_DEF = 5;
	private final static String[] COLORES = { "blanco", "negro", "rojo", "azul", "gris" };
	
	
    // atributos
	private double precioBase;
	private String color;
	private char consumoEnergetico; // Se podría declarar también como un Enum
	private double peso;
	
    // constructor por defecto.	
	public Electrodomestico() {
		this(getPrecioBaseDef(), getPesoDef(), getConsumoEnergeticoDef(), getColorDef());		
	}
    // constructor con precio y peso; el resto por defecto (consumo, color)
	public Electrodomestico(double precio, double peso) {
		this(precio, peso, getConsumoEnergeticoDef(), getColorDef());
	}
    // constructor con todos los atributos
	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		setPrecioBase(precioBase);                   //this.precioBase = precioBase;
		setPeso(peso);                              //this.peso = peso;	
		setConsumoEnergetico(consumoEnergetico);   //this.consumoEnergetico = consumoEnergetico;
		setColor(color);                          //this.color = color;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}
	
    // metodo: comprobarConsumoEnergetico(char consumoEnergetico) comprueba que la letra es correcta,
	// sino es correcta usará la letra por defecto. Se invoca al crear el objeto y no será visible
	private void comprobarConsumoEnergetico(char consumoEnergetico) {
		if(consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' ||
		   consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			setConsumoEnergetico(consumoEnergetico);
		} else {
			setConsumoEnergetico(getConsumoEnergeticoDef());
		}
		
	}	
	
	//comprobarColor(String color): comprueba que el color es correcto, sino lo es usa 
	//el color por defecto. Se invocara al crear el objeto y no será visible
	public void comprobarColor(String color) {
		if(color.equals("blanco") || color.equals("negro") || color.equals("rojo") ||
				color.equals("azul") || color.equals("gris")) {
					setColor(color);
				} else {
					setColor(COLOR_DEF);
				}
	}
	/*
	 * precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
LETRA	PRECIO
A	   100€
B	   80€
C	   60 €
D	   50 €
E	   30€
F	   10€
PESO	            PRECIO
Entre 0 y 19 kg	    10 €
Entre 20 y 49 kg	50 €
Entre 50 y 79 kg	80 €
Mayor que 80 kg	    100 € 
	 */
	public double precioFinal() {
		double plus = 0;
		switch (consumoEnergetico) {
		case 'A':
			plus += 100;
			break;
		case 'B':
			plus += 80;
			break;
		case 'C':
			plus += 60;
			break;
		case 'D':
			plus += 50;
			break;
		case 'E':
			plus += 30;
			break;
		case 'F':
			plus += 10;
			break;
		}

		if (peso >= 0 && peso < 19) {
			plus += 10;
		} else if (peso >= 20 && peso < 49) {
			plus += 50;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80;
		} else if (peso >= 80) {
			plus += 100;
		}

		return precioBase + plus;
	}	
	
	// metodos accesores
	public static String getColorDef() {
		return COLOR_DEF;
	}
	
	public static char getConsumoEnergeticoDef() {
		return CONSUMO_ENERGETICO_DEF;
	}
	public static double getPrecioBaseDef() {
		return PRECIO_BASE_DEF;
	}
	public static double getPesoDef() {
		return PESO_DEF;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	protected void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	protected void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	protected void setPeso(double peso) {
		this.peso = peso;
	}	
	
}
