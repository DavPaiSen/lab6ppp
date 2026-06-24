public abstract class Bebida {
    public void aqueceAgua() {
        System.out.println("Aquecendo agua!");
    }

    public void colocarNaXicara() {
        System.out.println("Colocando na xicara!");
    }

    public abstract void preparaBebida();

    public abstract void adicionaCondimentos();
}
