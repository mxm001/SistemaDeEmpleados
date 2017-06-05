package ar.edu.unlam.pb2;

import java.util.Date;

public abstract class Empleado {
	protected String nombre;
	protected Double sueldo;
	protected Date cumpleanios;
	
	
	public Empleado(String nombre, Double sueldo, Date cumpleanios){
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.cumpleanios=cumpleanios;
	}


	public abstract String brindarDetalles();


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getSueldo() {
		return sueldo;
	}


	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}


	public Date getCumpleanios() {
		return cumpleanios;
	}


	public void setCumpleanios(Date cumpleanios) {
		this.cumpleanios = cumpleanios;
	}
	



	
	
}
