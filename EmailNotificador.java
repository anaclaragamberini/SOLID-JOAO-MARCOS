package org.solid.DIP;

public class EmailNotificador implements Notificador {
    public void enviar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
