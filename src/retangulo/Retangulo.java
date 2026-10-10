package src.retangulo;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Assumindo que envie apenas um lado, o objeto é um quadrado.
    public Retangulo(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }
}
