package org.solid.OCP;

public class PagamentoDinheiro implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado em dinheiro.");
    }
}
