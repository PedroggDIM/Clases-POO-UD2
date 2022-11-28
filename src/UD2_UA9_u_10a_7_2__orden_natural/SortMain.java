package UD2_UA9_u_10a_7_2__orden_natural;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortMain {

	public static void main(String[] args) {
		
		//  Construyo una lista List con cadenas de caracteres tipo String a partir de Arrays.asList
		List<String> listaStrings = Arrays.asList("a", "c", "b", "ab");
		
	              //	for(String lis : listaStrings) {
	                 //		System.out.println(lis);
	                     //	}
		Collection<String> strings = listaStrings;

		System.out.println(strings);

		listaStrings.sort(null);

		List<Objeto> listaObjetos = new ArrayList<>();

		listaObjetos.add(new Objeto(-15, "opli", 'p', true));
		listaObjetos.add(new Objeto(5, "hola", 'A', false));
		listaObjetos.add(new Objeto(6, "Hola", 'a', true));
		listaObjetos.add(new Objeto(0, "pepe", 'B', false));
		listaObjetos.add(new Objeto(10, "tio", 'C', true));
		listaObjetos.add(new Objeto(-5, "kjnj", 'z', false));
        
		// para la ordenacion por mensaje
		 listaObjetos.sort(null);
		// para ordenar por lo que esté puesto en el metodo compareTo()
		// si es por mensaje .sort ordena por orden alfabetico de ultimo a primero
		///                  .reverse ordena por orden alfabetico  de primero a ultimo
		//Collections.sort(listaObjetos);
		Collections.reverse(listaObjetos);
        //Es necesario implementar la interface Comparable  para poder ordenar por orden Natural 
		listaObjetos.forEach(System.out::println);

	}
}
