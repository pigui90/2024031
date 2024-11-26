package model;

public class TipoCuenta {
	private String descripcion;
	private boolean activo;
	
	public TipoCuenta() {
		
	}
	
	public TipoCuenta(String descripcion, boolean activo) {
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
	
	public String mostrarInfo() {
		String activoStr="";
		if(getActivo()) {
			activoStr = "Si";
		}else {
			activoStr = "No";
		}
		return "***************\nDescripcion: " + getDescripcion() + "\nActivo: " + activoStr
				+ "\n***************";
	}
	
	
	
}
