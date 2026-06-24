public class Cafe extends Bebida{
    public void preparaBebida() {
        super.aqueceAgua();
        System.out.println("Coando o cafe");
    }

    public void adicionaCondimentos() {
        System.out.println("Adicionando acucar no cafe");
    }
}
