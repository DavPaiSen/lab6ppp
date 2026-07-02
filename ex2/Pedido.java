package ex2;

public abstract class Pedido {
    private int qtdItens;
    private double valorTotal;


    public Pedido(int qtdItens, double valorTotal) {
        this.qtdItens = qtdItens;
        this.valorTotal = valorTotal;
    }

    public abstract void processaPagamento();

    public abstract void decideEntrega();

    public void processa() {
        decideEntrega();
        processaPagamento();
    }
}