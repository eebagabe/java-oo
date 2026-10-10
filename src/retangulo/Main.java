package src.retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(2, 4);
        Retangulo quadrado = new Retangulo(4);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perimetro do quadrado: " + quadrado.calcularPerimetro());

        System.out.println("Área do retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());
    }
}
