package UD2_UA4_Ejer10_9_LibroAutor;

public class Autor {
	
	public enum Tipo_Autor {
		/**
		 * Un enumerado (o Enum) es una clase "especial" (tanto en Java como en otros
		*	lenguajes) que limitan la creación de objetos a los especificados
		*	explícitamente en la implementación de la clase. La única limitación que
		*	tienen los enumerados respecto a una clase normal es que si tiene
		*	constructor, este debe de ser privado para que no se puedan crear nuevos
		*	objetos.
		 * @see pag 208 Aprende a programar con Java, JIMENEZ MARIN, A. y otros. Ed PARANINFO*
		 */
		NARRATIVA, LIRICA, DRAMATICA, POESIA, TEATRO, ANTOLOGIA, OTROS;
	}	
	
	//private final static String TIPO_AUTOR_PORFEF = "OTROS";
	
	private String nombre;
	private String Apellidos;
	private Tipo_Autor tipoAutor;
	
	
	// Constructor por defecto, con el this llama al segundo y en el segundo si el 
	// Tipo_Autor es null  establece OTROS.
		public Autor() {
			this("", "", null);
		}

		public Autor(String nombre, String apellidos, Tipo_Autor tipoAutor) {
			setNombre(nombre);
			setApellidos(apellidos);
			setTipoAutor(tipoAutor == null ? Tipo_Autor.OTROS : tipoAutor);						              
			}
			

	// métodos accesores
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public Tipo_Autor getTipoAutor() {
		return tipoAutor;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	protected void setTipoAutor(Tipo_Autor tipoAutor) {
		this.tipoAutor = tipoAutor;
	}

	// métodos sobreescritos

	@Override
	public String toString() {
		return "Autor: \n" + getNombre() + " " + getApellidos() + ", de " + getTipoAutor();
	}

}