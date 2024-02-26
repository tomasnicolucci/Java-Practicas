package com.laboratorio;

public class Documento {
	private String numero;
	private	TipoDocumento tipo;
	
	public Documento(String numero, TipoDocumento tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Documento [numero=" + numero + ", tipo=" + tipo + "]";
	}
	
	
	
}
