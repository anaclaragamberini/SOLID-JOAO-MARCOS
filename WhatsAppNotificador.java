package org.solid.DIP;

public class WhatsAppNotificador implements Notificador {
    public void enviar(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}
