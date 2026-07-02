import java.util.ArrayList;

public class Main { // tem um commit chamado ex1 feito por mim, nao e que eu colo de ninguem esses exercicios, e que o primeiro eu geralmente tento deixar bem igual ao feito na sala
    public static void main(String[] args) {
        ArrayList<Bebida> bebidas = new ArrayList<>();
        bebidas.add(new Cafe());
        bebidas.add(new Cha());
        bebidas.add(new Capuccino(new Cafe()));

        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getClass());
            bebida.preparaBebida();
            bebida.colocarNaXicara();
            bebida.adicionaCondimentos();
            System.out.println("\n\n");
        }
    }
}
