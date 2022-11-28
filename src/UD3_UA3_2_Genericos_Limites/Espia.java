package UD3_UA3_2_Genericos_Limites;

public class Espia implements Alistable, ConRazocinio {

	public Espia() {
	}

	@Override
	public String getPuesto() {
		return "Pasar información";
	}

	@Override
	public String getPensamiento() {
		return "Lo importante es la Información";
	}

}