package model;
//Clase Transporte
public class Transporte {
	// Atributos de la clase Transporte
	private String placa;
	private int capacidad;
	private int tarifa;
	private TipoTarifa tipoTarifa;
	private TipoTransporte tipoTransporte;
	
	
	// Constructor sin parametros o vacio
	public Transporte() {
		
	}
	
	// Constructor sobrecargado o con parametros
	public Transporte(String placa, int capacidad, int tarifa, TipoTarifa tipoTarifa, TipoTransporte tipoTransporte) {
		this.placa = placa;
		this.capacidad = capacidad;
		this.tarifa = tarifa;
		this.tipoTarifa = tipoTarifa;
		this.tipoTransporte = tipoTransporte;
		
	}
	
	/*
	 * Metodos get and set de los atributos de Transporte
	 */
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getTarifa() {
		return this.tarifa;
	}
	
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	
	public TipoTransporte getTipoTransporte() {
		return this.tipoTransporte;
	}
	
	public void setTipoTransporte(TipoTransporte tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	
	public TipoTarifa getTipoTarifa() {
		return this.tipoTarifa;
	}
	
	public void setTipoTarifa(TipoTarifa tipoTarifa){
		this.tipoTarifa = tipoTarifa;
	}
	
	public int gananciaTotal(){
		//return this.capacidad * this.tarifa;
		return getCapacidad() * getTarifa();
	}		

	
	
	
}
