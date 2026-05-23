package org.solid.SRP;

public class Pedido {
    private String cliente;
    private String produto;
    private double valor;

    public Pedido(String cliente, String produto, double valor) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }
}