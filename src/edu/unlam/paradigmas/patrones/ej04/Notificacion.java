package edu.unlam.paradigmas.patrones.ej04;

public class Notificacion {
	private DatosRecipiente recipiente;
	private String contenido;
	
	public Notificacion(DatosRecipiente recipiente, String contenido) {
		this.recipiente = recipiente;
		this.contenido = contenido;
	}

	public DatosRecipiente getRecipiente() {
		return recipiente;
	}

	public String getContenido() {
		return contenido;
	}

}
