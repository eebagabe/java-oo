public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Ana";
        c1.depositar(100);
        c1.exibir();

        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "Bruno";
        c2.exibir();
    }
}
