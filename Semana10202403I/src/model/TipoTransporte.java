package model;

public class TipoTransporte {
	private String descripcion;
	private Boolean activo;
	
	public TipoTransporte() {
		
	}
	
	public TipoTransporte(String descripcion, boolean activo) {
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public boolean getActivo() {
		return this.activo;
	}
	
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
