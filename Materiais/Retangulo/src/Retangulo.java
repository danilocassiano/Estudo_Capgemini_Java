public class Retangulo {

    private double largura;
    private double altura;

    // Construtor com um parâmetro (quadrado)
    public Retangulo(double lado) {
        largura = altura = lado;
        largura = 10;
        altura = 5;
    }

    // Construtor com dois parâmetros (retângulo)
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

}


