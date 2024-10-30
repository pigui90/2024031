package model;

public class Transporte {
	String tipoTransporte; // Taxi Bus Tren
	boolean publico; 
	int cantidadPasajerosMaximo;
	double tarifa;
	String recorrido;
	String status;
	String chofer;
	boolean directo;
	String horario;
	int cantidadPasajerosActual;
	int calificacion;
	
	public Transporte() {
		this.tipoTransporte = "";
	}
	
	public String getTipoTransporte() {
		return this.tipoTransporte;
	}
	
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	
}

