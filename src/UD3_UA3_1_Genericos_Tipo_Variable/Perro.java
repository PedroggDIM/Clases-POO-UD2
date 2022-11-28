package UD3_UA3_1_Genericos_Tipo_Variable;

public class Perro<T> implements Identificable<T>{

	private T identificador;
	
	
	
	public T getIdentificador() {
		return identificador;
	}

	public void setIdentificador(T identificador) {
		this.identificador = identificador;
	}


	public Perro(T identificador) {
		setIdentificador(identificador);
	}

	@Override
	public T getId() {		
		return getIdentificador();
	}
	
	

}
