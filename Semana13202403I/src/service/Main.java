package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String paises[][] = new String[2][3]; 
		Scanner scan = new Scanner(System.in);
		paises[0][0] = "Costa Rica";
		
		System.out.println("El primer pais es : " + paises[0][0]);
		for(int i = 0; i < 2; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("indique un pais: ");
				paises[i][j] = scan.nextLine();
			}
		}
		
		for(int i = 0; i < 2; i ++) {
			System.out.print("|  ");
			for(int j = 0; j < 3; j++) {
				System.out.print(paises[i][j] + "   ");
			}
			System.out.println("  |");
		}
		
	}

}
