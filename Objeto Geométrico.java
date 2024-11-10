package geometria;

abstract class ObjetoGeometrico {
    protected double area;
    protected double perimetro;
    protected String cor;

    public abstract double getArea();
    public abstract double getPerimetro();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

class Retangulo extends ObjetoGeometrico {
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double getArea() {
        area = comprimento * altura;
        return area;
    }

    public double getPerimetro() {
        perimetro = 2 * (comprimento + altura);
        return perimetro;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

public class GeometriaTest {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);
        System.out.println("Retângulo - Área: " + retangulo.getArea());
        System.out.println("Retângulo - Perímetro: " + retangulo.getPerimetro());
        retangulo.setCor("Azul");
        System.out.println("Retângulo - Cor: " + retangulo.getCor());
    }
}
