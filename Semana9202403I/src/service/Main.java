package service;

import java.util.Scanner;

import model.Curso;
import model.Persona;
import model.PersonaCurso;
import model.Profesor;

public class Main {

	public static void main(String[] args) {
		String menu = "1.Ingrese una persona\n2. Ingrese un profesor\n3. Ingrese un curso\n4. Ingrese una PersonaCurso\n5. Salir";
		int opcion = 0;
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();
		Curso curso = new Curso();
		Profesor profesor = new Profesor();
		PersonaCurso personaCurso = new PersonaCurso();
		String nombre;
		int edad;
		String direccion;
		double nota;
		String carrera;
		int id;
		boolean activo;

		do {

			System.out.println(menu);
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Indique el nombre de la persona");
				nombre = sc.next();
				System.out.println("Indique la edad de la persona");
				edad = sc.nextInt();
				System.out.println("Indique la direccion de la persona");
				direccion = sc.next();

				persona.setNombre(nombre);
				persona.setDireccion(direccion);
				persona.setEdad(edad);

				break;
			case 2:
				System.out.println("Indique el nombre del profesor");
				profesor.setNombre(sc.next());
				System.out.println("Indique el especialidad del profesor");
				profesor.setEspecialidad(sc.next());
				System.out.println("Indique el codigo del profesor");
				profesor.setCodigo(sc.nextInt());
				break;
			case 3:
				if (!(profesor.getNombre().equals("")) && profesor.getNombre() != null) {
					System.out.println("Indique la nota del curso");
					nota = sc.nextDouble();
					System.out.println("Indique la carrera del curso");
					carrera = sc.next();
					curso = new Curso(nota, carrera, profesor);
				}else {
					System.out.println("Debe ingresar a la opcion 2 primero");
				}

				break;
			case 4:
			
				if (!(curso.getMateria().equals("")) && curso.getMateria() != null && 
					!(persona.getNombre().equals("")) && persona.getNombre() != null) {

					System.out.println("Indique el id de la PersonaCurso");
					id = sc.nextInt();
					System.out.println("Indique si esta activo (true) o no (false)");
					activo = sc.nextBoolean();
					personaCurso.setActivo(activo);
					personaCurso.setId(id);
					personaCurso.setPersona(persona);
					personaCurso.setCurso(curso);
					
					personaCurso.mostrarInformacion();
				}else {
					System.out.println("Debe ingresar a la opcion 1 y 3 primero");
				}
				
				break;
			case 5: 
				System.out.println("Bye Bye");
				break;
			default:
				System.out.println("Opcion incorrecta intente de nuevo HA HA");
				break;
			}

		} while (seguir);
		sc.close();
	}

}
