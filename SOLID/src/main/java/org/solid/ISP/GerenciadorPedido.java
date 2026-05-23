package org.solid.ISP;

import org.solid.SRP.Pedido;

public class GerenciadorPedido implements PedidoService {
    public void criarPedido(Pedido pedido) {
        System.out.println("Pedido criado para " + pedido.getCliente());
    }
}
