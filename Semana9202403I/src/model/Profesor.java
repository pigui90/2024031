package model;

public class Profesor {
	String nombre;
	String especialidad;
	int codigo;
	
	public Profesor(){
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEspecialidad() {
		return this.especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String obtenerInformacion() {
		return "\nNombre " + getNombre() + "\nEspecialidad: " + getEspecialidad() + "\nCodigo " + getCodigo();
	}
}

