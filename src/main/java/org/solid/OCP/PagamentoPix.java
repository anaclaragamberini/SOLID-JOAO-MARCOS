package org.solid.OCP;

public class PagamentoPix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}