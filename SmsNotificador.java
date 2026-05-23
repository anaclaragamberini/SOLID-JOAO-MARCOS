package org.solid.DIP;

public class SmsNotificador implements Notificador {
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}