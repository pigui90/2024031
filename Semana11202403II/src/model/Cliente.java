package model;

public class Cliente {
	private String nombre;
	private int edad;
	private String direccion;
	private String estadoCivil;

	public Cliente() {
		
	}

	public Cliente(String nombre, int edad, String direccion, String estadoCivil) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
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

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String mostrarInfo() {
		return "------------------\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nDireccion: "+ getDireccion()+"\nEstado civil: "+getEstadoCivil()+"\n------------------";
	}
}
