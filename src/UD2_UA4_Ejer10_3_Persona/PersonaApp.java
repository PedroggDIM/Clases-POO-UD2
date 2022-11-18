package UD2_UA4_Ejer10_3_Persona;

public class PersonaApp {

	public static void main(String[] args) {
		
       Persona gil = new Persona();
       Persona espineira = new Persona("Espineria", 35, 'H');
       
       System.out.println(gil);
       System.out.println(espineira);
       System.out.println(espineira.calcularIMC());
       System.out.println(espineira.esMayorEdad());
      
       System.out.println(espineira.getDni());
       
       Persona cesar = new Persona("Cesar", 29, "",' ',72,165);
       System.out.println(cesar.getDni());
       
      
       
	}

}
