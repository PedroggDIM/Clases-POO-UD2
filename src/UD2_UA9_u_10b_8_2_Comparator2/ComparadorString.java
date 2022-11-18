package UD2_UA9_u_10b_8_2_Comparator2;

import java.util.Comparator;

import UD2_UA9_u_10b__8_2_Comparator.Electrodomestico;

public class ComparadorString implements Comparator<Objeto> {

	@Override
	public int compare(Objeto o1, Objeto o2) {
		
		//return o1.getMensaje().compareTo(o2.getMensaje());
		Objeto e1 = (Objeto) o1;
	    Objeto e2 = (Objeto) o2;
		 return  (e1.getNumero() - e2.getNumero());
	      //return  (e2.getNumero() - e1.getNumero());		
	}
}
