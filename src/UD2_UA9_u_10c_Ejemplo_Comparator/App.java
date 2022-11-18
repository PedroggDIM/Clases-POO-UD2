package UD2_UA9_u_10c_Ejemplo_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1,"Jaime",25));
		lista.add(new Persona(2,"Mito",15));
		lista.add(new Persona(3,"Code",29));
		lista.add(new Persona(4,"AAA",24));

// nota: descomentar de la primera(natural), segunda, o tercera forma de ordenacion para comprobar.		
		
//PRIMERA FORMA DE ORDENAR (FORMA NATURAL) 
//En la clase Persona implements Comparable<Persona> y el metodo compareTo(Persona per)
// y en el metodo compareTo(Persona per) ordenamos por edad, por id o nombre		
		// Collections.reverse(lista);	// al reves.	 
       //	Collections.sort(lista);
		//lista.forEach(System.out::println);	
	//	for(Persona p : lista){
	//		System.out.println(p.getEdad() + "-" + p.getNombre());
	//	}	

//SEGUNDA FORMA DE ORDENAR (USANDO SOLO EL MÉTODO)			
		//Collections.sort(lista, new NombreComparator());
/*
		Collections.sort(lista, new Comparator<Persona>(){
			@Override
			public int compare(Persona per1, Persona per2) {
				int rpta = 0;
				if(per1.getEdad() > per2.getEdad()){   // PARA CAMBIAR Y ORDENAR POR Id quitar Edad y poner Id
					rpta = 1;
				}else if(per1.getEdad() < per2.getEdad()){
					rpta = -1;
				}else{
					rpta = 0;
				}
				return rpta;
			}
			
		});
		lista.forEach(System.out::println);    // necesita el toString() para imprimir
*/		
//TERCERA FORMA DE ORDENAR (implementando la clase NombreComparator implements Comparator<Persona>		
		NombreComparator micomparador = new NombreComparator();
		lista.sort(micomparador);
		lista.forEach(System.out::println);
	
		
	}

}