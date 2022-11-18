package UD2_UA8_9_Collection_comparable;

public class Television extends Electrodomestico {
    //Sus atributos son resolución (en pulgadas) y smartTV  (booleano),
	//además de los atributos heredados.
	private int resolucion;
	private boolean smartTV;
	
	// Por defecto, la resolución será de 20 pulgadas y el smartTV  será false.
	private final static int RESOLUCION_DEF = 20;
	
	    //Un constructor por defecto.
		public Television() {
			this(Electrodomestico.getPrecioBaseDef(), Electrodomestico.getPesoDef(),
					Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(), getResolucionDef(), false);
		}
        //Un constructor con el precio y peso. El resto por defecto.
		public Television(double precioBase, double peso) {
			this(precioBase, peso, Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(),
					getResolucionDef(), false);
		}
        //Un constructor con la resolución, smartTV  y el resto de atributos heredados.
		//Recuerda que debes llamar al constructor de la clase padre
		public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
				boolean sintonizadorTDT) {
			super(precioBase, peso, consumoEnergetico, color);
			setResolucion(resolucion);
			setSmartTV(sintonizadorTDT);
		}
        //precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara
		//el precio un 30% y si tiene smartTV  , aumentara 50 €. Recuerda
		//que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
		public double precioFinal() {
			// Invocamos el método precioFinal del método padre
			double plus = super.precioFinal();

			// Añadimos el sobrecoste
			if (getResolucion() > 40) {
				plus += super.getPrecioBase() * 0.3;
			}
			if (isSmartTV()) {
				plus += 50;
			}

			return plus;
		}
	
	

	// accesores
		//Método get de resolución y smartTV  
		public static int getResolucionDef() {
			return RESOLUCION_DEF;
		}

		public int getResolucion() {
			return resolucion;
		}

		public boolean isSmartTV() {
			return smartTV;
		}

		protected void setResolucion(int resolucion) {
			this.resolucion = resolucion;
		}

		protected void setSmartTV(boolean smartTV) {
			this.smartTV = smartTV;
		}
	
}
