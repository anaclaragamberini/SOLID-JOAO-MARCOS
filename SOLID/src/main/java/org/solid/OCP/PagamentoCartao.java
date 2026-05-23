package org.solid.OCP;

public class PagamentoCartao implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado no cartão.");
    }
}
