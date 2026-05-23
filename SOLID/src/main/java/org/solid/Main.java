package org.solid;

import org.solid.DIP.SistemaNotificacao;
import org.solid.DIP.WhatsAppNotificador;
import org.solid.LSP.Pizza;
import org.solid.LSP.Produto;
import org.solid.OCP.Pagamento;
import org.solid.OCP.PagamentoPix;
import org.solid.SRP.Pedido;
import org.solid.SRP.PedidoPrinter;
import org.solid.SRP.PedidoRepository;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Ana", "Pizza", 45.00);

        PedidoRepository repository = new PedidoRepository();
        PedidoPrinter printer = new PedidoPrinter();

        repository.salvar(pedido);
        printer.exibir(pedido);

        Pagamento pagamento = new PagamentoPix();
        pagamento.pagar(pedido.getValor());

        Produto produto = new Pizza();
        produto.exibirInformacoes();

        SistemaNotificacao sistema = new SistemaNotificacao(new WhatsAppNotificador());
        sistema.notificarCliente("Seu pedido saiu para entrega!");
    }
}
