package ar.edu.unlam.pb2;

import java.util.Date;

public class Secretaria extends Empleado{

	public Secretaria(String nombre, Double sueldo, Date cumpleanios) {
		super(nombre, sueldo, cumpleanios);
	}

	@Override
	public String brindarDetalles() {
		return "Tipo: Secretaria, Nombre:"+this.getNombre()+", sueldo:"+this.getSueldo().toString()+", Cumpleaños:"+this.getCumpleanios().toString();
	}

}
