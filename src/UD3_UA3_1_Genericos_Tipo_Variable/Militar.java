package UD3_UA3_1_Genericos_Tipo_Variable;

public class Militar implements Identificable<Integer> {
	
	private int numEscalafon;	
	
	public int getNumEscalafon() {
		return numEscalafon;
	}	

	protected void setNumEscalafon(int numEscalafon) {
		this.numEscalafon = numEscalafon;
	}   

	public Militar() {
	
	}

	public Militar(int numEscalafon) {		
		setNumEscalafon(numEscalafon);
	}

	@Override
	public Integer getId() {	
		return getNumEscalafon();
	}
	 
}
