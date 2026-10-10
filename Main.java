public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Gabriel", 0);
        ContaBancaria c2 = new ContaBancaria("Ana", 100.00);

        c1.getDetalhesUsuario();
        c2.getDetalhesUsuario();
    }
}
