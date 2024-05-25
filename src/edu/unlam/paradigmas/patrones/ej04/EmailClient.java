package edu.unlam.paradigmas.patrones.ej04;

public class EmailClient {

	private String from;
	public EmailClient(String from) {
		this.from = from;
	}

	public void SendEmail(String to, String content) {
		System.out.println("Mail enviado a " + to + " desde " + from);
	}
}
