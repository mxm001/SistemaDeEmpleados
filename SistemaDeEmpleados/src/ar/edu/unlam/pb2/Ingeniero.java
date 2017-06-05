package ar.edu.unlam.pb2;

import java.util.Date;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre, Double sueldo, Date cumpleanios) {
		super(nombre, sueldo, cumpleanios);
		
	}

	@Override
	public String brindarDetalles() {
		return "Tipo: Ingeniero, Nombre:"+this.getNombre()+", sueldo:"+this.getSueldo().toString()+", Cumpleaños:"+this.getCumpleanios().toString();
	}

}
