public class Cha extends Bebida{
    public void preparaBebida() {
        super.aqueceAgua();
        System.out.println("Colocando o saquinho no chá");
    }

    public void adicionaCondimentos() {
        System.out.println("Colocando acucar no cha");
    }
}
