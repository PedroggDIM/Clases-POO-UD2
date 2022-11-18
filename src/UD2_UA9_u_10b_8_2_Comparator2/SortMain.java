package UD2_UA9_u_10b_8_2_Comparator2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SortMain {

	public static void main(String[] args) {
		List<String> listaStrings = Arrays.asList("a", "c", "b", "ab");
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
		
		
// PRIMERA FORMA DE ORDENAR implements Comparable y el compareTo() en la otra clase		
//ESTA ES LA FORMA NATURAL.		
		 //listaObjetos.sort(null);  // si le paso null orden por orden NATURAL
		 //listaObjetos.forEach(System.out::println);
		 
//SEGUNDA FORMA DE ORDENAR. ( NO NATURAL )
//Comparamos y ordenamos pero  esta vez sin el orden natural, con el método 
//usamos  el método (es solo lo que hay en este método e imprimirlo)
		listaObjetos.sort(new Comparator<Objeto>() {

			@Override
			public int compare(Objeto o1, Objeto o2) {
            // ordeno por Mensaje por abecedario preferencia
				return o1.getMensaje().compareTo(o2.getMensaje());
				//ordeno por numero
			//	return  (o1.getNumero() - o2.getNumero());
			//	return  (o2.getNumero() - o1.getNumero());
				
			}
		});   
		listaObjetos.forEach(System.out::println);

//TERCERA FORAM DE ORDENAR ( NO NATURAL )
//Creamos la clase ComparadorString que implements Comparator<Objeto>
//Implementamos el metodo y ordenamos por el atributo		
//		ComparadorString comparador = new ComparadorString();
//		listaObjetos.sort(comparador);
//		listaObjetos.forEach(System.out::println);

		//listaObjetos.sort((o1, o2) -> o1.compareTo(o2));
		
		
		
		

	}
}
