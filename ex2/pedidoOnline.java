package ex2;

public class pedidoOnline extends Pedido{


    public void processaPagamento() {
        System.out.println("Processando pagamento online");
    }

    public void decideEntrega() {
        System.out.println("Sim, havera entrega");
    }

    public pedidoOnline(int qtdItens, double valorTotal) {
        super(qtdItens, valorTotal);
    }
}
