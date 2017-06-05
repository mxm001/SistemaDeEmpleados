package ar.edu.unlam.pb2;

import java.util.Date;

public class Director extends Empleado{
	private Integer cochera;
	private Double gastoVehiculo;
	
	public Integer getCochera() {
		return cochera;
	}
	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}
	public Double getGastoVehiculo() {
		return gastoVehiculo;
	}
	public void setGastoVehiculo(Double gastoVehiculo) {
		this.gastoVehiculo = gastoVehiculo;
	}
	public Director(String nombre, Double sueldo, Date cumpleanios,Integer cochera, Double gastoVehiculos) {
		super(nombre, sueldo, cumpleanios);
		this.cochera= cochera;
		this.gastoVehiculo=gastoVehiculos;
	}
	
	@Override
	public String brindarDetalles() {
		return "Tipo: Director, Nombre:"+this.getNombre()+", sueldo:"+this.getSueldo().toString()+", número de cochera:"+this.cochera.toString()+", Gasto para vehiculos:"+this.getGastoVehiculo().toString()+", Cumpleaños:"+this.getCumpleanios().toString();
	}
	

}
