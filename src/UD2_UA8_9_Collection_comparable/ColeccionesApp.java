package UD2_UA8_9_Collection_comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ColeccionesApp {
	
	public static void main(String[] args) {

		Collection<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

		Electrodomestico electrodomestico1 = new Electrodomestico(200, 60, 'C', "Verde");
		Lavadora lavadora1 = new Lavadora(150, 30);
		Television television1 = new Television(500, 80, 'E', "TV3333negro", 42, false);
		Electrodomestico electrodomestico2 = new Electrodomestico();
		Electrodomestico electrodomestico3 = new Electrodomestico(600, 20, 'D', "gris");
		Lavadora lavadora2 = new Lavadora(300, 40, 'Z', "blanco", 40);
		Television television2 = new Television(250, 70);
		Lavadora lavadora3 = new Lavadora(400, 100, 'A', "verde", 15);
		Television television3 = new Television(200, 60, 'C', "naranja", 30, true);
		Television television4 = new Television(200, 60, 'D', "naranja", 30, true);
		Electrodomestico electrodomestico4 = new Electrodomestico(50, 10);
		

		// boolean add(E elem) => para añadir a la lista
		listaElectrodomesticos.add(electrodomestico1);
		listaElectrodomesticos.add(electrodomestico2);
		listaElectrodomesticos.add(electrodomestico3);
		listaElectrodomesticos.add(electrodomestico4);
		listaElectrodomesticos.add(lavadora1);
		listaElectrodomesticos.add(lavadora2);
		listaElectrodomesticos.add(lavadora3);
		listaElectrodomesticos.add(television1);
		listaElectrodomesticos.add(television2);
		listaElectrodomesticos.add(television3);
		listaElectrodomesticos.add(new Lavadora(100, 100, 'A', "blanca", 10));  // no tiene nombre, solo la referencia en el array

		// boolean remove (Object ob) => elimina un nodo ob de una lista
		listaElectrodomesticos.remove(television3);
		  
		// imprimo
        //listaElectrodomesticos.forEach(System.out::println);
		// void clear() => eliminar todos los nodos de una lista y dejarla vacía
		// listaElectrodomesticos.clear();

		// int size() => número de elementos (o nodos) insertados en una lista
		System.out.println(listaElectrodomesticos.size());

		// boolean isEmpty() => permite saber si una lista está vacía

		System.out.println(listaElectrodomesticos.isEmpty());

		// boolean contains(Object ob) => si un elemento ob determinado está en una
		// lista

		System.out.println(listaElectrodomesticos.contains(television2));

		// String toString() => devuelve una cadena que representa la colección

		System.out.println(listaElectrodomesticos.toString());
		
		//Para obtener el precio.        
        for (Electrodomestico e : listaElectrodomesticos) {
        	System.out.println(e.getPrecioBase());
        }
        
		// boolean conteinsAll(Collection <?> c) =List<Electrodomestico> otrosElectrodomesticos = electrodomesticos;> true si todos los elementos de e
		// están en la colección que hace la llamada
		
		List<Television> televisiones = new ArrayList<>();
		televisiones.add(television1);
		televisiones.add(television2);
		televisiones.add(television3);
		televisiones.add(television4);

		System.out.println(listaElectrodomesticos.containsAll(televisiones));

		// boolean addAll(Collection <? extends E> c) => inserta al final de la
		// colección que hace la llamada todos los nodos de la colección c
               //addAll mete toda la lista.
		listaElectrodomesticos.addAll(televisiones);

		// boolean removeAll(Collections <?> c) => elimina de la colección invocante
		// todos los nodos que estén contenidos en c

		listaElectrodomesticos.removeAll(televisiones);

		// Object[] toArray() ==> <T>T[] toArray(T[] t) => devuelve una tabla de tipo
		// Object/ T con los mismos elementos de la colección
        // toArray() convierte una lista en un array del tipo que era la lista. 
		// se puede  hacer de television casteando en vez de Object.
		Object[] arrayTelevisiones = televisiones.toArray();

		for (Object television : arrayTelevisiones) {
			System.out.println(television);

		}

		// imprimir la lista
		 listaElectrodomesticos.forEach(System.out::println);
///////////////////////////////////////////////////////////////////////////////		 
		System.out.println("***METODOS DE LIST***");
		//DIAPOSITIVA 9.2 MÉTODOS DE LIST
		 List<Electrodomestico> electrodomesticos = new ArrayList<>();
		 
		 electrodomesticos.addAll(listaElectrodomesticos);
		 /*
		  * E get(int indice) =>devuelve el elemento que ocupa el lugar índice
		  *  en la lista, siendo O el índice del primer elemento, como en los arrays.
		  */
		 for(int i=0;i<electrodomesticos.size();i++) {
			  System.out.println(electrodomesticos.get(i));
		 }		
		 /*
		  * E set (int indice, E elem) => guarda el elemento elem en la posición
		  *  índice, machacando el valor que hubiera previamente en esa posición, 
		  *  que es devuelto por el método
		  */
		 electrodomesticos.set(2,  television1);
		 //void add(int indice, E elem) => inserta el valor elem en la posición 
		 //índice, añadiéndose, sin machacar el valor previo.
         electrodomesticos.add(8, television1);
         for(int i=0;i<electrodomesticos.size();i++) {
			  System.out.println(electrodomesticos.get(i));
		 }	
                
///////////////ORDENAR CON sort( ) ///////////////////////////////////////////////         
         
         System.out.println("***ORDENO LA LISTA (por consumo energético) DE TELEVISIONES CON SORT****");
         // con sort() ordenamos la lista de televisiones
         System.out.println("**SIN ORDENAR**");
         televisiones.forEach(System.out::println);
         System.out.println("**ORDENADAS**");
         televisiones.sort(null);  // si le paso null orden por orden NATURAL
         televisiones.forEach(System.out::println);
         
   // LO SIGUIENTE SE VE EN EL  LA PRESENTACION UD2_UA10_Comprator    
         
///////////////////////////////////////////////////////////////////////////////////         
      // Podemos implementar en el mismo método un nuevo comparador para ordenar por
 		// otro criterio
         /*
         System.out.println("** Implementando en el método **");
 		electrodomesticos.sort(new Comparator<Electrodomestico>() {

 			@Override
 			public int compare(Electrodomestico o1, Electrodomestico o2) {

 				return (int) (o1.getPrecioBase() - o2.getPrecioBase());
 			}
 		});

 		electrodomesticos.forEach(System.out::println);
 		System.out.println("*******************************");
         */
		/*
		 * hay una tercera forma que es creando un nuevo comparador en una clase
		 * externa. Esto se usaraá cuando se vaya a utlizar varais veces
		 */

//		ComaparadorPesos comaparadorPesos = new ComaparadorPesos();

//		electrodomesticos.sort(comaparadorPesos);

		// imprimir la lista
//		electrodomesticos.forEach(System.out::println);
 		
/////////////////////////////////////////////////////////////////////////////////////
 		
		// MÉTODOS DE BUSQUEDA
//		System.out.println("MÉTODOS DE BÚSQUEDA");

		// binarySearch() => Búsqueda Binaria. Devuelve indice de la b´suqueda

//		System.out.println(Collections.binarySearch(electrodomesticos, television1));

		// static void swap(List<?> lista, int i, int j) ​intercambia los nodos con
		// índices i y j entre sí.

//		Collections.swap(electrodomesticos, 0, 8);

		// static boolean replaceAll(List<T> lista, valorAntiguo, T valorNuevo)
		// reemplaza el nodo valorAntiguo, en todos los lugares en que aparezca en la
		// lista, por valorNuevo.

//		Collections.replaceAll(electrodomesticos, lavadora3, television3);

		/*
		 * static void fill(List<? super T> lista, T valorDeRelleno) sustituye todos los
		 * valores de los nodos de la lista por el de valorDeRelleno
		 */

		// Collections.fill(electrodomesticos, television2);

		/*
		 * static void copy (List<? super T> destino, List<? extends T> origen) copia
		 * los elementos de la lista origen en la lista destino, empezando por el
		 * principio y sobrescribiendo
		 */

//		otrosElectrodomesticos.addAll(listaElectrodomesticos);
//
//		Collections.copy(electrodomesticos, otrosElectrodomesticos);

		// OTROS METODOS DE INTERES

//		System.out.println("OTROS MÉTODOS");

		/*
		 * static void shuffle(List<?> lista)=> desordena los elementos de lista.
		 */

//		Collections.shuffle(electrodomesticos);

//		otrosElectrodomesticos.forEach(System.out::println);
		/*
		 * void reverse (List<?> lista)=> invierte lista, colocando los nodos en orden
		 * inverso
		 */
//		System.out.println("*******************************");
//		Collections.reverse(electrodomesticos);

//		otrosElectrodomesticos.forEach(System.out::println);

		/*
		 * static T max(Collection<? extends T> col)=> nos devuelve el valor máximo de
		 * una colección según el orden natural (no tiene por qué ser una lista)
		 */
//		System.out.println("*******************************");
//		System.out.println(Collections.max(electrodomesticos));

		/*
		 * static T max(Collection<? extends T> col, Comparator<? super T> comp)=>
		 * devuelve el máximo utilizando comp como criterio de comparación
		 */
 
	}	
}