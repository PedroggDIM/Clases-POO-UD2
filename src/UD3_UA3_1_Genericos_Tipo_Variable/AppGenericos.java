package UD3_UA3_1_Genericos_Tipo_Variable;

import java.time.LocalDate;

public class AppGenericos {

	public static void main(String[] args) {
		
		Perro <Character> firulais = new Perro<Character>('A');		
		System.out.println(firulais.getId());
		
        Perro <String> perruno = new Perro<String>("Canino");
        System.out.println(perruno.getId());
        
        Perro<LocalDate> chucho = new Perro<LocalDate>(LocalDate.of(2022, 01, 01));
        System.out.println(chucho.getId());  
        
        Vehiculo coche_1 = new Vehiculo("3199BJJ");
        System.out.println(coche_1.getId());
        
        
	}
}
