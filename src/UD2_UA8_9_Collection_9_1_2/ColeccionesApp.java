package UD2_UA8_9_Collection_9_1_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColeccionesApp {
	
	public static void main(String[] args) {

		Collection<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

		Electrodomestico electrodomestico1 = new Electrodomestico(200, 60, 'C', "Verde");
		Electrodomestico electrodomestico2 = new Electrodomestico(); // llama al constructor sin parámetros que establece valores.
		Electrodomestico electrodomestico3 = new Electrodomestico(600, 20, 'D', "gris");
		Electrodomestico electrodomestico4 = new Electrodomestico(50, 10);
		Lavadora lavadora1 = new Lavadora(150, 30);
		Lavadora lavadora2 = new Lavadora(300, 40, 'Z', "blanco", 40);
		Lavadora lavadora3 = new Lavadora(400, 100, 'A', "verde", 15);
		Television television1 = new Television(500, 80, 'E', "negro", 42, false);		
		Television television2 = new Television(250, 70);	
		Television television3 = new Television(200, 60, 'C', "naranja", 30, true);
		
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

		System.out.println("***Imprimo la lista de electrodomésticos***");  
		// imprimo
        listaElectrodomesticos.forEach(System.out::println);
        
        System.out.println("***Imprimo la lista de electrodomésticos sin television3 (200)");
		// boolean remove (Object ob) => elimina un nodo ob de una lista
		listaElectrodomesticos.remove(television3);
		 listaElectrodomesticos.forEach(System.out::println);
		 
		// void clear() => eliminar todos los nodos de una lista y dejarla vacía
		// listaElectrodomesticos.clear();

		// int size() => número de elementos (o nodos) insertados en una lista
		System.out.println("***Imprimo el número de elementos***");
		System.out.println(listaElectrodomesticos.size());

		// boolean isEmpty() => permite saber si una lista está vacía
		System.out.println(listaElectrodomesticos.isEmpty());

		// boolean contains(Object ob) => si un elemento ob determinado está en una
		System.out.println(listaElectrodomesticos.contains(television2));

		// String toString() => devuelve una cadena que representa la colección
		System.out.println(listaElectrodomesticos.toString());
		
		//Para obtener el precio.        
        for (Electrodomestico e : listaElectrodomesticos) {
        	System.out.println("El precio es: " + e.getPrecioBase());
        }
        
		// boolean conteinsAll(Collection <?> c) => true si todos los elementos de e
		// están en la colección que hace la llamada.		
		List<Television> televisiones = new ArrayList<>();
		televisiones.add(television1);
		televisiones.add(television2);

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
		
        System.out.println("**Imprimo las TV**");
        
		for (Object television : arrayTelevisiones) {
			System.out.println("Televisiones: " +television);
		}
		
        System.out.println("\n");
		System.out.println("**Imprimo lista de electrodomesticos sin las televisiones**");
		 listaElectrodomesticos.forEach(System.out::println);
		 
///////////////////////////////////////////////////////////////////////////////		 
	
		 System.out.println("\n***METODOS DE LIST***");
		//DIAPOSITIVA 9.2 MÉTODOS DE LIST
		 List<Electrodomestico> electrodomesticos = new ArrayList<>();
		 
		 electrodomesticos.addAll(listaElectrodomesticos);
		 /*
		  * E get(int indice) =>devuelve el elemento que ocupa el lugar índice
		  *  en la lista, siendo O el índice del primer elemento, como en los arrays.
		  */
		 System.out.println("**Imrpimo lista electrodomésticos**");
		 for(int i=0;i<electrodomesticos.size();i++) {
			  System.out.println(electrodomesticos.get(i));
		 }
		 System.out.println("\n");
		 /*
		  * E set (int indice, E elem) => guarda el elemento elem en la posición
		  *  índice, machacando el valor que hubiera previamente en esa posición, 
		  *  que es devuelto por el método
		  */
		 // television1 lo había eliminado antes, 
		 // television1 era Television television1 = new Television(500, 80, 'E', "negro", 42, false);
		 // la añado en el puesto 2 (0, 1 , 2)
		 // machaca el elemento de la posición 3 y mete el nuevo.
		 electrodomesticos.set(2,  television1);
		 
		 //void add(int indice, E elem) => inserta el valor elem en la posición 
		 //índice, añadiéndose, sin machacar el valor previo.
		 // television1 la había eliminado previamente, era:
		 // Television television1 = new Television(500, 80, 'E', "negro", 42, false);
		 // y se va a la posicion 9 que es la última.
         electrodomesticos.add(8, television1);
         for(int i=0;i<electrodomesticos.size();i++) {
			  System.out.println(electrodomesticos.get(i));
		 }	
         // E remove(int indice) => elimina el nodo que ocupa el lugar índice y devuelve
 		// el elemento eliminado.
 		 electrodomesticos.remove(0);
 		 System.out.println("\nElectrodomésticos sin el primer elemento");
 		 for(int i=0;i<electrodomesticos.size();i++) {
			  System.out.println(electrodomesticos.get(i));
		 }	
       
 		// int indexOf(Object ob) => devuelve el índice de la primera ocurrencia de ob
 		// en la lista. Si no está, devuelve - 1.
        // electrodomestico1 lo habias borrado
 		System.out.println(electrodomesticos.indexOf(lavadora1));

        /*
         *   int lastIndexOf(Object ob) => hace lo mismo que indexOf(),
         *    pero empezando la búsqueda por el final
         */
 		System.out.println(electrodomesticos.lastIndexOf(lavadora1));
 		/*
         boolean equals (Object otraLista) => las listas,
         tanto ArrayList como LinkedList, se pueden comparar por 
         medio del método equals (), que devuelve true si ambas tienen 
         exactamente los mismos elementos en el mismo orden
         */
 		List<Electrodomestico> otrosElectrodomesticos = electrodomesticos;
		// comprobamos que las dos listas son la misma
		System.out.println("La lista electrodomesticos es igual que la lista otroElectrodomestico: "
				+ electrodomesticos.equals(otrosElectrodomesticos));
		// comprobamos que dos listas no son iguales
		System.out.println("La lista electrodomesticos  NO es igual que la lista televisiones: "
				+ electrodomesticos.equals(televisiones));

         
		 
	}	
}