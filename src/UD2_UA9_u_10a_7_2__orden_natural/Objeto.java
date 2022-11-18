package UD2_UA9_u_10a_7_2__orden_natural;

public class Objeto implements Comparable<Objeto>{
	
	int numero;
	String mensaje;
	char letra;
	boolean bolean;

	public int getNumero() {
		return numero;
	}

	public String getMensaje() {
		return mensaje;
	}

	public char getLetra() {
		return letra;
	}

	public boolean isBolean() {
		return bolean;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public void setBolean(boolean bolean) {
		this.bolean = bolean;
	}

	public Objeto(int numero, String mensaje, char letra, boolean bolean) {
		this.numero = numero;
		this.mensaje = mensaje;
		this.letra = letra;
		this.bolean = bolean;
	}

	public Objeto() {
	}

	@Override
	public String toString() {
		return "getNumero" + getNumero() + ", getMensaje=" + getMensaje() + ", getLetra=" + getLetra() + ", isBolean="
				+ isBolean();
	}

	@Override
	public int compareTo(Objeto o) {	
		 //criterio para ordenar por mensaje (alfabéticamente de ultimo a primero)
		 return o.getMensaje().compareTo(getMensaje());		
		// criterio para ordenar por edades de menor a mayor.
	    //return this.numero - o.getNumero();
		// criterio para ordenar por edades de mayor a menor.
	    //return o.getNumero() - this.numero;
		
		
	}

}
