package UD2_UA5_Ejer11_Electrodomes;

public class Lavadora extends Electrodomestico {
   
    //Su atributo es carga ( además de los atributos heredados).
     //Por defecto, la carga es de 5 kg. Usa una constante para ello.
   
	private final static int CARGA_DEF = 5;
	private int carga;
	
	// constructor por defecto, llama al constructor por defecto de
	// la superclase y establece también la carga por defecto.
	public Lavadora() {
		super();           
		this.carga = CARGA_DEF;
	}
	/*// en la sulucion viene así(parece ser lo mismo)
	public Lavadora() {
		this(Electrodomestico.getPrecioBaseDef(), Electrodomestico.getPesoDef(),
				Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(), getCargaDef());
	}
	*/
	// Un constructor con el precio y peso. El resto por defecto.
	public Lavadora(double precioBase, double peso) {
		this(precioBase, peso, Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(), CARGA_DEF);

	}

	// Un constructor con la carga y el resto de atributos heredados.
	// Recuerda que debes llamar al constructor de la clase padre.
	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
		super(precioBase, peso, consumoEnergetico, color);
		this.carga = carga;
	}
	
	// metodos accesores
	public static int getCargaDef() {
		return CARGA_DEF;
	}
	
	public double getCarga() {
		return carga;
	}
	protected void setCarga(int carga) {
		this.carga = carga;
	} 
	//metodo precioFinal() si tiene una carga mayor de 30 kg, aumentara el precio 50 €, 
		//sino es así no se incrementara el precio. Llama al método padre y añade el código
		//necesario. Las condiciones que hemos visto en la clase 
		//Electrodomestico también deben afectar al precio.
		public double precioFinal() {
			// Invocamos el método precioFinal del método padre
			double plus = super.precioFinal();
			// añadimos el plus por la carga
			if (getCarga() > 30) {
				plus += 50;
			}

			return plus;
		}		
}
