package model;

public class PersonaCurso {

	int id;
	Persona persona;
	Curso curso;
	boolean activo;

	public PersonaCurso() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public boolean getActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String mostrarInformacion() {
		return "Id: " + getId() + "\nActivo: " + getActivo() + "\nInfo Curso*******\n" + getCurso().obtenerInformacion()+ "\nInfo Persona*******\n" + getPersona().obtenerInformacion();
	}
	
}
