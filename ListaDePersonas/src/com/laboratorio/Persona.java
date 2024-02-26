package com.laboratorio;

public class Persona {
	private String nombre;
	private String apellido;
	private Documento documento;
	private int edad;
	
	public Persona(String nombre, String apellido, Documento documento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
	}
	
	public void mayorEdad() {
		if(edad >= 18) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad
				+ "]";
	}
	
	
	
}
