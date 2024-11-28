package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vectorNumeros[] = new int[5];
		String[] vectorMeses = new String[5];
		//Guardar un valor en una posicion especifica del vector
		vectorNumeros[0] = 55;
		// Mostrar el valor de una posicion en especifico del vector
		System.out.println("Valor del vector en la posicion 0 : " + vectorNumeros[0]);
		String mes;
		// Realizar un ciclo para ir posicion por posicion del vector y guardar un valor en el mismo
		for (int i = 0; i < vectorMeses.length; i++) {
			System.out.println("Digame un mes del año");
			mes = scan.next();
			vectorMeses[i] = mes;
		}
		// Leer el contenido del vector
		for (int i = 0; i < vectorMeses.length; i++) {
			System.out.println("Valor del vector en la posicion " + (i + 1) + ": " + vectorMeses[i]);
		}

		scan.close();

	}

}
