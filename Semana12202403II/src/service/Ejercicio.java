package service;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int key = 0;
		do {
			String menu = "1. Ejercicio 1\n2. Ejericio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Salir";
			System.out.println(menu);
			key = scan.nextInt();
			switch (key) {
			case 1:
				int vectorA[] = new int[3];
				int vectorB[] = new int[3];
				int suma[] = new int[3];

				for (int i = 0; i < suma.length; i++) {
					System.out.println("Digame el valor de la posicion " + i + " del vector A");
					vectorA[i] = scan.nextInt();
					System.out.println("Digame el valor de la posicion " + i + " del vector B");
					vectorB[i] = scan.nextInt();
					suma[i] = vectorA[i] + vectorB[i];
				}

				for (int i = 0; i < suma.length; i++) {
					System.out.println("El valor de la posicion " + i + " del vector suma es: " + suma[i]);
				}

				for (int i = 0; i < suma.length; i++) {
					System.out.print(suma[i]);
					if (i < suma.length - 1) {
						System.out.print(" -> ");
					}
				}
				System.out.println();

				break;
			case 2:
				String[] cardinales = new String[4];

				System.out.println("Tamaño del vector " + cardinales.length);
				cardinales[0] = "NORTE";
				cardinales[1] = "ESTE";
				cardinales[2] = "SUR";
				cardinales[3] = "OESTE";

				for (int i = 0; i < cardinales.length; i++) {
					System.out.println("El punto cardinal en la posicion " + i + " es: " + cardinales[i]);
				}

				System.out.println("**********************************");

				for (int i = cardinales.length - 1; i >= 0; i--) {
					System.out.println("El punto cardinal en la posicion " + i + " es: " + cardinales[i]);
				}

				for (int i = cardinales.length - 1; i >= 0; i--) {
					System.out.print(cardinales[i]);
					if (i > 0) {
						System.out.print(" - ");
					}
				}

				System.out.println();
				break;
			case 3:
				double altura[] = new double[5];

				for (int i = 0; i < altura.length; i++) {
					System.out.println("indique una altura");
					altura[i] = scan.nextDouble();
				}

				alturaMayor(altura);

				break;
			case 4:					//	0   1 2  3  4  5
				int calificaciones[] = {50,100,1,20,1,2};
				int temp  = 0;
				String orden = "";
				
				System.out.println("Defina el orden para el ordenamiento ASC o DESC");
				orden = scan.next();
				
				if(orden.equalsIgnoreCase("asc")) {
					// 0  1  2  3  4  5 
					//{1,20,36,50,62,98}
					for (int i = 0; i < calificaciones.length; i++) {
						System.out.println("valor de i -----" + i);
						for(int j = i + 1; j < calificaciones.length; j++) {
							System.out.println("valor de j -----" + j);
							if(calificaciones[i] > calificaciones[j]) {
								temp = calificaciones[j];
								calificaciones[j] = calificaciones[i];
								calificaciones[i] = temp;
								System.out.println("***********");
								imprimirVector(calificaciones);
								System.out.println("valor de i " + i);
								System.out.println("valor de j " + j);
								System.out.println("***********");
							}
							System.out.println("+++++++++++++++");

							imprimirVector(calificaciones);
							System.out.println("++++++++++++");
						}
						System.out.println("///////////////");

						imprimirVector(calificaciones);
						System.out.println("///////////////");

					}
					
				}else {
					if(orden.equalsIgnoreCase("DESC")) {
					//{98,62,50,36,20,1}
						for (int i = 0; i < calificaciones.length; i++) {
							for(int j = i + 1; j < calificaciones.length; j++) {
								if(calificaciones[i] < calificaciones[j]) {
									temp = calificaciones[j];
									calificaciones[j] = calificaciones[i];
									calificaciones[i] = temp;
									imprimirVector(calificaciones);
								}
							}
						}
					}else {
						System.err.println("Se equivoco de forma de ordenamiento");
					}
						
				}
				
				System.out.println("||||||||||||||||||||||");
				imprimirVector(calificaciones);
				System.out.println("||||||||||||||||||||||");
				
				break;
			case 5:
				System.out.println("Saliendo... bye bye");
				break;
			default:
				break;
			}

		} while (key != 5);

		scan.close();

	}

	public static void alturaMayor(double[] altura) {
		int pos = 0;
		double mayor = altura[pos];
		
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] >= mayor) {
				mayor = altura[i];
				pos = i;
			}
		}

		System.out.println("La altura mayor en el vector es: " + mayor + " En la posicion " + pos);

	}
	
	public static void imprimirVector(int[] calificaciones) {
		
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.print(calificaciones[i]);
			if (i < calificaciones.length - 1) {
				System.out.print(" -> ");
			}
		}
		System.out.println();

		

	}
	
	

}
