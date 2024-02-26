package com.desafio.mod2;

public class Persona {
	private String nombre;
	private String apellido;
	private Documento documento;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(String nombre, String apellido, Documento documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}

	public String getTipoDoc() {
		return documento.getTipo();
	}
	
	public String getNroDoc() {
		return documento.getNroDoc();
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + "]";
	}
	
	
}
