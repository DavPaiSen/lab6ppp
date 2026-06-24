public class Capuccino extends Bebida{
    Cafe cafe;

    public Capuccino(Cafe cafe) {
        this.cafe = cafe;
    }
    
    public void preparaBebida() {
        cafe.preparaBebida();
        cafe.colocarNaXicara();
        System.out.println("Colocando leite no cafe");
    }

    public void adicionaCondimentos() {
        System.out.println("Adicionando condimentos no capuccino");
    }
}
