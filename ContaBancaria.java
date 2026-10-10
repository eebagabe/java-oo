public class ContaBancaria {
    // Atributos: o que a conta tem
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos: O que a conta faz
    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void exibir() {
        System.out.println(titular + " tem R$ " + saldo);
    }
}
