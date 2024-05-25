package edu.unlam.paradigmas.patrones.ej04;

public class EmailClientNotificable implements Notificable{
	private EmailClient adaptee;

	public EmailClientNotificable(DatosRecipiente remitente) {
		this.adaptee = new EmailClient(remitente.getEmail());
	}

	@Override
	public void Send(DatosRecipiente destinatario, String contenido) {
		this.adaptee.SendEmail(destinatario.getEmail(), contenido);
	}

}
