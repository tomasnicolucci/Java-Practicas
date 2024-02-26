package com.laboratorio;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		char rta;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Persona> personas = new ArrayList<>();

		System.out.println("Ingrese la cantidad de personas");
		int cant = scanner.nextInt();
		
		for(int i=0; i<cant; i++) {
			System.out.println("Ingrese el nombre: ");
			String nombre = scanner.next();
			System.out.println("Ingrese el apellido: ");
			String apellido = scanner.next();
			System.out.println("Ingrese el tipo de documento: (DNI, LC, LE)");
			String tipoDoc = scanner.next();
			System.out.println("Ingrese el numero de documento: ");
			String nroDoc = scanner.next();
			System.out.println("Ingrese la edad: ");
			int edad = scanner.nextInt();
			Persona persona = new Persona(nombre, apellido, new Documento(nroDoc, TipoDocumento.DNI), edad);
			personas.add(persona);
		}
//		System.out.println("Desea agregar a una persona? (S/N)");
//		rta = scanner.nextLine().charAt(0);

//		while (rta == 'S' || rta == 's') {
//			System.out.println("Ingrese el nombre: ");
//			String nombre = scanner.nextLine();
//			System.out.println("Ingrese el apellido: ");
//			String apellido = scanner.nextLine();
//			System.out.println("Ingrese el tipo de documento: (DNI, LC, LE)");
//			String tipoDoc = scanner.nextLine();
//			System.out.println("Ingrese el numero de documento: ");
//			String nroDoc = scanner.nextLine();
//			System.out.println("Ingrese la edad: ");
//			int edad = scanner.nextInt();
//			Persona persona = new Persona(nombre, apellido, new Documento(nroDoc, TipoDocumento.DNI), edad);
//			personas.add(persona);
//			
//			System.out.println("Desea agregar a otra persona? (S/N)"); 
//			rta = scanner.nextLine().charAt(0);	
//		}

		for (Persona p : personas) {
			System.out.println(p.toString());
			p.mayorEdad();
		}
	}

}
