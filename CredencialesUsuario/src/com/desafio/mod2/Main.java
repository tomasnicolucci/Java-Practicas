package com.desafio.mod2;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static final Scanner scanner = new Scanner(System.in);
	static final String dominio = "dominio.com";
	static final String[] simbolos = {"*", ".", "-", "_"};
	static final String[] documentos = {"DNI", "LC", "LE", "PA", "CI"};
	static final String mensajeDocumentos = "\n\t1-Documento Nacional de Identidad -DNI \n\t2-Libreta Cívica - "
			+ "LC \n\t3-Libreta de Enrolamiento - LE \n\t4-Pasaporte - PAS \n\t5-Cédula de Identidad -CI \n";
	static int cantPersonas;
	
	public static void main(String[] args) {
		
		// PARTE 1: CREDENCIALES DE USUARIO
		String email;
		String password;
		do {
		System.out.println("Ingrese el correo electronico: ");
		email = scanner.nextLine();
		}while(!emailValid(email));
		
		do {
			System.out.println("Ingrese la clave: ");
			password = scanner.nextLine();
		}while(!passwordValid(password));
		
		Usuario user = new Usuario(email, password);
		System.out.println(user.toString());
		
		//PARTE 2: DATOS PERSONALES
		
		int i=0;
		System.out.println("Indique la cantidad de personas: ");
		cantPersonas = scanner.nextInt();
		Persona personas[] = new Persona[cantPersonas];
		while(i<cantPersonas) {
			boolean existePersona = false;
			String tipoDoc;
			String nroDoc;
			System.out.println("Persona [" + (i+1) + "]");
			System.out.println("Ingrese el nombre");
			String nombre = scanner.next();
			System.out.println("Ingrese el apellido");
			String apellido = scanner.next();
			do {
				existePersona = false;
				System.out.println("Tipo de documento de " + nombre + " " + apellido);
				System.out.print(mensajeDocumentos);
				System.out.println("Tipo: ");
				int tipo = scanner.nextInt();
				tipoDoc = documentos[tipo-1];
				System.out.println("Numero de documento: ");
				nroDoc = scanner.next();
				
				if(personas.length > 0) {
					for(Persona p : personas) {
						if(p != null && p.getTipoDoc().equals(tipoDoc) && p.getNroDoc().equals(nroDoc)) {
							existePersona = true;
							System.out.println("La persona ya existe, vuelva a ingresar");
						}
					}
				}
			}while(existePersona);
			
			personas[i] = new Persona(nombre, apellido, new Documento(nroDoc, tipoDoc));
			i++;
		}
		for(Persona p : personas) {
			System.out.println(p.toString());
		}
	}


	private static boolean emailValid(String email) {
		boolean isValid = false;
		try {
			String[] domain = email.split("@");
			if(domain[1].equals(dominio)) {
				isValid = true;
			}else {
				System.out.println("Email invalido, ingrese nuevamente");
			}
		}catch(Exception e) {
			System.out.println("Email invalido, ingrese nuevamente");
		}
		return isValid;
	}
	
	private static boolean passwordValid(String password) {
		boolean isValid = false;
		try {
			boolean contieneSimbolo = false;
			int i = 0;
			String primeraLetra = password.substring(0, 1);
			boolean iniciaMayus = primeraLetra.toUpperCase().equals(primeraLetra);
			while(!contieneSimbolo && i < simbolos.length) {
				if(password.contains(simbolos[i])) {
					contieneSimbolo = true;
				}else {
					i++;
				}
			}
			if(contieneSimbolo && iniciaMayus) {
				isValid=true;
			}else {
				System.out.println("Clave invalida, ingrese nuevamente");
			}
		}catch(Exception e) {
			System.out.println("Clave invalida, ingrese nuevamente");
		}
		return isValid;
	}

}
