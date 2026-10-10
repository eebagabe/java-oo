public class ContaBancaria {
    private String titular;
    private double saldo;
    private static int totalContas = 0;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        totalContas++;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void getDetalhesUsuario() {
        System.out.println("O usuário: " + this.titular + " Possui: " + this.saldo + " Dólares.");
    }
}
