package UD2_UA9_u_10b__8_2_Comparator;

import java.util.Comparator;

public class ComaparadorPesos implements Comparator<Electrodomestico>{
	@Override
	public int compare(Electrodomestico o1, Electrodomestico o2) {
		Electrodomestico e1 = (Electrodomestico) o1;
	    Electrodomestico e2 = (Electrodomestico) o2;
	    return (int) (e1.getPeso() - e2.getPeso());
	}	
}
