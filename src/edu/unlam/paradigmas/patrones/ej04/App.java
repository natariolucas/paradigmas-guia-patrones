package edu.unlam.paradigmas.patrones.ej04;

public class App {

	public static void main(String[] args) {
		DatosRecipiente remitente = new DatosRecipiente("contact@mycompany.com", "+5491112345789");
		
		Notificable[] clientes = {
			new EmailClientNotificable(remitente),
			new SMSClientNotificable(remitente)
		};
		
		Notificacion[] notificaciones = {
			new Notificacion(
					new DatosRecipiente("dest1@gmail.com", "123"),
					"notificacion 1"
			),
			new Notificacion(
					new DatosRecipiente("dest2@gmail.com", "456"),
					"notificacion 2"
			),
			new Notificacion(
					new DatosRecipiente("dest3@gmail.com", "789"),
					"notificacion 3"
			)
		};
		
		for (Notificacion notif : notificaciones) {
			for(Notificable cliente : clientes ) {
				cliente.Send(notif.getRecipiente(), notif.getContenido());
			}
			System.out.println("-----");
		}
	}

}
