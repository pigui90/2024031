package model;

public class Cuenta {
	private int numeroCuenta;
	private boolean tieneTarjeta;
	private Cliente cliente;
	private TipoCuenta tipoCuenta;
	
	
	public Cuenta() {
	}
	
	public Cuenta(int numeroCuenta, boolean tieneTarjeta, Cliente cliente, TipoCuenta tipoCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.tieneTarjeta = tieneTarjeta;
		this.cliente = cliente;
		this.tipoCuenta = tipoCuenta;
	}
	
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public boolean getTieneTarjeta() {
		return this.tieneTarjeta;
	}
	
	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public TipoCuenta getTipoCuenta() {
		return this.tipoCuenta;
	}
	
	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	public String mostrarInfo() {
		String tieneTarjetaStr="" ;
		if(getTieneTarjeta()) {
			tieneTarjetaStr = "Si";
		}else {
			tieneTarjetaStr = "No";
		}
		return "/////////////\nNumero Cuenta: "+getNumeroCuenta()+"\nTiene tarjeta: "+tieneTarjetaStr+"\nTipo Cuenta\n" +getTipoCuenta().mostrarInfo()+"\nCliente\n"+ getCliente().mostrarInfo()+"\n";
	}
	
	
}
