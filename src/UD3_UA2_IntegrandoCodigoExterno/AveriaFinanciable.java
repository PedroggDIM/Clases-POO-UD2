package UD3_UA2_IntegrandoCodigoExterno;

import java.util.Collection;

import com.kzurro.electrodomesticos.Financiable;

import UD3_UA2_IntegrandoCodigoExterno.Averia;
import UD3_UA2_IntegrandoCodigoExterno.Repuesto;

public class AveriaFinanciable extends Averia implements Financiable {

	public AveriaFinanciable(String nombre, float numeroHorasManoObra, Collection<Repuesto> repuestos) {
		super(nombre, numeroHorasManoObra, repuestos);
	}

	public static double getFloatAsDouble(float value) {
		return Double.valueOf(Float.valueOf(value).toString()).doubleValue();
	}

	@Override
	public float getPrecioFactura() {

		return super.getPrecio();
	}

}