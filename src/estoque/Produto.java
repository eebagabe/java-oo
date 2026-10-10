package src.estoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            return;
        }

        System.out.println("Não dá para adicionar valor negativo");
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade <= 0) {
            System.out.println("Você não possui mais esse produto. Necessário comprar mais.");
            return;
        }

        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            return;
        }

        System.out.println("Valor insuficiente em estoque para ser removido.");

    }

    public void getValorTotalEmEstoque() {
        System.out.println(this.nome + " possui " + this.quantidade + " em estoque. Valor total: "
                + this.preco * this.quantidade + " reais");
        System.out.println("------------------------------||--------------------------");
    }
}
