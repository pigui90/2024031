package service;

import model.TipoTarifa;
import model.TipoTransporte;
import model.Transporte;

public class Main {

	public static void main(String[] args) {

		String descripcion = "Publico";
		TipoTransporte tipoTransporte = new TipoTransporte(descripcion, true);

		TipoTarifa tipoTarifa = new TipoTarifa();
		tipoTarifa.setActivo(false);
		tipoTarifa.setDescripcion("Especial");

		Transporte transporte = new Transporte();
		transporte.setCapacidad(10);
		transporte.setPlaca("ASD-123");
		transporte.setTarifa(1000);
		transporte.setTipoTarifa(tipoTarifa);
		transporte.setTipoTransporte(tipoTransporte);

		System.out.println(transporte.gananciaTotal());
		System.out.println(tipoTransporte.getDescripcion());
		int capacidad = transporte.getCapacidad();
		int tarifa = transporte.getTarifa();

		System.out.println("la ganancia del transporte " + transporte.getPlaca() + " es: " + (capacidad * tarifa));

	}

}
