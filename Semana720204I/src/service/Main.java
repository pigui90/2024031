package service;

import java.util.Scanner;

import model.Transporte;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Transporte transporte = new Transporte();
		String tipoTransporte = "";
		int edad = 0;
		
		
		System.out.println("Hola este es mi primer programa");
		System.out.println(transporte.getTipoTransporte());
		transporte.setTipoTransporte("TREN");
		System.out.println(transporte.getTipoTransporte());
		transporte.setTipoTransporte("BUS");
		System.out.println(transporte.getTipoTransporte());
		System.out.println("Indique el tipo de transporte");
		tipoTransporte = scanner.next();
		transporte.setTipoTransporte(tipoTransporte);
		System.out.println("El tipo de transporte digitado por el usuario es: " + transporte.getTipoTransporte());
		scanner.close();
	}

}
