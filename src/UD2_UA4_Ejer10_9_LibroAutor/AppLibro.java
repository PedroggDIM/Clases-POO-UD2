package UD2_UA4_Ejer10_9_LibroAutor;

import UD2_UA4_Ejer10_9_LibroAutor.Autor.Tipo_Autor;

public class AppLibro {

	public static void main(String[] args) {
		Autor autor1 = new Autor("Pepe", "De Los Palotes", null);
		
		Libro libro1 = new Libro("123456789PO52", "Un libro Cualquiera", autor1, 4000);

		               // en este libro lo instanciamos poniendo el constructor de autor dentro del
				           // constructor de libro
		Libro libro2 = new Libro("123659LL52222", "Aprende programar con Java",
						new Autor("Alfonso", "Jiménes Marín", Tipo_Autor.NARRATIVA), 403);

		// METODO masPaginas2(libro1, libro2)); INDICA CUAL DE LOS LIBROS TIENE MÁS PÁGINAS.
		
		
				// Al ser un método estático es un método de clase y se invoca directamente
				// "llamando" a la clase no a la instancia que es cunado utilizamos el
				// constructor
				System.out.println(Libro.masPaginas2(libro1, libro2));
	}

}
