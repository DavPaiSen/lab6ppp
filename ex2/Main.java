package ex2;

import java.util.ArrayList;

//Template e uma superclasse para que a classe filha possa criar sobre
//Decorator pega uma classe e acrescenta em cima dela
//A diferenca e que template e uma base enquanto decorator e acrescentado em cima da classe original

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        pedidos.add(new pedidoOnline(10, 150.0));
        pedidos.add(new pedidoCriptomoedas(20, 300.0));
        pedidos.add(new pedidoNaLoja(1, 15.0));

        for (Pedido pedido : pedidos) {
            pedido.processa();
        }
    }
}
