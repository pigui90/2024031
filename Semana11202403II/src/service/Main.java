package service;

import java.util.Scanner;

import model.Cliente;
import model.Cuenta;
import model.TipoCuenta;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menu = "1. Ingresar Tipo Cuenta\n2. Ingresar Cliente\n3. Ingresar Cuenta\n4. Modificar Cliente\n5. Mostrar Tipo Cuenta\n6. Mostrar Cliente\n7. Mostrar Cuenta\n8. Salir";
		TipoCuenta tipoCuenta = new TipoCuenta();
		Cliente cliente = new Cliente();
		Cuenta cuenta = new Cuenta();
		String descripcion;
		int numeroCuenta;
		boolean tieneTarjeta;
		boolean activo;
		int opcion = 0;
		do {
			
			System.out.println(menu);
			opcion = scanner.nextInt();
            scanner.nextLine();// Linea para limpiar buffer
			switch (opcion) {
			case 1:
				System.out.println("Ingrese una descripcion para el tipo de Cuenta");
				descripcion = scanner.nextLine();
				tipoCuenta.setDescripcion(descripcion);
				System.out.println("Ingrese si esta activo si (true) no (false)");
				activo = scanner.nextBoolean();
				tipoCuenta.setActivo(activo);
				tipoCuenta.setDescripcion(descripcion);
				System.out.println(tipoCuenta.mostrarInfo());
				break;
			case 2:
				System.out.println("Indique el nombre del cliente");
				cliente.setNombre(scanner.nextLine());
				
				System.out.println("Indique el estado Civil");
				cliente.setEstadoCivil(scanner.nextLine());
				System.out.println("Indique la direccion del Cliente");
				cliente.setDireccion(scanner.nextLine());
				System.out.println("Indique la edad del cliente");
				cliente.setEdad(scanner.nextInt());
				System.out.println(cliente.mostrarInfo());
				break;
			case 3:
				System.out.println("¿Cual es el numero de la cuenta?");
				numeroCuenta = scanner.nextInt();
				System.out.println("¿Tiene tarjeta? Si (true) / No (false)");
				tieneTarjeta = scanner.nextBoolean();
				cuenta = new Cuenta(numeroCuenta, tieneTarjeta, cliente, tipoCuenta);
				System.out.println(cuenta.mostrarInfo());
				break;
			case 4:
				System.out.println("Indique un nuevo nombre");
				String nombre = scanner.nextLine();
				cliente.setNombre(nombre);
				break;
			case 5:
				System.out.println(tipoCuenta.mostrarInfo());
				break;
			case 6:
				System.out.println(cliente.mostrarInfo());
				break;
			case 7:
				System.out.println(cuenta.mostrarInfo());
				break;
			case 8:
				System.out.println("Saliendo del sistema... apagando todo y vamonos");
				break;

			default:
				System.err.println("Se equivoco, La opcion no existe");
				break;
			}
			
		}while(opcion != 8);
		
		scanner.close();
		
	}

}
