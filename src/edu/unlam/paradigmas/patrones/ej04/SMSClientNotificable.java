package edu.unlam.paradigmas.patrones.ej04;

public class SMSClientNotificable implements Notificable {
	private SMSClient adaptee;
	private String telefonoOrigen;
	
	public SMSClientNotificable(DatosRecipiente remitente) {
		this.adaptee = new SMSClient();
		this.telefonoOrigen = remitente.getTelefono();
	}

	@Override
	public void Send(DatosRecipiente destinatario, String contenido) {
		this.adaptee.sendSMS(this.telefonoOrigen, destinatario.getTelefono(), contenido);
	}

}
