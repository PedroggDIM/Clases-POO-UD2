package UD2_UA9_u_10c_Ejemplo_Comparator;

import java.util.Comparator;

public class NombreComparator implements Comparator<Persona>{
	
	@Override
	public int compare(Persona per1, Persona per2) {		
		/* para comparar por id o edad
		Persona a1 = (Persona)per1;
		Persona a2 = (Persona)per2;
		 return  (a1.getId() - a2.getId());
		 */
		// para comparar por nombre alfabeticamente
		return per1.getNombre().compareTo(per2.getNombre());					
	}

}
