package src.estoque;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Controle de TV", 5.00, 20);
        Produto p2 = new Produto("Gabinete", 300.00, 10);
        Produto p3 = new Produto("Fone de ouvido", 30.00, 50);

        p1.getValorTotalEmEstoque();
        p2.getValorTotalEmEstoque();
        p3.getValorTotalEmEstoque();

        p1.adicionarEstoque(100);
        p1.getValorTotalEmEstoque();
        p1.adicionarEstoque(1000);
        p1.removerEstoque(200);

        p1.getValorTotalEmEstoque();
    }

}
