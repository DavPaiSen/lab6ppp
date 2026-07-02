package ex2;

public class pedidoCriptomoedas extends Pedido{

    public pedidoCriptomoedas(int qtdItens, double valorTotal) {
        super(qtdItens, valorTotal);
    }

    public void processaPagamento() {
        System.out.println("Pagamento na blockchain");
    }

    public void decideEntrega() {
        System.out.println("Havera entrega");
    }
}
