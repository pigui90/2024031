package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		boolean seguir = true;
		String menu = "1. Ejercicio 1\n2. Ejercicio 2 \n3. Ejercicio 3\n4. Ejercicio 4\n10. Salir";

		do {
			System.out.println(menu);
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				int valor1;
				int valor2;

				System.out.println("Digite un valor");
				valor1 = scan.nextInt();
				System.out.println("Digite otro ");
				valor2 = scan.nextInt();

				if (valor1 > valor2) {
					int aux = valor1;
					valor1 = valor2;
					valor2 = aux;
				}

				for (int i = valor1; i <= valor2; i++) {
					// if(i % 2 == 0) {
					// System.out.println("El numero es par " + i);
					// }
					if (i % 2 != 0) {
						System.out.println("El numero es impar " + i);
					}

				}

				break;
			case 2:

				break;
			case 10:
				seguir = false;
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (seguir);

		scan.close();
	}

}
