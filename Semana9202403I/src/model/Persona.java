package model;

public class Persona {
	String nombre;
	int edad;
	String direccion;
	public Persona(){
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String obtenerInformacion() {
		return "\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nDireccion: " + getDireccion(); 
	}
	
	
}
