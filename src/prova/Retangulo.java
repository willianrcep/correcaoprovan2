package prova;

public class Retangulo extends Figura implements IComum {
    public Retangulo(String cor) {
        super(cor);
        // TODO Auto-generated constructor stub
    }

    private double lado1;
    private double lado2;
    private double area;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Retangulo(String cor, double lado1, double lado2, double area) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
    }

    @Override
    public void area() {
        double areare = this.lado1 * this.lado2;
    }

}
