package org.solid.DIP;

public class SistemaNotificacao {
    private Notificador notificador;

    public SistemaNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificarCliente(String mensagem) {
        notificador.enviar(mensagem);
    }
}
