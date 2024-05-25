package edu.unlam.paradigmas.patrones.ej04;

public class SMSClient {

	public SMSClient() {
	}

	public void sendSMS(String from, String to, String content) {
		System.out.println("SMS Enviado desde " + from + " hacia " + to);
	}
}
