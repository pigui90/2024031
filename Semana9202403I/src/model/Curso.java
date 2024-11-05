package model;

public class Curso {
	double nota;
	String materia;
	Profesor profesor;
	
	public Curso(){
		
	}
	
	public Curso(double nota, String materia, Profesor profesor) {
		this.nota = nota;
		this.materia = materia;
		this.profesor = profesor;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public String obtenerInformacion() {
		return "\nNota: " + getNota() + "\nMateria: " + getMateria() + "\nProfesor: " + getProfesor().obtenerInformacion(); 
	}

}
