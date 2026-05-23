package org.solid.SRP;

public class PedidoPrinter {
    public void exibir(Pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Produto: " + pedido.getProduto());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}
