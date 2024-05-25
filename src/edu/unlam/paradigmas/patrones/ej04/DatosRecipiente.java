package edu.unlam.paradigmas.patrones.ej04;

public class DatosRecipiente {
	private String email;
	private String telefono;
	
	public DatosRecipiente(String email, String telefono) {
		this.email = email;
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

}
