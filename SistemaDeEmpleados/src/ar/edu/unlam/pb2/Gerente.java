package ar.edu.unlam.pb2;

import java.util.Date;

public class Gerente  extends Empleado {

		private Integer cochera;
		
	
		
		public Gerente(String nombre, Double sueldo, Date cumpleanios, Integer cochera) {
			super(nombre, sueldo, cumpleanios);
			this.cochera=cochera;
		}



		public Integer getCochera() {
			return cochera;
		}



		public void setCochera(Integer cochera) {
			this.cochera = cochera;
		}



		@Override
		public String brindarDetalles(){
			return "Tipo: Gerente, Nombre:"+this.getNombre()+", sueldo:"+this.getSueldo().toString()+", número de cochera:"+this.cochera.toString()+", Cumpleaños:"+this.getCumpleanios().toString();
		}
}
