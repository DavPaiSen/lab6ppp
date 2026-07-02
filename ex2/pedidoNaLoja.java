package ex2;

public class pedidoNaLoja extends Pedido{

    public pedidoNaLoja(int qtdItens, double valorTotal) {
        super(qtdItens, valorTotal);
    }
    
    public void processaPagamento() {
        System.out.println("Pagamento fisico no caixa");
    }

    public void decideEntrega() {
        System.out.println("Nao havera entrega");
    }
}
