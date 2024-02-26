package com.desafio.mod2;

public class Usuario {
	private String email;
	private String password;
	
	public Usuario(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", password=" + password + "]";
	}
	
}
