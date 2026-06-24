import java.util.ArrayList;

public class Main {
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
