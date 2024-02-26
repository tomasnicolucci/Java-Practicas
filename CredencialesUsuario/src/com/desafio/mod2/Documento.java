package com.desafio.mod2;

public class Documento {
	private String nroDoc;
	private String tipo;
	
	public Documento(String nroDoc, String tipo) {
		this.nroDoc = nroDoc;
		this.tipo = tipo;
	}
	
	public String getNroDoc() {
		return nroDoc;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Documento [nroDoc=" + nroDoc + ", tipo=" + tipo + "]";
	}
}
